package com.netcode.songify

import android.app.Application
import com.netcode.songify.data.network.datasource.RestApiDataSource
import com.netcode.songify.data.network.datasource.RestApiDataSourceImpl
import com.netcode.songify.data.repository.SongRepository
import com.netcode.songify.data.repository.SongRepositoryImpl
import com.netcode.songify.ui.main.MainViewModelFactory
import org.kodein.di.*
import org.kodein.di.android.x.androidXModule

class SongifyApplication: Application(), DIAware {
    override val di = DI.lazy {
        import(androidXModule(this@SongifyApplication))

        bind<RestApiDataSource> { singleton { RestApiDataSourceImpl() } }

        bind<SongRepository> { singleton { SongRepositoryImpl(instance()) } }

        bind { provider { MainViewModelFactory(instance()) } }
    }
}