package com.netcode.songify.data.network.datasource

import com.netcode.songify.R
import com.netcode.songify.data.model.entity.AlbumEntity
import com.netcode.songify.data.model.entity.ArtistEntity
import com.netcode.songify.data.model.entity.SongEntity
import com.netcode.songify.internal.Constant

class RestApiDataSourceImpl : RestApiDataSource {
    override fun fetchArtists(): ArrayList<ArtistEntity> {
        return arrayListOf(
            ArtistEntity(
                id = 1,
                name = "BLACKPINK",
                bio = "Black Pink, ditulis bergaya sebagai BLACKPINK atau BLΛƆKPIИK, adalah sebuah grup penyanyi perempuan Korea Selatan yang dibentuk oleh YG Entertainment, terdiri dari para anggota seperti Jisoo, Jennie, Rosé, dan Lisa. Grup ini debut pada tanggal 8 Agustus 2016, dengan single mereka berjudul Square One, yang menghasilkan \"Whistle,\" lagu nomor satu pertama mereka di Korea Selatan. Single ini juga menghasilkan \"Boombayah\", single nomor satu pertama mereka di tangga lagu Billboard World Digital Songs, yang mendapat rekor sebagai video musik debut yang paling banyak ditonton oleh artis Korea. Dengan sukses komersial mereka di lima bulan pertama, mereka memperoleh New Artist of the Year di 31st Golden Disc Awards dan 26th Seoul Music Awards. Black Pink merupakan artis K-pop perempuan yang mempunyai lagu di posisi tertinggi di Billboard Hot 100, berada di nomor 55 dengan \"Ddu-Du Ddu-Du\", dan di Billboard 200, berada di nomor 40 dengan EP berjudul Square Up. Mereka merupakan grup K-pop perempuan pertama dan satu-satunya yang memasuki dan memuncaki tangga lagu Emerging Artists Billboard.'",
                link = "https://music.youtube.com/channel/UCkbbMCA40i18i7UdjayMPAg"
            ),
            ArtistEntity(
                id = 2,
                name = "The Weeknd",
                bio = "Abel Makkonen Tesfaye, yang lebih dikenal dengan nama panggung The Weeknd, adalah seorang penyanyi, penulis lagu dan produser rekaman Kanada. Pada akhir 2010, Tesfaye secara anonim mengunggah beberapa lagu ke YouTube dengan nama \"The Weeknd\". Ia merilis tiga mixtapes sembilan lagu sepanjang 2011: House of Balloons, Thursday dan Echoes of Silence, yang meraih sambutan meriah. Pada 2012, ia merilis sebuah album kompilasi Trilogy, tiga puluh lagu yang terdiri dari mixtape yang dimaster ulang dan tiga lagu tambahan. Album tersebut dirilis di bawah label Republic Records dan labelnya sendiri XO. Pada 2013, ia merilis album studio debutnya Kiss Land, yang didukung oleh singel-singel \"Kiss Land\" dan \"Live For\". Album keduanya, Beauty Behind the Madness, yang menjadi album nomor satu pertamanya di Billboard 200 AS, meliputi singel nomor tiga \"Earned It\" dan memproduksi singel-singel nomor satu \"The Hills\" dan \"Can't Feel My Face\". Lagu-lagu tersebut masuk tiga besar di tangga lagu Hot R&B Songs Billboard, menjadikannya artis pertama dalam sejarah yang mencapainya. The Weeknd memenangkan dua Grammy Award dan sembilan Juno Award.",
                link = "https://music.youtube.com/channel/UClYV6hHlupm_S_ObS1W-DYw"
            ),
            ArtistEntity(
                id = 3,
                name = "Nadin Amizah",
                bio = "Nadin Amizah adalah penyanyi dan penulis lagu berkebangsaan Indonesia. Saat ini Nadin berdomisili di Pondok Gede Bekasi.",
                link = "https://music.youtube.com/channel/UCZhZaUHxvz-cxWFhYaWKmtw"
            ),
            ArtistEntity(
                id = 4,
                name = "JENNIE",
                bio = "",
                link = "https://music.youtube.com/channel/UCAl7xQ6q0PEgZMQD7zr4AKQ"
            ),
            ArtistEntity(
                id = 5,
                name = "Bazzi",
                bio = "Andrew Bazzi atau yang dikenal dengan Bazzi adalah seorang penyanyi, penulis lagu dan produser rekaman asal Amerika Serikat.",
                link = "https://music.youtube.com/channel/UCoBD_yd06t7kBn1wLGH7nzg"
            ),
            ArtistEntity(
                id = 6,
                name = "AC/DC",
                bio = "AC/DC adalah grup musik hard rock yang dibentuk di Sydney, Australia pada November 1973 oleh gitaris irama Malcolm Young dan saudaranya gitaris utama Angus Young. Grup musik ini telah menjual lebih dari 150 juta keping album di seluruh dunia. Album mereka dari tahun 1980, Back in Black, terjual 42 juta keping di dunia. Grup musik ini telah memiliki dua penyanyi utama, dan penggemarnya terbagi dua antara penggemar \"era Bon Scott\", dan \"era Brian Johnson\".",
                link = "https://music.youtube.com/channel/UCVm4YdI3hobkwsHTTOMVJKg"
            ),
            ArtistEntity(
                id = 7,
                name = "KISS",
                bio = "Kiss adalah salah satu grup musik rock and roll asal Amerika Serikat. Mereka telah menjual jutaan keping album dan mengadakan konser di seluruh dunia. Salah satu ciri khas mereka adalah Make-up yang digunakan sampai Sekarang, dengan masing-masing anggota memiliki identitas masing-masing.",
                link = "https://music.youtube.com/channel/UCL0dlEc0rXV1CIawUKeme4g"
            ),
            ArtistEntity(
                id = 8,
                name = "Lil Nas X",
                bio = "Montero Lamar Hill, dikenal secara profesional sebagai Lil Nas X, adalah seorang rapper, penyanyi dan penulis lagu Amerika. Dia mendapat perhatian internasional untuk singel rap countrynya \"Old Town Road\", yang pertama kali mencapai popularitas viral pada aplikasi berbagi video mikro-platform TikTok pada awal 2019, dan mendapat sertifikasi Diamond pada November tahun yang sama. Lagu ini mencapai nomor satu di US Billboard Hot 100 dan tetap berada di sana selama sembilan belas minggu, yang terlama untuk sebuah lagu sejak grafik dimulai pada tahun 1958. Pada Juni 2019, Nas X melela sebagai gay, satu-satunya artis yang pernah melakukannya sambil memiliki rekor nomor satu. \"Old Town Road\" membuatnya mendapatkan dua MTV Video Music Awards termasuk Song of the Year, Penghargaan Musik Amerika untuk Lagu Rap / Hip Hop Favorit, dan Nas X adalah satu-satunya artis LGBTQ yang secara terbuka memenangkan penghargaan Country Music Association. Dia telah dinominasikan untuk enam Grammy Awards, terbanyak untuk pria manapun pada tahun 2019, termasuk Record of the Year, Album of the Year dan Best New Artist.",
                link = "https://music.youtube.com/channel/UCCF_6PwrZf1u70yghKms3Mw"
            ),
            ArtistEntity(
                id = 9,
                name = "Post Malone",
                bio = "Austin Richard Post, dikenal secara profesional sebagai Post Malone, adalah penyanyi-penulis lagu, rapper dan produser rekaman Amerika. Dikenal karena penulisan lagunya yang introspektif dan gaya vokal yang singkat, Malone mendapat pujian karena membengkokkan beragam genre termasuk country, grunge, hip hop, dan R&B. Dia pertama kali mendapatkan pengakuan pada tahun 2015 setelah perilisan singel debutnya \"White Iverson\". Dia kemudian menandatangani kontrak rekaman dengan Republic Records. Album debut Malone Stoney sukses secara komersial dan menampilkan singel hit \"Congratulations\". Pada tahun 2018, album ini memecahkan rekor untuk minggu terbanyak di tangga lagu Amerika Serikat Billboard Top R&B/Hip-Hop Albums setelah mencapai minggu ke-77 di tangga lagu. Album keduanya, Beerbongs & Bentleys, memulai debut di nomor satu di Billboard 200 dan memecahkan beberapa rekor streaming saat dirilis. Menampilkan singel nomor satu Billboard Hot 100 \"Rockstar\" dan \"Psycho\", album ini dinominasikan untuk Album of the Year di Penghargaan Grammy 2018.",
                link = "https://music.youtube.com/channel/UCyD3XWRK9ko-izf2nBSFitw"
            ),
            ArtistEntity(
                id = 10,
                name = "Payung Teduh",
                bio = "Payung Teduh merupakan band alternatif/ indie Indonesia beraliran fusi antara folk, keroncong, dan jazz. Payung Teduh terbentuk pada akhir 2007 dengan formasi awal Is dan Comi. Pada tahun 2008, Payung Teduh mengajak Cito untuk bergabung bersama sebagai drummer, lalu mengajak Ivan sebagai pemain gitarlele dan pemain terompet pada tahun 2010. Angin Pujaan Hujan ialah lagu pertama yang memunculkan warna mereka sendiri. Seiring berjalannya waktu tercipta pula lagu-lagu lainnya seperti Kucari Kamu, Amy, Untuk Perempuan Yang Sedang Dalam Pelukan, juga termasuk karya-karya dari pementasan teater bersama Catur Ari Wibowo seperti Resah, Cerita tentang Gunung dan Laut, serta karya Amalia Puri yang berjudul Tidurlah dan Malam. Pada akhirnya Payung Teduh memutuskan untuk membuat album indie pertamanya yang dirilis di penghujung 2010. Pada akhir tahun 2017 Mohammad Istiqamah Djamad memutuskan untuk keluar dari Payung Teduh karena dirinya sudah merasa tidak lagi sejalan dengan band.",
                link = "https://music.youtube.com/channel/UCHFN6KKjg7pNeNkGEoH_WNQ"
            )
        )
    }
    override fun fetchAlbums(): ArrayList<AlbumEntity> {
        return arrayListOf(
            AlbumEntity(
                id = 1,
                name = "The Album",
                art = R.drawable.blackpink_thealbum,
                year = 2020,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_m1OQNnyJAlg50n3C_TywdGIbF7fki4PmA",
                artist = 1
            ),
            AlbumEntity(
                id = 2,
                name = "Starboy",
                art = R.drawable.the_weeknd___starboy,
                year = 2016,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_nl-XrT4Q4vuhtuzHGfIuY5a0Rao4J8LdM",
                artist = 2
            ),
            AlbumEntity(
                id = 3,
                name = "Selamat Ulang Tahun",
                art = R.drawable.nadin_selamat_ultah,
                year = 2020,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_lGT07S2U6qtXXc1UO5Vgm5ZJZ4cnNM6g4",
                artist = 3
            ),
            AlbumEntity(
                id = 4,
                name = "Single",
                art = R.drawable.jennie_solo,
                year = 2018,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_ntjX6DnksJblOpMIjVakazRbOAhpqy8FE",
                artist = 4
            ),
            AlbumEntity(
                id = 5,
                name = "COSMIC",
                art = R.drawable.bazzi_cosmic,
                year = 2018,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_nLwYJKnEBdKa3bGRq0LIqjcH_lHHgjNnE",
                artist = 5
            ),
            AlbumEntity(
                id = 6,
                name = "The Razors Edge",
                art = R.drawable.acdc_razor_edge,
                year = 1990,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_lJ-FMxRxV5G3qhTT1Rw4-pKqcPvUXWj_Y",
                artist = 6
            ),
            AlbumEntity(
                id = 7,
                name = "Dynasty",
                art = R.drawable.kiss_dynasty,
                year = 1979,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_nLGOw3fZnXsrwO5huYGqeGB8HmP9kA1vw",
                artist = 7
            ),
            AlbumEntity(
                id = 8,
                name = "7 EP",
                art = R.drawable.lil_nas_x_7_ep,
                year = 2019,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_kKyTvMv4DutLhJ82LS0CZOkQf-si-HoBI",
                artist = 8
            ),
            AlbumEntity(
                id = 9,
                name = "Beerbongs & Bentleys",
                art = R.drawable.post_malone_beerbongs_and_bentleys,
                year = 2018,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_lwKdXLFF5NrlYH1ety26REn4jD64mYCfU",
                artist = 9
            ),
            AlbumEntity(
                id = 10,
                name = "Dunia Batas",
                art = R.drawable.payung_teduh_dunia_batas,
                year = 2012,
                link = "https://music.youtube.com/playlist?list=OLAK5uy_kPgw9TmbnuCqFzF0wrmeodq6OejJ0OwHo",
                artist = 10
            )
        )
    }

