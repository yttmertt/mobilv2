package com.example.mobilapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class GundemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gundem_menu)

        // Alt Butonlar
        val anaSayfaButton: ImageButton = findViewById(R.id.anasayfa_buton)
        val aramaButton: ImageButton = findViewById(R.id.arama_buton)
        val mesajlarButton: ImageButton = findViewById(R.id.mesajlar_buton)
        val bildirimlerButton: ImageButton = findViewById(R.id.bildirimler_buton)
        val profilButton: ImageButton = findViewById(R.id.profil_buton)

        // Ana Sayfa butonu tıklama olayı (zaten aynı ekrandayız, bu yüzden bir şey yapmaya gerek yok)
        anaSayfaButton.setOnClickListener {
            // İsteğe bağlı olarak bir Toast mesajı gösterebilirsiniz:
            Toast.makeText(this, "Zaten Ana Sayfadasınız", Toast.LENGTH_SHORT).show()
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

        // Üst butonlar için tıklama olayları (diğer ekranlara geçiş)
        val akisButton = findViewById<Button>(R.id.akis_buton)
        val debeButton = findViewById<Button>(R.id.debe_button)
        val takipButton = findViewById<Button>(R.id.takip_buton)
        val tarihteBugunButton = findViewById<Button>(R.id.tarihtebugun_buton)

        akisButton?.setOnClickListener {
            // Akış aktivitesine geçiş kodu
            val akis = Intent(this, AkisActivity::class.java)
            startActivity(akis)
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
            // Tarihte Bugün aktivitesine geçiş kodu
            val tarih = Intent(this, TarihteBugunActivity::class.java)
            startActivity(tarih)
        }

    }
}