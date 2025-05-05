package com.example.mobilapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AramaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.arama_menu)

        val anaSayfaButton: ImageButton = findViewById(R.id.anasayfa_buton)
        val mesajlarButton: ImageButton = findViewById(R.id.mesajlar_buton)
        val bildirimlerButton: ImageButton = findViewById(R.id.bildirimler_buton)
        val profilButton: ImageButton = findViewById(R.id.profil_buton)

        anaSayfaButton.setOnClickListener {
            val anaSayfa = Intent(this, MainActivity::class.java)
            startActivity(anaSayfa)
        }

        mesajlarButton.setOnClickListener {
            val mesaj = Intent(this, MesajlarActivity::class.java)
            startActivity(mesaj)
        }

        bildirimlerButton.setOnClickListener {
            val bildirim = Intent(this, BildirimlerActivity::class.java)
            startActivity(bildirim)
        }

        profilButton.setOnClickListener {
            val profil = Intent(this, ProfilActivity::class.java)
            startActivity(profil)
        }

    }
}
