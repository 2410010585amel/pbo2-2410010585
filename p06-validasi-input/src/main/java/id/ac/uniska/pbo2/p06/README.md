# Modul 6 - Validasi Input dan Kegunaan (`p06-validasi-input`)

## 1. Lembar Peer Review
![Lembar Peer Review](P06-docs/lembarpeerreview.png)

---

## 2. Tabel Temuan & Commit Git

| Temuan dari Teman | Perbaikan yang Dilakukan | Commit Git yang Memuat Perbaikan |
| :--- | :--- | :--- |
| Field Nomor HP masih bisa diinput huruf/karakter bukan angka. | Menambahkan listener `hpFieldKeyTyped` agar mengabaikan (`evt.consume()`) jika karakter diketik bukan angka atau melebihi 13 digit. | `fix: batasi input nomor hp hanya angka pada event keyTyped` |
| Validasi nama belum memeriksa angka (misal: "Amel123" lolos). | Menambahkan aturan regex `.*\\d.*` pada method `Validator.nama()` untuk mencegah nama mengandung angka. | `feat: tambah aturan validasi nama tidak boleh mengandung angka` |

---

## 3. Tangkapan Layar (Screenshot)

### Tangkapan Layar Form Saat Ada Pesan Kesalahan
![Form Pesan Kesalahan](P06-docs/formsaatadapesankesalahan.png)

### Tangkapan Layar Jendela Navigator (Label Pesan)
![Jendela Navigator](P06-docs/jendelaNavigator.png)

---

## 4. Jawaban Eksperimen Praktikum 4

1. **Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di `npmFieldKeyTyped` yang menyebabkannya?**
   * **Jawaban:** Huruf tidak muncul karena di dalam method `npmFieldKeyTyped` mengeksekusi pengabaian tombol jika karakter yang ditekan bukan digit angka (`evt.consume()`).

2. **Isi email dengan `siti@`, lalu tekan Tab. Kapan pesan kesalahan muncul?**
   * **Jawaban:** Pesan kesalahan *"Format email belum benar, contoh: nama@contoh.com"* langsung muncul di bawah field email dengan garis tepi merah.

3. **Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?**
   * **Jawaban:** Tidak muncul pesan kesalahan karena method `namaFieldFocusLost` memiliki kondisi `if (!namaField.getText().isBlank())`, sehingga validasi umpan balik saat berpindah fokus hanya berjalan jika isian tidak kosong. Isian yang kosong baru diperiksa saat tombol **Daftar** diklik.

4. **Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?**
   * **Jawaban:** Muncul pesan status di bawah panel *"5 isian perlu diperbaiki"*, garis merah muncul pada semua isian wajib, dan kursor fokus otomatis mengarah ke `npmField` (isian pertama).

5. **Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?**
   * **Jawaban:** Kursor langsung berpindah ke `namaField` karena properti `displayedMnemonic` yang diisi huruf `'N'` pada `namaLabel`, serta properti `labelFor` yang dihubungkan ke `namaField`.

6. **Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?**
   * **Jawaban:** Data tetap ada.

---

## 5. Deklarasi Penggunaan AI
Saya menggunakan Gemini AI untuk membantu memahami modul dan merapikan dokumentasi.
