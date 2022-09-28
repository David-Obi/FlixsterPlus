package com.example.flixster

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single movie from the MoviesDB API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("poster_path")
    var posterPath : String? = null

}