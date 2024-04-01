# O - Dosya Taşıma

**İçindekiler**

  - [1. Uygulama Hakkında](#1-uygulama-hakkında)
  - [2. Ekran Görüntüleri](#2-ekran-görüntüleri)
  - [3. Uygulamayı Çalıştırma](#3-uygulamayı-çalıştırma)
  - [4. EXE Dosyası](#4-exe-dosyası)
  - [5. Lisans](#5-lisans)
  - [6. İletişim](#6-i̇letişim)

---


## 1. Uygulama Hakkında

  - **Tür:** Windows Konsol Uygulaması


Bu Windows konsol uygulaması kullanıcının belirleyeceği kaynak klasör ve tüm alt klasörlerindeki dosyaları, yine kullanıcının belirleyeceği hedef klasörün ana dizinine otomatik olarak taşıma işlemi yapmaktadır. Hedef klasördeki olası dosya ismi çakışmalarında otomatik olarak isim değiştirme işlemi yapılmaktadır.

**Taşıma İşleminden Önce:**
```
kaynak klasör/                hedef klasör/   [boş]
├── metin.txt                 └── 
├── resim.png                 
├── alt klasör1/
│   ├── android.apk
│   ├── main.kt
|   └── klasör/
|       └── logo.ico    
└── alt klasör2/
    ├── android.apk
    └── main.kt
```
**Taşıma İşleminden Sonra:**
```
kaynak klasör/                  hedef klasör/
├── alt klasör1/                ├── metin.txt
|   └── klasör/                 ├── resim.png
└── alt klasör2/                ├── android.apk
                                ├── main.kt
                                ├── android_5434235234.apk
                                ├── main_4325245141.kt
                                └── logo.ico
                                
```


## 2. Ekran Görüntüleri
![Ekran Görüntüsü 1](./README%20RESOURCES/Ekran%20Görüntüsü%201.jpg)
![Ekran Görüntüsü 2](./README%20RESOURCES/Ekran%20Görüntüsü%202.jpg)
![Ekran Görüntüsü 3](./README%20RESOURCES/Ekran%20Görüntüsü%203.jpg)


## 3. Uygulamayı Çalıştırma

Uygulamayı kendi bilgisayarınıza indirmek, çalıştırmak veya kodları incelemek için git bash'de projeyi indirmek istediğiniz dosya yoluna gidip `git clone https://github.com/mustafatoktas/O_DosyaTasima.git` komutunu çalıştırabilirsiniz.


## 4. EXE Dosyası

[Dosya Taşıma.exe](./README%20RESOURCES/Dosya%20Taşıma.exe)


## 5. Lisans

Bu uygulama [GNU General Public License v3.0](LICENSE) altında lisanslanmıştır. Detaylar için lisans dosyasını inceleyebilirsiniz.


## 6. İletişim

- E-posta: [info@mustafatoktas.com](mailto:info@mustafatoktas.com)
- Telegram: [Mustafa TOKTAŞ](https://t.me/mustafatoktas00)
- LinkedIn: [Mustafa TOKTAŞ](https://www.linkedin.com/in/mustafatoktas/)
