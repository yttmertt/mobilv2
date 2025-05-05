package com.example.mobilapp

import java.util.Date

// Projenizin paket adı (gerekirse değiştirin)

data class GundemMaddesi(
    val baslik: String,       // Gündem maddesinin başlığı
    val detay: String,        // Gündem maddesinin kısa açıklaması veya detayı
    //val tarih: Date?,      // Gündem maddesinin tarihi (isteğe bağlı)
    //val gorselUrl: String?, // Gündem maddesiyle ilgili görselin URL'i (isteğe bağlı)
    //val oySayisi: Int = 0,  // Gündem maddesine verilen oy sayısı (isteğe bağlı)
    // Diğer ilgili özellikler buraya eklenebilir
)