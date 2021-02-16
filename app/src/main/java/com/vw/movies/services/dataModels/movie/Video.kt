package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Video(
    val alternatives: List<Alternative>,
    val title: String,
    val type: String,
    val url: String
): Parcelable