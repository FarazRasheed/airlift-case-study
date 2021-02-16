package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KeyArtImage(
    val h: Int,
    val url: String,
    val w: Int
): Parcelable