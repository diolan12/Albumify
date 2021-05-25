package com.netcode.songify.data.model

import com.netcode.songify.data.model.entity.AlbumEntity
import com.netcode.songify.data.model.entity.ArtistEntity

data class Song(
    val id: Int,
    val title: String,
    val album: AlbumEntity,
    val artist: ArtistEntity,
    val year: Int,
    val genre: String,
    val link: String,
    var liked: Boolean = false
)
