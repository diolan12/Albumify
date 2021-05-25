package com.netcode.songify.ui.main.albums

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.util.Pair
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.netcode.songify.R
import com.netcode.songify.data.model.Album

class AlbumAdapter(
    private val albums: ArrayList<Album>,
    private val onItemClickListener: OnItemClickListener
): RecyclerView.Adapter<AlbumAdapter.AlbumItemHolder>() {

    inner class AlbumItemHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val art: ImageView = itemView.findViewById(R.id.item_album_art)
        val name: TextView = itemView.findViewById(R.id.item_album_name)
        val artist: TextView = itemView.findViewById(R.id.item_album_artist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumItemHolder {
        return AlbumItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_album, parent, false))
    }

    override fun onBindViewHolder(holder: AlbumItemHolder, position: Int) {
        val album = albums[position]

        holder.itemView.setOnClickListener {
            onItemClickListener.setOnClickListener(
                album = album,
                pairs = listOf(
                    Pair.create(holder.art, holder.art.transitionName)
                )
            )
        }

        Glide.with(holder.itemView.context)
            .load(album.art)
            .into(holder.art)

        holder.name.text = album.name
        holder.artist.text = album.artist.name
    }

    override fun getItemCount(): Int {
        return albums.size
    }

    interface OnItemClickListener {
        fun setOnClickListener(album: Album, pairs: List<Pair<View, String>>)
    }
}