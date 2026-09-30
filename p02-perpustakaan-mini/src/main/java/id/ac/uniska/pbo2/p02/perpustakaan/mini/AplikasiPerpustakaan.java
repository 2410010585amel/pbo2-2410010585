package id.ac.uniska.pbo2.p02.perpustakaan.mini;

import java.util.List;

public class AplikasiPerpustakaan {

    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // 1. Menambahkan koleksi (Buku, Majalah, Skripsi)
        perpus.tambah(new Buku("B001", "Laskar Pelangi", 2005, "Andrea Hirata"));
        perpus.tambah(new Buku("B002", "Clean Code", 2008, "Robert C. Martin"));
        perpus.tambah(new Majalah("M001", "Majalah Teknologi Kita", 2026, "Agustus"));
        perpus.tambah(new Skripsi("S001", "Sistem Informasi Geografis", 2023, "Siti Rahmah", "Teknik Informatika"));

        // 2. Menambahkan anggota
        Anggota siti = new Anggota("2410010123", "Siti Rahmah");
        Anggota budi = new Anggota("2410010456", "Budi Santoso");

        // 3. Menampilkan daftar awal koleksi
        tampilkanDaftar(perpus);
        System.out.println();

        // 4. Transaksi peminjaman
        cetakPinjam(perpus, "B002", siti);
        cetakPinjam(perpus, "B002", budi);
        cetakPinjam(perpus, "M001", budi);
        
        // Uji coba meminjam Skripsi (akan menghasilkan: gagal)
        cetakPinjam(perpus, "S001", siti);

        System.out.println("Peminjam B002: " + perpus.getPeminjam("B002").nama());
        System.out.println();

        // 5. Uji pencarian kata kunci judul (Latihan Mandiri)
        String kataKunci = "code";
        List<Koleksi> hasilCari = perpus.cariJudul(kataKunci);
        System.out.println("Hasil pencarian \"" + kataKunci + "\": " + hasilCari.size() + " koleksi");
        for (Koleksi k : hasilCari) {
            System.out.println(k);
        }
        System.out.println();

        // 6. Transaksi pengembalian
        cetakKembali(perpus, "B002", 2);
        cetakKembali(perpus, "M001", 3);
        System.out.println();

        // 7. Ringkasan status koleksi
        System.out.println("Koleksi tersedia: " + perpus.jumlahTersedia()
                + " dari " + perpus.getDaftarKoleksi().size());
    }

    private static void tampilkanDaftar(Perpustakaan perpus) {
        System.out.println("=== Daftar Koleksi ===");
        for (Koleksi k : perpus.getDaftarKoleksi()) {
            System.out.println(k);
        }
    }

    private static void cetakPinjam(Perpustakaan perpus, String kode, Anggota anggota) {
        boolean berhasil = perpus.pinjam(kode, anggota);
        System.out.println(anggota.nama() + " meminjam " + kode + ": "
                + (berhasil ? "berhasil" : "gagal"));
    }

    private static void cetakKembali(Perpustakaan perpus, String kode, int hariTerlambat) {
        long denda = perpus.kembalikan(kode, hariTerlambat);
        System.out.println("Pengembalian " + kode + " terlambat " + hariTerlambat
                + " hari, denda Rp" + denda);
    }
}