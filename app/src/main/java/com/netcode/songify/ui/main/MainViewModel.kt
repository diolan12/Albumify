package com.netcode.songify.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.netcode.songify.data.model.Song
import com.netcode.songify.data.repository.SongRepository

class MainViewModel(
    private val songRepository: SongRepository
): ViewModel() {

    fun getAlbums() = songRepository.getAlbums()

    fun getAlbum(id: Int) = songRepository.getAlbum(id)

    fun getSongs() = songRepository.getSongs()

    fun getSong(id: Int) = songRepository.getSong(id)

}