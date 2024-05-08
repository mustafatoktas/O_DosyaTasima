package com.mustafatoktas.dosyatasima

import java.io.File
import java.io.IOException

fun main() {

    print("HOŞGELDİNİZ,\n" +
            "Bu uygulama, belirleyecek olduğunuz kaynak klasördeki ve tüm alt klasörlerindeki dosyaları\n" +
            "hedef klasöre otomatik olarak taşıma işlemi yapmaktadır.")
    println("\nHerhangi bir zamanda uygulamayı baştan başlatmak için r'ye basabilirsiniz...")
    println("NOT: Uygulama işlevini yerine getirmiyorsa yönetici modunda çalıştırabilirsiniz.")


    val kaynakKlasorYolu = File(getKullaniciGirisi("Kaynak klasör yolunu girin"))
    val hedefKlasorYolu = File(getKullaniciGirisi("Hedef klasör yolunu girin"))


    val onay = getKullaniciGirisi("\nKAYNAK klasör yolu: ${kaynakKlasorYolu.path}\n" +
            "HEDEF klasör yolu: ${hedefKlasorYolu.path}\n" +
            "Taşıma işlemini onaylıyor musunuz? [evet için: e | klasör yollarını tekrar girmek için: h]")

    onayKontrol(onay)

    if (!kaynakKlasorYolu.exists() || !kaynakKlasorYolu.isDirectory || !hedefKlasorYolu.exists() || !hedefKlasorYolu.isDirectory) {
        println("Geçersiz klasör yolu! Uygulama baştan başlatılıyor...")
        main()
    }

    kaynakDosyalariTasi(kaynakKlasorYolu, hedefKlasorYolu)

    getKullaniciGirisi("Dosyalar başarıyla taşındı.")
}

/**
 * DİĞER FONKSİYONLAR
 */


fun kaynakDosyalariTasi(kaynakKlasorYolu: File, hedefKlasorYolu: File) {
    kaynakKlasorYolu.listFiles()?.forEach {
        if (it.isDirectory)
            kaynakDosyalariTasi(it, hedefKlasorYolu)
        else {
            try {
                val yeniDosya = File(hedefKlasorYolu, it.name)
                if (yeniDosya.exists()) {
                    val yeniDosyaAdi = it.nameWithoutExtension + "_" + System.currentTimeMillis() + "." + it.extension //extension = dosya uzantısı
                    val yeniDosyaYolu = File(hedefKlasorYolu, yeniDosyaAdi)
                    it.renameTo(yeniDosyaYolu)
                } else {
                    it.renameTo(yeniDosya)
                }
            } catch (ex: IOException) {
                println("Dosya taşınırken bir hata oluştu: ${ex.message}")
            }
        }
    }
}


fun getKullaniciGirisi(mesaj: String = "" ) : String {
    print(mesaj)
    print(" > ")
    val input = readLine()
    xKontrol(input)
    rKontrol(input)
    if (input.isNullOrBlank()) {
        println("Boş bırakılamaz! Uygulama baştan başlatılıyor...\n")
        main()
        return ""
    } else {
        return input
    }
}

fun xKontrol (basilanTus : String?) {
    if (basilanTus?.lowercase() == "x")
        System.exit(0)
}

fun rKontrol (basilanTus : String?) {
    if (basilanTus?.lowercase() == "r")
        main()
}

fun onayKontrol (basilanTus: String?) {
    if (basilanTus?.lowercase() != "e")
        main()
}