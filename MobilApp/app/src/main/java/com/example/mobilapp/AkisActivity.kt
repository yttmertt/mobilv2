package com.example.mobilapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class AkisActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.akis_menu)

        val anaSayfaButton: ImageButton = findViewById(R.id.anasayfa_buton)
        val aramaButton: ImageButton = findViewById(R.id.arama_buton)
        val mesajlarButton: ImageButton = findViewById(R.id.mesajlar_buton)
        val bildirimlerButton: ImageButton = findViewById(R.id.bildirimler_buton)
        val profilButton: ImageButton = findViewById(R.id.profil_buton)

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

        bildirimlerButton.setOnClickListener {
            val bildirim = Intent(this, BildirimlerActivity::class.java)
            startActivity(bildirim)
        }

        profilButton.setOnClickListener {
            val profil = Intent(this, ProfilActivity::class.java)
            startActivity(profil)
        }

        val gundemButton = findViewById<Button>(R.id.gundem_buton)
        val debeButton = findViewById<Button>(R.id.debe_button)
        val takipButton = findViewById<Button>(R.id.takip_buton)
        val tarihteBugunButton = findViewById<Button>(R.id.tarihtebugun_buton)

        gundemButton.setOnClickListener {
            val gundem = Intent(this, GundemActivity::class.java)
            startActivity(gundem)
        }
        debeButton?.setOnClickListener {
            val debe = Intent(this, DebeActivity::class.java)
            startActivity(debe)
        }
        takipButton?.setOnClickListener {
            val takip = Intent(this, TakipActivity::class.java)
            startActivity(takip)
        }
        tarihteBugunButton?.setOnClickListener {
            val tarih = Intent(this, TarihteBugunActivity::class.java)
            startActivity(tarih)
        }
    }
}
