# Proyek P04: Layout Manager dan Desain Form

**Mata Kuliah:** Pemrograman Berbasis Objek 2  
**Mahasiswa:** Fadliatul Amaliyah  
**NPM:** 2410010585  
**Program Studi:** Teknik Informatika - UNISKA Banjarmasin  

---

## 📐 Sketsa Form dan Tabel Rancangan

### Foto Sketsa Form
![Sketsa Form FormAnggotaPerpustakaan](/P04-docs/P04-Sketsa.jpg)

### Tabel Rancangan Layout
| Bagian Panel | Jenis Layout | Keterangan / Constraint |
| :--- | :--- | :--- |
| **Jendela Utama (JFrame)** | `BorderLayout` | Menjadi kerangka utama form. |
| **Header Panel** | `FlowLayout` / `BoxLayout` | Berisi judul form di bagian atas (`NORTH`). |
| **Isi Form (`formPanel`)** | `GridBagLayout` | Mengatur label dan field input agar rapi dan simetris (`CENTER`). |
| **Tombol Panel** | `FlowLayout` (Alignment Right) | Menampung tombol Batal dan Daftar di kanan bawah (`SOUTH`). |

---

## 📸 Tangkapan Layar Aplikasi (Screenshots)

### 1. FormAnggotaPerpustakaan - Ukuran Awal
![Form Ukuran Awal](/P04-docs/FormAnggotaPerpustakaanUkuranAwal.png)

### 2. FormAnggotaPerpustakaan - Saat Dilebarkan
![Form Saat Dilebarkan](/P04-docs/FormAnggotaPerpustakaanDilebarkan.png)

### 3. Jendela Navigator & Susunan Panel (Tab Design)
![Susunan Panel di Navigator](/P04-docs/FormAnggotaPerpustakaanSusunanPanel.png)

---

## 🧪 Jawaban Eksperimen Praktikum

### Eksperimen Praktikum 2 (Galeri Layout)
1. **Perubahan Alignment `flowPanel` ke Center:**
   * **Hasil:** Posisi tombol-tombol pada `flowPanel` berubah menjadi rata tengah (Center).
   * **Baris Kode di `initComponents()`:** Baris 108 berubah dari:
     `flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 8));`  
     menjadi:  
     `flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 8));`
2. **Perubahan Rows = 0 dan Columns = 2 pada `gridPanel`:**
   * **Hasil:** Terbentuk **5 baris**, karena jumlah kolom diatur menjadi 2 sehingga komponen dibagi secara otomatis ke dalam 2 kolom.
3. **Pengaturan `maximumSize` & Vertical Strut pada `boxPanel`:**
   * **Hasil:** Lebar tombol melebar menyesuaikan lebar panel, dan terdapat jarak vertikal di antara tombol-tombol setelah disisipkan *Vertical Strut* dari Swing Fillers.

### Eksperimen Praktikum 4 (Form Biodata)
1. **Mengubah `Weight X` pada `namaField` menjadi 0.0:**
   * **Hasil:** Field isian tidak ikut memanjang/melebar saat jendela dilebarkan (lebar isian tetap).
2. **Mengubah Direction `formPanel` di dalam `isiPanel` dari North ke Center:**
   * **Hasil:** Ketika jendela ditinggikan, `formPanel` ikut berpindah posisi ke tengah vertikal jendela.
3. **Menghapus baris `setMinimumSize(getSize())` pada Konstruktor:**
   * **Hasil:** Saat jendela dikecilkan sekecil mungkin, susunan komponen pada `formPanel` menjadi rusak dan tumpang tindih lebih dulu.

---

## 👥 Saling Menilai (Review Teman)

| No | Pemeriksaan | Status |
| :-: | :--- | :-: |
| 1 | Label singkat, jelas, dan sejajar | **Ya** |
| 2 | Isian dikelompokkan dengan judul bagian | **Ya** |
| 3 | Placeholder dipakai untuk isian yang punya format | **Ya** |
| 4 | Komponen sesuai jenis data | **Ya** |
| 5 | Tombol utama menonjol dan berada di kanan bawah | **Ya** |
| 6 | Jarak antar komponen konsisten | **Ya** |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan | **Ya** |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout / Absolute Layout | **Ya** |

