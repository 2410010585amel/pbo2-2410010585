package id.ac.uniska.pbo2.p02.perpustakaan.mini;

/**
 * Skripsi merupakan turunan Koleksi yang hanya dapat dibaca di tempat.
 */
public class Skripsi extends Koleksi {

    private final String penulis;
    private final String programStudi;

    public Skripsi(String kode, String judul, int tahunTerbit, String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    @Override
    public int batasHariPinjam() {
        return 0; // Skripsi tidak boleh dipinjam keluar
    }

    @Override
    public boolean pinjam() {
        return false; // Selalu gagal dipinjam (hanya dibaca di tempat)
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        return 0L; // Skripsi tidak memiliki denda
    }

    @Override
    public String keterangan() {
        return "Skripsi karya " + penulis + " (" + programStudi + ")";
    }
}