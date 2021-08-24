package com.sundram.kotlinfirstproject.datamodel

import com.google.gson.annotations.SerializedName

data class Search(
    @field:SerializedName("Title") val title: String,
    @field:SerializedName("Year") val year: String,
    @field:SerializedName("imdbID") val imdbID: String,
    @field:SerializedName("Type") val type: String,
    @field:SerializedName("Poster") val poster: String
)