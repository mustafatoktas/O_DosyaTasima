<h1 align="center">Dosya Taşıma</h1>

<div align=center>
  <img src="./Readme%20Resources/Dosya%20Taşıma%20Logo.png" alt="Logo" width="120" heigh="120"/>
</div>

## **İçindekiler**

- [Uygulama Hakkında](#uygulama-hakkında)
- [Ekran Görüntüleri](#ekran-görüntüleri)
- [Video](#video)
- [Uygulamayı Çalıştırma](#uygulamayı-çalıştırma)
- [Lisans](#lisans)
- [İletişim](#i̇letişim)

<img src="./Readme%20Resources/Çizgi.png" alt="-----------------------------------------------------"/>


## Uygulama Hakkında

- **Tür:** Windows Konsol Uygulaması

Bu Windows konsol uygulaması kullanıcının belirleyeceği kaynak klasör ve tüm alt
klasörlerindeki dosyaları, yine kullanıcının belirleyeceği hedef klasörün
ana dizinine otomatik olarak taşıma işlemi yapmaktadır. Hedef klasördeki olası
dosya ismi çakışmalarında otomatik olarak isim değiştirme işlemi yapılmaktadır.

**Taşıma İşleminden Önce:**
```
kaynak klasör/                  hedef klasör/   [boş]
├── metin.txt                   └── 
├── resim.png                 
├── alt klasör1/
│   ├── android.apk
│   ├── main.kt
│   └── klasör/
│       └── logo.ico    
└── alt klasör2/
    ├── android.apk
    └── main.kt
```
**Taşıma İşleminden Sonra:**
```
kaynak klasör/                  hedef klasör/
├── alt klasör1/                ├── metin.txt
│   └── klasör/                 ├── resim.png
└── alt klasör2/                ├── android.apk
                                ├── main.kt
                                ├── android_5434235234.apk
                                ├── main_4325245141.kt
                                └── logo.ico                              
```

<img src="./Readme%20Resources/Çizgi.png" alt="-----------------------------------------------------"/>


## Ekran Görüntüleri

![Ekran Görüntüsü 1](./Readme%20Resources/Ekran%20Görüntüleri/Ekran%20Görüntüsü%201.png)
![Ekran Görüntüsü 2](./Readme%20Resources/Ekran%20Görüntüleri/Ekran%20Görüntüsü%202.png)
![Ekran Görüntüsü 3](./Readme%20Resources/Ekran%20Görüntüleri/Ekran%20Görüntüsü%203.png)

<img src="./Readme%20Resources/Çizgi.png" alt="-----------------------------------------------------"/>


## Video

[Uygulama Tanıtım Videosu](https://youtu.be/_VowZjxqJwg)

<img src="./Readme%20Resources/Çizgi.png" alt="-----------------------------------------------------"/>


## Uygulamayı Çalıştırma

Uygulamanın proje dosyasını kendi bilgisayarınıza indirmek, kodları incelemek ve
[lisans hakları](https://www.gnu.org/licenses/gpl-3.0.html) çerçevesinde geliştirme yapabilmek için [git](https://git-scm.com)
yüklü bir bilgisayarda projeyi indirmek istediğiniz dosya yoluna gidip terminalde
`git clone https://github.com/mustafatoktas/O_DosyaTasima.git`
komutunu çalıştırabilirsiniz.

<img src="./Readme%20Resources/Çizgi.png" alt="-----------------------------------------------------"/>


## Lisans

    Copyright 2024 Mustafa TOKTAŞ

    Licensed under the GNU General Public License v3.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.gnu.org/licenses/gpl-3.0.html

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

<img src="./Readme%20Resources/Çizgi.png" alt="-----------------------------------------------------"/>


## İletişim

<a href="mailto:info@mustafatoktas.com"              target="_blank"> <img src="./Readme Resources/İletişim/Mail.png"     alt="Mail"     width="64" heigh="64"/> </a>
<a href="https://t.me/mustafatoktas00"               target="_blank"> <img src="./Readme Resources/İletişim/Telegram.png" alt="Telegram" width="64" heigh="64"/> </a>
<a href="https://www.linkedin.com/in/mustafatoktas/" target="_blank"> <img src="./Readme Resources/İletişim/LinkedIn.png" alt="LinkedIn" width="64" heigh="64"/> </a>