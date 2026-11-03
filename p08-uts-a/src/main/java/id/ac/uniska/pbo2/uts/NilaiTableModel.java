// Nama : Fadliatul Amaliyah
// NPM  : 2410010585
package id.ac.uniska.pbo2.uts;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class NilaiTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"};
    private final List<Nilai> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Nilai m = daftar.get(baris);
        return switch (kolom) {
            case 0 -> m.npm();
            case 1 -> m.nama();
            case 2 -> m.tugas();
            case 3 -> m.uts();
            case 4 -> m.uas();
            case 5 -> String.format("%.2f", m.hitungNilaiAkhir());
            default -> m.getHurufMutu();
        };
    }

    public void tambah(Nilai data) {
        daftar.add(data);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    
    public boolean adaNpm(String npm) {
        for (Nilai m : daftar) {
            if (m.npm().equals(npm)) {
                return true;
            }
        }
        return false;
    }

    
    public double hitungRataRata() {
        if (daftar.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (Nilai m : daftar) {
            total += m.hitungNilaiAkhir();
        }
        return total / daftar.size();
    }
}