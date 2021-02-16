package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Director(
    val name: String
): Parcelable