package com.example.uas_individu

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val negaralist = listOf<Negara>(
            Negara(
                R.drawable.indonesia,
                "Indonesia",
                "Lirik lagu indonesia raya adalah lagu nasiaonal yang diciptakan W.R Supratman 1924",
                R.raw.indonesia
            ),
            Negara(
                R.drawable.malaysia,
                "Malaysia",
                " Lagu kebangsaan milik Malaysia ini sering digadang-gadang mirip dengan lagu Terang Bulan milik musisi Indonesia, Saiful Bahri. Namun, ternyata benar adanya",
                R.raw.malaysia
            ),
            Negara(
                R.drawable.qatar,
                "Qatar",
                "As Salam al Amiri adalah lagu kebangsaan Qatar yang diperkenalkan pada 7 Desember 1996 sewaktu penabalan Amir Qatar, Syeikh Hamad bin Khalifa al-Thani",
                R.raw.qatar
            ),
            Negara(
                R.drawable.flipina,
                "Flipina",
                "Lagu ini disusun oleh Julián Felipe pada tahun 1898 dan liriknya diadaptasi dari puisi berbahasa Spanyol Filipinas karangan José Palma pada tahun 1899",
                R.raw.flipina
            ),
            Negara(
                R.drawable.china,
                "China",
                "Lirik lagu ditulis pada tahun 1934 oleh Tian Han, dan dibuatkan musiknya pada tahun 1935",
                R.raw.china
            ),
            Negara(
                R.drawable.japan,
                "Japan",
                "Kata-kata lagu ini merupakan doa bagi perdamaian dan kemakmuran abadi di Jepang.",
                R.raw.japan
            ),
            Negara(
                R.drawable.koreaselatan,
                "Korea Selatan",
                "Aegukga, yang berarti lagu ungkapan cinta terhadap negara mereka dalam bahasa Korea",
                R.raw.koreaselatan
            ),
            Negara(
                R.drawable.laos,
                "Laos",
                "Pheng Xat Lao adalah lagu kebangsaan negara Laos. Lagu Pheng Xat Lao ini diciptakan pada tahun 1941 oleh Dr. Thongdy Sounthonevichit",
                R.raw.laos
            ),
            Negara(
                R.drawable.meksiko,
                "Meksiko",
                "Himno Nacional Mexicano adalah lagu kebangsaan Meksiko yang mulai digunakan pada tahun 1854 dan mendapatkan status resminya pada tahun 1943",
                R.raw.meksiko
            ),
            Negara(
                R.drawable.maroko,
                "Maroko",
                "Hymne Cherifien (Arab: النشيد الوطني المغربي) merupakan sebuah lagu kebangsaan di Maroko. Lagu ini pertama kali dinyanyikan pada tahun 1970. Penulis lagu ini adalah Ali Squalli Houssaini",
                R.raw.maroko
            ),
            Negara(
                R.drawable.singapura,
                "Singapura",
                "Majulah Singapura (bahasa Inggris: Onward Singapore; Hanzi: 前进吧，新加坡; Tamil: முன்னேறட்டும் சிங்கப்பூர்) adalah lagu kebangsaan Singapura. Lagu ini digubah oleh Zubir Said pada tahun 1958 sebagai lagu untuk Dewan Kota Singapura.",
                R.raw.singapura
            ),
            Negara(
                R.drawable.spanyol,
                "Spanyol",
                "Marcha Real (Mars Kerajaan) adalah lagu kebangsaan Spanyol. Marcha Real adalah lagu yang agak tua di Eropa",
                R.raw.spanyol
            ),
            Negara(
                R.drawable.swiss,
                "Swiss",
                "Mazmur Swiss (bahasa Jerman: Schweizerpsalm, bahasa Prancis: Cantique suisse, bahasa Italia: Salmo svizzero, bahasa Romansh: Psalm svizzer) adalah lagu kebangsaan resmi Swiss. Lagu ini diciptakan pada tahun 1841, oleh Alberich Zwyssig (1808–1854)",
                R.raw.swiss
            ),
            Negara(
                R.drawable.yaman,
                "Yaman",
                "Republik Persatuan (bahasa Arab: الجمهورية المتحدة; al-Jumhūrīyah al-Muttaḥidâh), adalah lagu kebangsaan negara Yaman",
                R.raw.yaman
            ),
            Negara(
                R.drawable.uruguay,
                "Uruguay",
                "Himno Nacional merupakan lagu kebangsaan di Uruguay. Lagu ini pertama kali dinyanyikan pada tahun 1833. Penulis lagu ini adalah Francisco Acuña de Figueroa",
                R.raw.uruguay
            )
        )

        val recycleview = findViewById<RecyclerView>(R.id.rv_negara)
        recycleview.layoutManager = LinearLayoutManager(this)
        recycleview.setHasFixedSize(true)
        recycleview.adapter = NegaraAdapter(this,negaralist){
            val intent = Intent(this, DetailNegaraActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}