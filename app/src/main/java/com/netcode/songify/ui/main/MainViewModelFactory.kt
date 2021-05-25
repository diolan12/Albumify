package com.netcode.songify.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.netcode.songify.data.repository.SongRepository

class MainViewModelFactory(
    private val songRepository: SongRepository
): ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(songRepository) as T
    }
}