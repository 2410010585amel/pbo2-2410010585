# Repository Tugas PBO 2

Repository ini memuat dokumentasi, tugas, dan eksperimen praktikum mata kuliah Pemrograman Berbasis Objek 2.

---

# 📌 Pertemuan 1: Lingkungan Java, Maven, dan Git

## Output Program P01

### 1. HaloPBO2
Berikut adalah hasil running dari kelas `HaloPBO2`:

![Output HaloPBO2](Screenshot%20P01/output_halopbo.png)

---

### 2. KartuMahasiswa
Berikut adalah hasil running dari kelas `KartuMahasiswa`:

![Output KartuMahasiswa](Screenshot%20P01/output_kartumahasiswa.png)

---

## Riwayat Commit Git (git log)

Berikut adalah bukti eksekusi perintah `git log --oneline`:

![Git Log](Screenshot%20P01/output_commit.png)

---

# 📌 Pertemuan 2: Tinjauan Ulang PBO 1 (Studi Kasus Perpustakaan Mini)

## Output Program P02

Berikut adalah hasil pengujian pencarian judul dan percobaan peminjaman Skripsi:

![Screenshot Output P02](screenshot%20dan%20ekperimen%20P02/Screenshot%20P02.png)
---

## 🔬 Jawaban Eksperimen Praktikum 6

**NPM** : 2410010585  
**Nama** : Fadliatul Amaliyah  
**Kelas** : 5C Reguler Banjarmasin  

### 1. Tambahkan baris `Koleksi x = new Koleksi("X01", "Uji", 2026);` di method `main`. Apa pesan error dari kompiler dan mengapa?
* **Pesan Error:** `id.ac.uniska.pbo2.p02.perpustakaan.mini.Koleksi is abstract; cannot be instantiated.`
* **Penjelasan:** Kelas `Koleksi` dideklarasikan sebagai *abstract class*, sehingga berfungsi sebagai kerangka dasar dan tidak dapat dibuatkan objeknya secara langsung menggunakan perintah `new`.

### 2. Pada kelas `Buku`, ubah nama method `hitungDenda` menjadi `hitungdenda`. Apa yang terjadi jika anotasi `@Override` ada, dan jika dihapus?
* **Jika `@Override` ADA:** Error `method does not override or implement a method from a supertype`. Karena Java bersifat *case-sensitive*, `hitungdenda` dianggap method baru yang tidak ada di parent class/interface.
* **Jika `@Override` DIHAPUS:** Error `Buku is not abstract and does not override abstract method hitungDenda(int) in BisaDipinjam`. Kelas `Buku` dianggap belum memenuhi kontrak untuk mengimplementasikan method `hitungDenda(int)`.

### 3. Tambahkan `new Buku("B009", "", 2020, "Anonim")`. Apa yang terjadi saat program dijalankan?
* **Hasil:** `Runtime Error / Exception java.lang.IllegalArgumentException: Judul tidak boleh kosong.`
* **Penjelasan:** Validasi `if (judul == null || judul.isBlank())` pada konstruktor `Koleksi.java` berhasil mencegah pembuatan objek koleksi tanpa judul.

### 4. Ubah `private StatusKoleksi status` menjadi `public`, lalu ubah status `B002` langsung dari `main` menjadi `TERSEDIA` saat masih dipinjam. Aturan apa yang dilanggar?
* **Hasil:** Program dapat berjalan tanpa error kompilasi, tetapi status buku berubah menjadi `TERSEDIA` secara paksa padahal di data sistem (Map peminjam) buku masih berada di tangan peminjam.
* **Aturan yang Dilanggar:**
  1. **Violasi Prinsip Enkapsulasi:** Penyembunyian data internal rusak.
  2. **Aturan Bisnis Aplikasi:** Status seharusnya hanya bisa berubah via method `pinjam()` dan `kembalikan()`.
