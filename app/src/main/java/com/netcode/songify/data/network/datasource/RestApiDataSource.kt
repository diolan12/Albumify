package com.netcode.songify.data.network.datasource

import com.netcode.songify.data.model.entity.AlbumEntity
import com.netcode.songify.data.model.entity.ArtistEntity
import com.netcode.songify.data.model.entity.SongEntity

interface RestApiDataSource {
    fun fetchArtists(): ArrayList<ArtistEntity>
    fun fetchAlbums(): ArrayList<AlbumEntity>
    fun fetchSongs(): ArrayList<SongEntity>
}