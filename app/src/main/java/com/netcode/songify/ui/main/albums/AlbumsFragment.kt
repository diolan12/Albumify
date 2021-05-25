package com.netcode.songify.ui.main.albums

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.recyclerview.widget.GridLayoutManager
import com.netcode.songify.data.model.Album
import com.netcode.songify.databinding.FragmentAlbumsBinding
import com.netcode.songify.internal.CoroutineFragment
import com.netcode.songify.internal.lazyViewModel
import com.netcode.songify.ui.main.MainViewModel
import com.netcode.songify.ui.main.MainViewModelFactory
import com.netcode.songify.ui.main.albums.detail.AlbumDetailActivity
import org.kodein.di.DIAware
import org.kodein.di.android.x.closestDI
import org.kodein.di.instance

class AlbumsFragment : CoroutineFragment(), DIAware, AlbumAdapter.OnItemClickListener {
    override val di by closestDI()

    private val mainViewModelFactory: MainViewModelFactory by instance()
    private lateinit var mainViewModel: MainViewModel

    private var _binding: FragmentAlbumsBinding? = null

    private var albums = arrayListOf<Album>()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainViewModel = lazyViewModel(this, mainViewModelFactory)

        _binding = FragmentAlbumsBinding.inflate(inflater, container, false)

        binding.albumRv.setHasFixedSize(true)
        albums.clear()
        albums.addAll(mainViewModel.getAlbums())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.albumRv.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = AlbumAdapter(albums, this@AlbumsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun setOnClickListener(album: Album, pairs: List<Pair<View, String>>) {
        Intent(requireContext(), AlbumDetailActivity::class.java).apply {
            putExtra("id", album.id)
            putExtra("art", album.art)
            val option = ActivityOptionsCompat.makeSceneTransitionAnimation(requireActivity(),
            pairs[0])
            startActivity(this, option.toBundle())
        }
    }
}