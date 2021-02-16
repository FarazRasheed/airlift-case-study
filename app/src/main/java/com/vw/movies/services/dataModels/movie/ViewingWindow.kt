package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ViewingWindow(
    val endDate: String = "",
    val startDate: String = "",
    val title: String,
    val wayToWatch: String
): Parcelable