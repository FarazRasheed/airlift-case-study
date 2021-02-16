package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Alternative(
    val quality: String,
    val url: String
): Parcelable