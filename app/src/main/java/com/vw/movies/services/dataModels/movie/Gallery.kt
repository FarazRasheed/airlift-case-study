package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Gallery(
    val id: String,
    val title: String,
    val url: String
): Parcelable