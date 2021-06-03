package com.netcode.songify.ui.main.albums.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.netcode.songify.R
import com.netcode.songify.data.model.Song
import com.netcode.songify.databinding.ActivityAlbumDetailBinding
import com.netcode.songify.internal.lazyViewModel
import com.netcode.songify.ui.main.MainViewModel
import com.netcode.songify.ui.main.MainViewModelFactory
import com.netcode.songify.ui.main.songs.SongsAdapter
import com.netcode.songify.ui.main.songs.detail.SongDetailActivity
import kotlinx.coroutines.launch
import org.kodein.di.DIAware
import org.kodein.di.android.closestDI
import org.kodein.di.instance

class AlbumDetailActivity: AppCompatActivity(), DIAware, SongsAdapter.OnItemClickListener {
    override val di by closestDI()

    private val mainViewModelFactory: MainViewModelFactory by instance()
    private lateinit var mainViewModel: MainViewModel

    private lateinit var binding: ActivityAlbumDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAlbumDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val art = intent.getIntExtra("art", R.drawable.blackpink_thealbum)

        Glide.with(this)
            .load(art)
            .into(binding.albumArt)

        val id = intent.getIntExtra("id", 1)

        mainViewModel = lazyViewModel(this, mainViewModelFactory)
        observe(id)
    }

    private fun observe(id: Int) = lifecycleScope.launch {
        val album = mainViewModel.getAlbum(id)
        binding.apply {
            albumName.text = album.name
            albumYear.text = album.year.toString()
            albumArtist.text = album.artist.name
            albumActionOpen.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(album.link)))
            }
            albumActionShare.setOnClickListener {
                val text = """
                    Hey, check this album "${album.name}" by ${album.artist.name}
                    
                    More info here: ${album.link}
                """.trimIndent()
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, text)
                    type = "text/plain"
                }

                Intent.createChooser(sendIntent, "Share ${album.name}").apply {
                    startActivity(this)
                }
            }
            initRecyclerView(album.songs.toMutableList() as ArrayList<Song>)
        }
    }

    private fun initRecyclerView(songs: ArrayList<Song>) {
        binding.songRv.apply {
            layoutManager = LinearLayoutManager(this@AlbumDetailActivity)
            adapter = SongsAdapter(songs, this@AlbumDetailActivity)
        }
    }

    override fun setOnClickListener(song: Song, pairs: List<Pair<View, String>>) {
        Intent(this, SongDetailActivity::class.java).apply {
            putExtra("id", song.id)
            putExtra("art", song.album.art)
            val option = ActivityOptionsCompat.makeSceneTransitionAnimation(this@AlbumDetailActivity,
                pairs[0])
            startActivity(this, option.toBundle())
        }
    }

}