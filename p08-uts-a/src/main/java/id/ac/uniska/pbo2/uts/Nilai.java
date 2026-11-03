// Nama : Fadliatul Amaliyah
// NPM  : 2410010585
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author amell
 */
public record Nilai(String npm, String nama, int tugas, int uts, int uas) {
    public double hitungNilaiAkhir() {
        return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
    }
    
    public String getHurufMutu() {
        double akhir = hitungNilaiAkhir();
        if (akhir >= 80) return "A";
        if (akhir >= 75) return "B+";
        if (akhir >= 70) return "B";
        if (akhir >= 65) return "C+";
        if (akhir >= 60) return "C";
        if (akhir >= 40) return "D";
        return "E";
    }
    
    public Status getStatus() {
        double akhir = hitungNilaiAkhir();
        if (akhir >= 60) {
            return Status.LULUS;
        } else if (akhir >= 40) {
            return Status.REMIDIAL;
        } else {
            return Status.TIDAK_LULUS;
        }
    }
}
