Jawaban Eksperimen Praktikum 5

fireTableRowsInserted dijadikan komentar

Hasil: Tabel tidak langsung berubah. Kontak baru sudah masuk ke List daftar, tetapi model tidak memberi tahu JTable, sehingga JTable tidak menggambar ulang baris baru. Ini membuktikan bahwa JTable tidak menyimpan data dan hanya menggambar ulang saat model memanggil method fireTable....

barisTerpilih tanpa convertRowIndexToModel

Hasil: Dialog konfirmasi menampilkan Budi Santoso, bukan Ahmad Fauzi. Setelah pencarian “ah”, Ahmad Fauzi ada di baris tampilan 1, padahal di model ia baris 2. Tanpa konversi, baris 1 dibaca sebagai baris model 1, yaitu Budi Santoso.

super(pemilik, judul, false) (tidak modal)

Hasil: Jendela utama tetap bisa diklik saat dialog terbuka. Kontak yang disimpan tidak muncul di tabel. Pada dialog non-modal, setVisible(true) tidak menunggu dialog ditutup, jadi tampilkan() langsung mengembalikan hasil yang masih null. AplikasiKontak lalu mengira pengguna membatalkan, dan model.tambah() tidak dipanggil.

Ctrl+N, Ctrl+E, Ctrl+D tanpa baris terpilih

Hasil: Ctrl+N tetap bekerja karena tambahItem tidak pernah dinonaktifkan. Ctrl+E dan Ctrl+D tidak bekerja karena perbaruiTombol() memanggil ubahItem.setEnabled(false) dan hapusItem.setEnabled(false) saat getSelectedRow() < 0. Item menu yang nonaktif tidak menjalankan pintasannya.

Accelerator hapusItem diubah menjadi Delete

Hasil: Baris hapusItem.setAccelerator(...) di initComponents() berubah. KeyEvent.VK_D menjadi KeyEvent.VK_DELETE, dan InputEvent.CTRL_DOWN_MASK menjadi 0 karena tidak ada tombol pengubah.

model dibuat setelah initComponents()

Hasil: Aplikasi gagal terbuka dengan exception dari initComponents(), yaitu IllegalArgumentException: Cannot set a null TableModel. Penyebabnya, initComponents() menjalankan kontakTable.setModel(model), padahal saat itu model masih null karena baru dibuat setelah initComponents(). Karena itu atribut model harus sudah dibuat saat dideklarasikan.
