package com.netcode.songify.ui.main.songs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.recyclerview.widget.LinearLayoutManager
import com.netcode.songify.data.model.Song
import com.netcode.songify.databinding.FragmentSongsBinding
import com.netcode.songify.internal.CoroutineFragment
import com.netcode.songify.internal.lazyViewModel
import com.netcode.songify.ui.main.MainViewModel
import com.netcode.songify.ui.main.MainViewModelFactory
import com.netcode.songify.ui.main.songs.detail.SongDetailActivity
import org.kodein.di.DIAware
import org.kodein.di.android.x.closestDI
import org.kodein.di.instance

class SongsFragment : CoroutineFragment(), DIAware, SongsAdapter.OnItemClickListener {
    override val di by closestDI()

    private val mainViewModelFactory: MainViewModelFactory by instance()
    private lateinit var mainViewModel: MainViewModel

    private var _binding: FragmentSongsBinding? = null

    private var songs = arrayListOf<Song>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainViewModel = lazyViewModel(this, mainViewModelFactory)

        _binding = FragmentSongsBinding.inflate(inflater, container, false)

        binding.songRv.setHasFixedSize(true)
        songs.clear()
        songs.addAll(mainViewModel.getSongs())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.songRv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = SongsAdapter(songs, this@SongsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun setOnClickListener(song: Song, pairs: List<Pair<View, String>>) {
        Intent(requireContext(), SongDetailActivity::class.java).apply {
            putExtra("id", song.id)
            putExtra("art", song.album.art)
            val option = ActivityOptionsCompat.makeSceneTransitionAnimation(requireActivity(),
                pairs[0])
            startActivity(this, option.toBundle())
        }
    }

}