package com.netcode.songify.data.repository

import com.netcode.songify.data.model.Album
import com.netcode.songify.data.model.Song

interface SongRepository {

    fun getAlbums(): ArrayList<Album>

    fun getAlbum(id: Int): Album

    fun getSongs(): ArrayList<Song>

    fun getSong(id: Int): Song

}