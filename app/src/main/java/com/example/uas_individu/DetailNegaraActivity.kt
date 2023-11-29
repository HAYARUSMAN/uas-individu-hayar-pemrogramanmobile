package com.example.uas_individu

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailNegaraActivity : AppCompatActivity() {

    private lateinit var audio : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detail_negara)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val negara = intent.getParcelableExtra<Negara>(MainActivity.INTENT_PARCELABLE)

        val imgView = findViewById<ImageView>(R.id.img_item_photo)
        val txtTitle = findViewById<TextView>(R.id.item_name)
        val txtSub = findViewById<TextView>(R.id.item_description)
        audio = MediaPlayer.create(this,negara?.music!!)

        imgView.setImageResource(negara?.imgView!!)
        txtTitle.text = negara.txtTitle
        txtSub.text = negara.txtSub
        audio.start()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        audio.stop()
        return true
    }
}