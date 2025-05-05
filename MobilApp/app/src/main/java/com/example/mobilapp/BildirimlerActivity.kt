package com.example.mobilapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class BildirimlerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.bildirim_menu)

        // Alt Butonlar
        val anaSayfaButton: ImageButton = findViewById(R.id.anasayfa_buton)
        val aramaButton: ImageButton = findViewById(R.id.arama_buton)
        val mesajlarButton: ImageButton = findViewById(R.id.mesajlar_buton)
        val profilButton: ImageButton = findViewById(R.id.profil_buton)

        // Ana Sayfa butonu tıklama olayı (zaten aynı ekrandayız, bu yüzden bir şey yapmaya gerek yok)
        anaSayfaButton.setOnClickListener {
            val anaSayfa = Intent(this, MainActivity::class.java)
            startActivity(anaSayfa)
        }

        aramaButton.setOnClickListener {
            val arama = Intent(this, AramaActivity::class.java)
            startActivity(arama)
        }

        mesajlarButton.setOnClickListener {
            val mesaj = Intent(this, MesajlarActivity::class.java)
            startActivity(mesaj)
        }

        profilButton.setOnClickListener {
            val profil = Intent(this, ProfilActivity::class.java)
            startActivity(profil)
        }
    }
}
