package com.netcode.songify.internal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

// lazy view-model
inline fun <reified ViewModelT : ViewModel> lazyViewModel(
    owner: ViewModelStoreOwner,
    factory: ViewModelProvider.NewInstanceFactory? = null
): ViewModelT {
    return if (factory == null) {
        ViewModelProvider(owner).get(ViewModelT::class.java)
    } else {
        ViewModelProvider(owner, factory).get(ViewModelT::class.java)
    }
}