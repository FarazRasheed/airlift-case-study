package com.vw.movies.services.dataModels.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieItem(
    val body: String,
    val cardImages: List<CardImage> = listOf(),
    val cast: List<Cast> = listOf(),
    val cert: String,
    val `class`: String,
    val directors: List<Director> = listOf(),
    val duration: Int,
    val galleries: List<Gallery> = listOf(),
    val genres: List<String> = listOf(),
    val headline: String,
    val id: String,
    val keyArtImages: List<KeyArtImage> = listOf(),
    val lastUpdated: String,
    val quote: String,
    val rating: Int,
    val reviewAuthor: String,
    val sgUrl: String,
    val sgid: String,
    val skyGoId: String,
    val skyGoUrl: String,
    val sum: String,
    val synopsis: String,
    val url: String,
    val videos: List<Video> = listOf(),
    val viewingWindow: ViewingWindow,
    val year: String
): Parcelable