> **Saran Perbaikan:**  
> *"Secara keseluruhan susunan Form Anggota Perpustakaan yang kamu buat sudah sangat rapi, responsif, dan seluruh komponen inputnya sudah sesuai dengan jenis datanya. Penggunaan FlatLaf dan placeholder-nya juga sudah berjalan baik. Namun ada satu saran kecil perbaikan: Sebaiknya opsi Radio Button untuk 'Jenis Anggota' (Mahasiswa, Dosen, Umum) diberikan sedikit jarak tambahan (Insets/Gap Horizontal) di antara pilihan tombolnya, agar teks pilihan tidak terlalu dekat satu sama lain saat dijalankan."*

---

## ❓ Pertanyaan Refleksi (Bagian G)

1. **Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?**
   * **Jawab:** Keduanya menggunakan posisi piksel yang kaku (*fixed*), sehingga tampilan tidak responsif saat ukuran jendela diubah dan teks rentan terpotong pada resolusi/skala layar yang berbeda. Selain itu, Absolute Layout membutuhkan library tambahan NetBeans yang menyebabkan aplikasi sulit dijalankan di komputer lain.

2. **Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.**
   * **Jawab:** Pada `FlowLayout`, ukuran komponen tidak berubah melainkan berpindah baris jika ruang tidak muat. Sedangkan pada `GridLayout`, seluruh komponen akan ikut melebar dan meninggi secara proporsional mengisi seluruh area sel.

3. **Apa fungsi `Weight X` dan `Fill` pada constraint GridBagLayout?**
   * **Jawab:** `Weight X` menentukan porsi ruang ekstra yang dialokasikan ke kolom saat jendela dilebarkan. `Fill` menentukan bagaimana komponen memanfaatkan ruang kosong yang telah dialokasikan oleh `Weight X` tersebut (misal: `HORIZONTAL` membuat komponen melebar memenuhi sel).

4. **Mengapa `formPanel` dibungkus `isiPanel` dan diletakkan di North?**
   * **Jawab:** Agar susunan isian form tetap berada di posisi atas dan tidak tertarik melebar secara vertikal ke tengah saat jendela ditinggikan, sehingga kerapian tata letak form tetap terjaga.

5. **Sebutkan dua prinsip desain yang Anda terapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.**
   * **Prinsip Pengelompokan (Grouping / Proximity):** Elemen input dikelompokkan secara rapi di bawah subjudul (`DataAnggota`, `Kontak`, `Persetujuan`) menggunakan label berukuran `h4` dan jarak `Insets` yang teratur.
   * **Prinsip Hierarki Visual & Petunjuk Interaksi (Visual Hierarchy & Affordance):** Judul utama dibuat paling menonjol (`h2`), tombol **Daftar** dijadikan tombol default (*Enter*), serta `emailField` dan `hpField` diberi teks *placeholder* sebagai petunjuk format input.

---

## 🤖 Deklarasi Penggunaan Alat Bantu AI

Saya menyatakan bahwa dalam penyelesaian tugas praktikum ini, saya **menggunakan alat bantu kecerdasan buatan (Artificial Intelligence)** dengan rincian sebagai berikut:

* **Alat AI yang Digunakan:** Gemini (Google AI)
* **Keperluan Penggunaan:**
  1. **Penjelasan Langkah & Navigasi Modul:** Membantu menjelaskan bagian-bagian petunjuk modul yang belum dipahami, seperti urutan elemen yang harus diklik pada antarmuka NetBeans IDE (Palette, Navigator, Properties, dan Customizer Layout).
  2. **Koreksi Kode Java:** Mengidentifikasi dan memperbaiki kesalahan penulisan kode Java (*debugging*), penataan struktur elemen pada *Layout Manager*, serta penerapan properti gaya tampilan FlatLaf.
