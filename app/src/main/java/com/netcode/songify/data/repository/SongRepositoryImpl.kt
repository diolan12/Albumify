package com.netcode.songify.data.repository

import com.netcode.songify.data.model.Album
import com.netcode.songify.data.model.Song
import com.netcode.songify.data.model.entity.AlbumEntity
import com.netcode.songify.data.model.entity.ArtistEntity
import com.netcode.songify.data.network.datasource.RestApiDataSource

class SongRepositoryImpl(
    private val restApiDataSource: RestApiDataSource
) : SongRepository {

    private fun getArtistWhereID(id: Int): ArtistEntity {
        val artists = restApiDataSource.fetchArtists()
        var artistEntity = artists.first()
        for (artist in artists) {
            if (id == artist.id) {
                artistEntity = artist
                break
            }
        }
        return artistEntity
    }

    private fun getAlbumWhereID(id: Int): AlbumEntity {
        val albums = restApiDataSource.fetchAlbums()
        var albumEntity = albums.first()
        for (album in albums) {
            if (id == album.id) {
                albumEntity = album
                break
            }
        }
        return albumEntity
    }

    override fun getAlbums(): ArrayList<Album> {
        val albums = restApiDataSource.fetchAlbums()
        val parsedAlbums= arrayListOf<Album>()
        for (album in albums) {
            parsedAlbums.add(
                Album(
                    id = album.id,
                    name = album.name,
                    art = album.art,
                    year = album.year,
                    link = album.link,
                    artist = getArtistWhereID(album.artist),
                    songs = getSongs().filter { it.album.id == album.id } as ArrayList<Song>
                )
            )
        }
        return parsedAlbums.sortedBy { it.name }.toMutableList() as ArrayList<Album>
    }

    override fun getAlbum(id: Int): Album {
        val albums = getAlbums()
        var album = albums.first()
        for (a in albums) {
            if (id == a.id) {
                album = a
                break
            }
        }
        return album
    }

    override fun getSongs(): ArrayList<Song> {
        val songs = restApiDataSource.fetchSongs()
        val parsedSongs = arrayListOf<Song>()
        for (song in songs) {
            parsedSongs.add(
                Song(
                    id = song.id,
                    title = song.title,
                    album = getAlbumWhereID(song.album),
                    artist = getArtistWhereID(song.artist),
                    year = song.year,
                    genre = song.genre,
                    liked = false,
                    link = song.link
                )
            )
        }
        return parsedSongs.sortedBy { it.title }.toMutableList() as ArrayList<Song>
    }

    override fun getSong(id: Int): Song {
        val songs = getSongs()
        var song = songs.first()
        for (s in songs) {
            if (id == s.id) {
                song = s
                break
            }
        }
        return song
    }

}