package com.netcode.songify.data.model

import com.netcode.songify.data.model.entity.ArtistEntity
import com.netcode.songify.data.model.entity.SongEntity

data class Album(
    val id: Int,
    val name: String,
    val art: Int,
    val year: Int,
    val link: String,
    val artist: ArtistEntity,
    val songs: ArrayList<Song>
)
