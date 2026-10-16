# PBO 2 - Pertemuan 3: Komponen GUI Swing dan FlatLaf

**NPM** : 2410010585  
**Nama** : Fadliatul Amaliyah  
**Kelas** : 5C Reguler Banjarmasin  

---

## 📸 Tangkapan Layar (Screenshot)

### 1. Form Pemesanan Tiket Travel - Mode Terang
![Mode Terang](../P03-docs/Form%20Pemesanan%20Tiket%20Travel%20Mode%20Terang.png)

### 2. Form Pemesanan Tiket Travel - Mode Gelap
![Mode Gelap](../P03-docs/Form%20Pemesanan%20Tiket%20Travel%20%20Mode%20Gelap.png)

### 3. Tab Design & Jendela Navigator NetBeans
![Design Navigator](../P03-docs/Design%20FormTiketTravel%20.png)

---

## 🔬 Jawaban Pertanyaan Refleksi (Bagian G)

### 1. Perbedaan Top-level container, Intermediate container, dan Atomic component
* **Top-level container:** Jendela utama aplikasi yang memiliki bingkai, tombol penutup (close/minimize/maximize), serta judul (contoh: `JFrame`, `JDialog`).
* **Intermediate container:** Wadah penampung tanpa bingkai yang berfungsi mengelompokkan dan mengatur tata letak (*layout*) komponen lain agar rapi (contoh: `JPanel`, `JScrollPane`).
* **Atomic component:** Komponen tunggal yang tidak bisa menampung komponen lain dan berfungsi langsung untuk interaksi pengguna (contoh: `JButton`, `JLabel`, `JTextField`, `JRadioButton`).

### 2. Mengapa JRadioButton Memerlukan ButtonGroup yang Sama?
`JRadioButton` memerlukan `ButtonGroup` agar pilihan bersifat *mutually exclusive* (hanya bisa dipilih salah satu dalam satu waktu). Tanpa `ButtonGroup`, pengguna dapat memilih/mencentang lebih dari satu radio button secara bersamaan.

### 3. Kapan Memilih JComboBox Dibandingkan JRadioButton?
`JComboBox` dipilih jika pilihan cukup banyak (lebih dari 4–5 opsi) untuk menghemat ruang antarmuka. `JRadioButton` dipilih jika pilihan sedikit (2–3 opsi) dan ingin langsung terlihat oleh pengguna.

### 4. Mengapa initComponents() Tidak Boleh Diedit Langsung?
Method `initComponents()` digenerate dan dikelola otomatis oleh NetBeans GUI Builder berdasarkan file `.form`. Perubahan manual akan hilang atau tertimpa saat antarmuka di tab Design diubah.

### 5. Mengapa FlatLightLaf.setup() Harus Dipanggil Sebelum Form Dibuat?
Pemanggilan `FlatLightLaf.setup()` mendaftarkan tema FlatLaf secara global ke sistem Swing. Harus dijalankan sebelum instansiasi form (`new Form()`) agar komponen yang digambar pertama kali langsung menggunakan gaya tampilan FlatLaf.
