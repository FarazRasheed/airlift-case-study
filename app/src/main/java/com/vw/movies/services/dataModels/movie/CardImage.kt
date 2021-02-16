package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CardImage(
    val h: Double,
    val url: String = "",
    val w: Double
): Parcelable