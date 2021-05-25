package com.netcode.songify.data.model

import com.netcode.songify.data.model.entity.AlbumEntity
import com.netcode.songify.data.model.entity.SongEntity

data class Artist(
    val id: Int,
    val name: String,
    val bio: String,
    val link: String,
    val albums: List<AlbumEntity>,
    val songs: List<SongEntity>
)
