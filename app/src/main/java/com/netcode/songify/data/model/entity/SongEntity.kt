package com.netcode.songify.data.model.entity

data class SongEntity(
    val id: Int,
    val title: String,
    val album: Int,
    val artist: Int,
    val year: Int,
    val genre: String,
    val link: String
)
