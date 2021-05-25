package com.netcode.songify.ui.main.songs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.util.Pair
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.netcode.songify.R
import com.netcode.songify.data.model.Song

class SongsAdapter(
    private val songs: ArrayList<Song>,
    private val onItemClickListener: OnItemClickListener
): RecyclerView.Adapter<SongsAdapter.SongItemHolder>() {
    inner class SongItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.item_song_title)
        var artistAlbum: TextView = itemView.findViewById(R.id.item_song_artist_album)
        var art: ImageView = itemView.findViewById(R.id.item_song_art)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongItemHolder {
        return SongItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false))
    }

    override fun onBindViewHolder(holder: SongItemHolder, position: Int) {
        val song = songs[position]

        holder.itemView.setOnClickListener {
            onItemClickListener.setOnClickListener(
                song = song,
                pairs = listOf(
                    Pair.create(holder.art, holder.art.transitionName),
                    Pair.create(holder.title, holder.title.transitionName)
                )
            )
        }

        Glide.with(holder.itemView.context)
            .load(song.album.art)
            .into(holder.art)

        holder.title.text = song.title
        holder.artistAlbum.text = "${song.artist.name} - ${song.album.name}"
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    interface OnItemClickListener {
        fun setOnClickListener(song: Song, pairs: List<Pair<View, String>>)
    }

}