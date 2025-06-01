<h1 align="center">
Dosya Taşımar<a name="readme-top"></a>
</h1>

<div align="center">
  <img src="./Readme Resources/Dosya Taşıma Logo.png" alt="Logo" width="120"/>
</div>

## **İçindekiler**

- [Uygulama Hakkında](#uygulama-hakkında)
- [Ekran Görüntüleri](#ekran-görüntüleri)
- [Video](#video)
- [Test Edilen Sürümler](#test-edilen-sürümler)
- [Projenin Klonlanması ve Kodların İncelenmesi](#projenin-klonlanması-ve-kodların-i̇ncelenmesi)
- [Lisans](#lisans)
- [İletişim](#i̇letişim)


![-----------------------------------------------------](./Readme%20Resources/Line.png)

## Uygulama Hakkında

<table>
  <tr>
    <th style="font-weight: bold;">İşletim Sistemi</th>
    <td>Windows</td>
  </tr>
  <tr>
    <th style="font-weight: bold;">Uygulama Türü</th>
    <td>Konsol</td>
  </tr>
</table>

Bu uygulama kullanıcının belirleyeceği kaynak klasördeki tüm dosyaları ve alt klasörleri
alarak kullanıcı tarafından seçilen hedef klasörün ana dizinine otomatik olarak taşır.
Hedef klasörde aynı isimli dosyalar varsa bu dosyaların isimlerini otomatik olarak değiştirir.

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


![-----------------------------------------------------](./Readme%20Resources/Line.png)

## Ekran Görüntüleri

Ekran görüntüleri uygulamanın `v1.0.0` sürümünden alınmıştır.

![Ekran Görüntüsü 1](./Readme%20Resources/Screenshots/Screenshot%201.png)
![Ekran Görüntüsü 2](./Readme%20Resources/Screenshots/Screenshot%202.png)
![Ekran Görüntüsü 3](./Readme%20Resources/Screenshots/Screenshot%203.png)


![-----------------------------------------------------](./Readme%20Resources/Line.png)

## Video

<a href="https://youtu.be/_VowZjxqJwg">
  <img align="left" src="./Readme Resources/Video/YouTube.png" alt="Youtube" width="30"/>Uygulama Tanıtım Videosu
</a>


![-----------------------------------------------------](./Readme%20Resources/Line.png)

## Test Edilen Sürümler

<table>
  <tr>
    <td>Windows 11</td>
    <td>✅️</td>
  </tr>
    <tr>
    <td>Windows 10</td>
    <td>✅️</td>
  </tr>
    <tr>
    <td>Windows 8.1</td>
    <td>✅️</td>
  </tr>
    <tr>
    <td>Windows 8</td>
    <td>✅️</td>
  </tr>
</table>


![-----------------------------------------------------](./Readme%20Resources/Line.png)

## Projenin Klonlanması ve Kodların İncelenmesi

Projeyi klonlamak için [Git](https://git-scm.com) yüklü bir bilgisayarda
terminali açarak aşağıdaki komutu çalıştırabilirsiniz:
```
git clone https://github.com/mustafatoktas/O_DosyaTasima.git
```

Bu repoyu klonlayarak proje yapısını inceleyebilir, geliştirme yöntemlerini
keşfedebilir ve [lisans hakları](https://www.gnu.org/licenses/gpl-3.0.html)
kapsamında katkıda bulunabilirsiniz.


![-----------------------------------------------------](./Readme%20Resources/Line.png)

<div align="center">
  <a href="https://github.com/mustafatoktas/W.BE_RepoVisitorCounterAPI"><img src="https://toktasoft.com/api/repo-visitor-counter?repo=nzahqd8w62rcts7&show_repo_name=1&show_date=1&show_brand=0&txt_color=209,215,224&bg_color=45,52,58" alt="Repo Visitor Counter"/></a>
</div>

<br>
  
<div align="center">
  <a href="https://buymeacoffee.com/mustafatoktas"><img src="./Readme Resources/Communication/Buy Me a Coffee.png" alt="Buy Me a Coffee" height="64"/></a>
</div>


![-----------------------------------------------------](./Readme%20Resources/Line.png)

## Lisans

```
Copyright 2024-2025 Mustafa TOKTAŞ

Licensed under the GNU General Public License v3.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.gnu.org/licenses/gpl-3.0.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


![-----------------------------------------------------](./Readme%20Resources/Line.png)

## İletişim

<a href="mailto:info@mustafatoktas.com"             ><img src="./Readme Resources/Communication/Mail.png"     alt="Mail"     width="64"/></a>
<a href="https://t.me/mustafatoktas00"              ><img src="./Readme Resources/Communication/Telegram.png" alt="Telegram" width="64"/></a>
<a href="https://www.linkedin.com/in/mustafatoktas/"><img src="./Readme Resources/Communication/LinkedIn.png" alt="LinkedIn" width="64"/></a>

<p align="center">
  <a href="#readme-top"><img src="./Readme Resources/Back to Top.png" alt="Back to Top" height="64"/></a>
</p>