    override fun fetchSongs(): ArrayList<SongEntity> {
        return arrayListOf(
            SongEntity(
                id = 1,
                title = "Lovesick Girls",
                album = 1,
                artist = 1,
                year = 2018,
                genre = Constant.GENRE_KPOP,
                link = "https://music.youtube.com/watch?v=D8RZbI1jfQ0&feature=share"
            ),
            SongEntity(
                id = 2,
                title = "I Feel It Coming (feat. Daft Punk)",
                album = 2,
                artist = 2,
                year = 2016,
                genre = Constant.GENRE_POP,
                link = "https://music.youtube.com/watch?v=qPRNIHxLhmc&feature=share"
            ),
            SongEntity(
                id = 3,
                title = "Bertaut",
                album = 3,
                artist = 3,
                year = 2020,
                genre = Constant.GENRE_ALTINDIE,
                link = "https://music.youtube.com/watch?v=Xh93FL06JwQ&feature=share"
            ),
            SongEntity(
                id = 4,
                title = "SOLO",
                album = 4,
                artist = 4,
                year = 2018,
                genre = Constant.GENRE_KPOP,
                link = "https://music.youtube.com/watch?v=4-4COoO5Qdg&feature=share"
            ),
            SongEntity(
                id = 5,
                title = "Why",
                album = 5,
                artist = 5,
                year = 2018,
                genre = Constant.GENRE_POP,
                link = "https://music.youtube.com/watch?v=uZdhFN7xQJY&feature=share"
            ),
            SongEntity(
                id = 6,
                title = "Thunderstruck",
                album = 6,
                artist = 6,
                year = 1990,
                genre = Constant.GENRE_ROCK,
                link = "https://music.youtube.com/watch?v=ikFFVfObwss&feature=share"
            ),
            SongEntity(
                id = 7,
                title = "I Was Made For Lovin' You",
                album = 7,
                artist = 7,
                year = 1979,
                genre = Constant.GENRE_ROCK,
                link = "https://music.youtube.com/watch?v=12fJAnaif34&feature=share"
            ),
            SongEntity(
                id = 8,
                title = "Panini",
                album = 8,
                artist = 8,
                year = 2019,
                genre = Constant.GENRE_HIPHOP,
                link = "https://music.youtube.com/watch?v=bG_NI-cCxDs&feature=share"
            ),
            SongEntity(
                id = 9,
                title = "Candy Paint",
                album = 9,
                artist = 9,
                year = 2018,
                genre = Constant.GENRE_HIPHOP,
                link = "https://music.youtube.com/watch?v=qtgf-sidZrU&feature=share"
            ),
            SongEntity(
                id = 10,
                title = "Menuju Senja",
                album = 10,
                artist = 10,
                year = 2010,
                genre = Constant.GENRE_FOLK,
                link = "https://music.youtube.com/watch?v=rRBJfpmYN08&feature=share"
            )
        )
    }
}