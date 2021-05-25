package com.netcode.songify.ui.main.songs.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.netcode.songify.R
import com.netcode.songify.databinding.ActivitySongDetailBinding
import com.netcode.songify.internal.CoroutineActivity
import com.netcode.songify.internal.lazyViewModel
import com.netcode.songify.ui.main.MainViewModel
import com.netcode.songify.ui.main.MainViewModelFactory
import kotlinx.coroutines.launch
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.android.closestDI
import org.kodein.di.instance

class SongDetailActivity: CoroutineActivity(), DIAware {
    override val di by closestDI()

    private val mainViewModelFactory: MainViewModelFactory by instance()
    private lateinit var mainViewModel: MainViewModel

    private lateinit var binding: ActivitySongDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySongDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val art = intent.getIntExtra("art", R.drawable.blackpink_thealbum)

        Glide.with(this)
            .load(art)
            .into(binding.songArt)

        val id = intent.getIntExtra("id", 1)

        mainViewModel = lazyViewModel(this, mainViewModelFactory)
        observe(id)
    }

    private fun observe(id: Int) = launch {
        val song = mainViewModel.getSong(id)
        binding.apply {
            songTitle.text = song.title
            songAlbum.text = song.album.name
            songGenre.text = song.genre
            songYear.text = song.year.toString()
            songArtist.text = song.artist.name
            songActionPlay.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(song.link)))
            }
            songActionShare.setOnClickListener {
                val text = """
                    Hey, check this song "${song.title}" by ${song.artist.name}
                    
                    Listen here: ${song.link}
                """.trimIndent()
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, text)
                    type = "text/plain"
                }

                Intent.createChooser(sendIntent, "Share ${song.title}").apply {
                    startActivity(this)
                }
            }
        }
    }

}