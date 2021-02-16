package com.vw.movies.ui.home

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.observe
import com.vw.movies.R
import com.vw.movies.databinding.ActivityMovieListBinding
import com.vw.movies.services.dataModels.movie.Movie
import com.vw.movies.ui.base.BaseActivity
import com.vw.movies.utils.ProgressHUD
import com.vw.movies.utils.Validation
import com.vw.movies.utils.showSnackBar
import kotlinx.android.synthetic.main.activity_movie_list.*
import javax.inject.Inject

class MovieListActivity : BaseActivity<ActivityMovieListBinding, MoviesViewModel>() {

    override fun getViewModelClass(): Class<MoviesViewModel> = MoviesViewModel::class.java

    @Inject
    lateinit var progressHUD: ProgressHUD
    override fun layoutId(): Int = R.layout.activity_movie_list

    @Inject
    lateinit var adapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        setListeners()
    }

    private fun initViews() {
        rvMovies.adapter = adapter
    }

    private fun setListeners() {
        when {
            Validation.isConnected(this) -> {
                viewModel.getList()
                setObservables()
            }
        }
    }

    private fun setObservables() {
        viewModel.getListResponse().observe(this) {
            when (it) {
                is String -> {
                    showSnackBar(rootView, it)
                }
                is Movie -> {
                    val movies: Movie = it as Movie
                    if (!movies.isNullOrEmpty()) {
                        adapter.updateList(movies)
                    } else {
                        showSnackBar(rootView, getString(R.string.no_data))
                    }

                }
            }
        }



        viewModel.isLoading.observe(this) {
            try {
                if (it) showLoader(this.progressHUD) else hideLoader(this.progressHUD)
            } catch (e: Exception) {
                Log.e("error:", e.toString() + "")
            }
        }
    }
}
