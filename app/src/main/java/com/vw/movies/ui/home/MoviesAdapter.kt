package com.vw.movies.ui.home

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.*
import com.vw.movies.R
import com.vw.movies.databinding.ItemMovieBinding
import com.vw.movies.services.dataModels.movie.MovieItem
import com.vw.movies.utils.navigateActivity

open class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    var list: List<MovieItem> = arrayListOf()

    override fun getItemCount(): Int {
        return list.size
    }

    var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_movie, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            bind(list[position], clickListener(list[position]))
        }
    }

    private fun clickListener(item: MovieItem): View.OnClickListener {
        return View.OnClickListener {
            movieItem = item
           navigateActivity(MovieDetailActivity::class.java, context as Activity, false)
        }
    }

    inner class ViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MovieItem, clickListener: View.OnClickListener) {
            with(binding) {
                try {
                    unit = item
                    listener = clickListener
                    executePendingBindings()
                } catch (ex: Exception) {
                    Log.e("ASSESSMENT_LIST_ERROR","$ex")
                }
            }
        }
    }

    fun updateList(newList: ArrayList<MovieItem>) {
        (list as ArrayList).clear()
        (list as ArrayList).addAll(newList)
        notifyDataSetChanged()
    }

    companion object{
        lateinit var movieItem: MovieItem
    }
}