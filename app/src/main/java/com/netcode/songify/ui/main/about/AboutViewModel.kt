package com.netcode.songify.ui.main.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.netcode.songify.R

class AboutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text

    private val _profile = MutableLiveData<Profile>().apply {
        value = Profile(
            name = "Dio Lantief Widoyoko",
            email = "dio_lantief21@outlook.com",
            profile = R.drawable.dicoding_profile,
            link = "https://www.dicoding.com/users/diolan12"
        )
    }

    val profile: LiveData<Profile> = _profile

    data class Profile(
        val name: String,
        val email: String,
        val profile: Int,
        val link: String
    )
}