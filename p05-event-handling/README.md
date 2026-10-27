# Proyek P05: Event Handling

**Mata Kuliah:** Pemrograman Berbasis Objek 2  
**Mahasiswa:** Fadliatul Amaliyah  
**NPM:** 2410010585  
**Program Studi:** Teknik Informatika - UNISKA Banjarmasin  

---

## 🗺️ Peta Event (Latihan Mandiri: FormAnggotaPerpustakaan)

| Komponen | Menu Events | Aksi |
| :--- | :--- | :--- |
| Kotak centang `setujuCheck` | Item: `itemStateChanged` | Tombol Daftar hanya aktif jika dicentang |
| Tombol Batal (`batalButton`) | Action: `actionPerformed` | Kosongkan semua isian dan kembalikan fokus ke NPM |
| Tombol Daftar (`daftarButton`) | Action: `actionPerformed` | Tampilkan ringkasan data dengan `JOptionPane` |
| Isian NPM (`npmField`) | Key: `keyReleased` | Label kecil `digitLabel` menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame di Navigator) | Window: `windowClosing` | Minta konfirmasi sebelum aplikasi ditutup |

**Pengaturan Properties:**
* `defaultCloseOperation` pada form diubah menjadi `DO_NOTHING`.
* Centang `enabled` pada `daftarButton` dihilangkan.

**Logika bersama:** method `perbaruiJumlahDigit()` ditulis satu kali dan dipanggil dari `npmFieldKeyReleased` dan `batalButtonActionPerformed`.

---

## 📸 Tangkapan Layar

### 1. Jendela Properties bagian Events untuk tombol Daftar
![Properties Events daftarButton](/P05-docs/EventsuntuktombolDaftar.png)

### 2. Dialog Ringkasan (tombol Daftar)
![Dialog Ringkasan](/P05-docs/DialogRingkasan.png)

### 3. Dialog Konfirmasi Keluar
![Dialog Konfirmasi Keluar](/P05-docs/DialogKonfirmasiKeluar.png)

---

## 🔎 Tabel Pengamatan Praktikum 2 (PengamatEvent)

| No | Tindakan | Event yang tercatat |
| :-: | :--- | :--- |
| 1 | Arahkan kursor ke tombol, lalu jauhkan | `MouseEvent` kursor masuk ke tombol, lalu `MouseEvent` kursor keluar dari tombol |
| 2 | Klik tombol Klik saya | `MouseEvent` kursor masuk ke tombol, `ActionEvent` tombol diklik, `MouseEvent` kursor keluar dari tombol |
| 3 | Centang lalu hapus centang Aktifkan fitur | `ItemEvent` kotak dicentang, lalu `ItemEvent` centang dihapus |
| 4 | Ganti pilihan dari Pagi menjadi Malam | `ItemEvent` memilih Malam |
| 5 | Klik isian, lalu ketik kata "abc" | `FocusEvent` isian mendapat fokus, lalu `KeyEvent` mengetik huruf a, b, c |
| 6 | Klik tombol setelah mengetik di isian | `MouseEvent` kursor masuk ke tombol, `FocusEvent` isian kehilangan fokus, `ActionEvent` tombol diklik, `MouseEvent` kursor keluar dari tombol |

---

## 🧪 Jawaban Eksperimen

### Eksperimen Praktikum 3 (Konversi Suhu)
1. **Menghapus pemeriksaan `ItemEvent.SELECTED`:**
   * **Hasil:** Pesan `item berubah` tercetak **2 kali** setiap pilihan diganti. Satu kali untuk pilihan lama (`DESELECTED`) dan satu kali untuk pilihan baru (`SELECTED`).
2. **Memakai event `keyPressed` pada `celsiusField`:**
   * **Hasil:** Event ini dipicu saat tombol ditekan, **sebelum** karakter masuk ke isian. Jadi `getText()` masih berisi teks sebelum ketikan terakhir dan hasil terlambat satu karakter. `keyReleased` dipicu setelah karakter masuk.
3. **Menghapus blok `try` dan `catch`, lalu mengetik huruf:**
   * **Hasil:** Jendela Output menampilkan pesan error berwarna merah berupa `NumberFormatException` beserta stack trace, karena `Double.parseDouble` tidak dapat mengubah huruf menjadi angka.

### Eksperimen Praktikum 4 (Kalkulator Sederhana)
1. **Event `actionPerformed` dari Events pada `kaliButton` sambil mempertahankan lambda:**
   * **Hasil:** Pesan `kali` tercetak **2 kali** di jendela Output NetBeans, satu dari GUI Builder dan satu dari lambda di konstruktor.
   * **Alasan:** Satu tombol sebaiknya hanya memakai satu cara agar aksinya tidak berjalan dua kali.
2. **Menambahkan tombol `%` (sisa bagi):**
   * **Tab Design:** Menambahkan Button (`modulusButton`) dengan text `%` pada `operatorPanel`.
   * **Tab Source:** Pada method `hitung(char operator)`, menambahkan `case '%' -> a % b;` pada `switch`, dan mendaftarkan listener untuk `modulusButton` di konstruktor `KalkulatorSederhana()`.
3. **Menekan tombol Hapus:**
   * **Hasil:** Kursor langsung berada di isian pertama karena method `hapus` memiliki baris `angka1Field.requestFocusInWindow();` yang memindahkan fokus ke `angka1Field`.

---

## 🤖 Deklarasi Penggunaan AI

Saya menggunakan alat bantu AI dalam mengerjakan tugas ini.

* **Alat AI yang digunakan:** Claude (Anthropic)
* **Keperluan:** Membantu memahami urutan langkah di NetBeans GUI Builder sesuai modul, menyusun isi event handler pada Latihan Mandiri, memeriksa kesesuaian proyek dengan modul, dan menyusun README.
