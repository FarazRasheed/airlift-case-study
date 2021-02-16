package com.vw.movies

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.vw.movies.CustomAssertions.Companion.hasItemCount
import com.vw.movies.CustomMatchers.Companion.withItemCount
import com.vw.movies.ui.home.MovieListActivity
import org.junit.Rule
import org.junit.Test

class MoviesList {
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MovieListActivity>(MovieListActivity::class.java)

    @Test
    fun countPrograms() {
        onView(withId(R.id.rvMovies))
            .check(matches(withItemCount(12)))
    }

    @Test
    fun countProgramsWithViewAssertion() {
        onView(withId(R.id.rvMovies))
            .check(hasItemCount(12))
    }
}