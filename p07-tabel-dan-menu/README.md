# Laporan Praktikum PBO 2 - Pertemuan 7
**Nama:** Fadliatul Amaliyah  
**NPM:** 2410010585  
**Kelas:** Regular / Semester 5 (Teknik Informatika, UNISKA Banjarmasin)  

---

## 1. Jawaban Eksperimen Praktikum 5

1. **`fireTableRowsInserted` dijadikan komentar**
   Tabel tidak langsung berubah. Kontak baru sudah masuk ke List `daftar`, tetapi model tidak memberi tahu `JTable`, sehingga `JTable` tidak menggambar ulang baris baru[cite: 11]. Ini membuktikan bahwa `JTable` tidak menyimpan data dan hanya menggambar ulang saat model memanggil method `fireTable...`[cite: 1, 11].

2. **`barisTerpilih` tanpa `convertRowIndexToModel`**
   Dialog konfirmasi menampilkan **Budi Santoso**, bukan Ahmad Fauzi. Setelah pencarian “ah”, Ahmad Fauzi ada di baris tampilan 1, padahal di model ia baris 2[cite: 2]. Tanpa konversi, baris 1 dibaca sebagai baris model 1, yaitu Budi Santoso. Karena itu, baris ini memerlukan konversi agar data yang salah tidak benar-benar terhapus[cite: 2, 10].

3. **`super(pemilik, judul, false)` (tidak modal)**
   Jendela utama tetap bisa diklik saat dialog terbuka[cite: 6]. Kontak yang disimpan tidak muncul di tabel. Pada dialog non-modal, `setVisible(true)` tidak menunggu dialog ditutup, jadi `tampilkan()` langsung mengembalikan `hasil` yang masih `null`. `AplikasiKontak` lalu mengira pengguna membatalkan, dan `model.tambah()` tidak dipanggil[cite: 6, 10].

4. **Ctrl+N, Ctrl+E, Ctrl+D tanpa baris terpilih**
   `Ctrl+N` tetap bekerja karena `tambahItem` tidak pernah dinonaktifkan. `Ctrl+E` dan `Ctrl+D` tidak bekerja karena `perbaruiTombol()` memanggil `ubahItem.setEnabled(false)` dan `hapusItem.setEnabled(false)` saat `getSelectedRow() < 0`[cite: 8, 11]. Item menu yang nonaktif tidak menjalankan pintasannya[cite: 11].

5. **Accelerator `hapusItem` diubah menjadi Delete**
   Baris `hapusItem.setAccelerator(...)` di `initComponents()` berubah[cite: 9]. `KeyEvent.VK_D` menjadi `KeyEvent.VK_DELETE`, dan `InputEvent.CTRL_DOWN_MASK` menjadi `0` karena tidak ada tombol pengubah.

6. **`model` dibuat setelah `initComponents()`**
   Aplikasi gagal terbuka dengan exception dari `initComponents()`, yaitu `IllegalArgumentException: Cannot set a null TableModel`. Penyebabnya, `initComponents()` menjalankan `kontakTable.setModel(model)`, padahal saat itu `model` masih `null` karena baru dibuat setelah `initComponents()`[cite: 3, 8]. Karena itu atribut `model` harus sudah dibuat saat dideklarasikan[cite: 3, 8].

---



## 2. Deklarasi Penggunaan AI
Dalam pengerjaan proyek dan penyusunan tugas ini, **AI digunakan sebagai kolaborator pembelajar** untuk membantu memahami konsep *AbstractTableModel*, *TableRowSorter*, pemecahan masalah (*debugging* eksperimen), serta membantu menyusun dokumentasi proyek dan struktur `README.md`.
