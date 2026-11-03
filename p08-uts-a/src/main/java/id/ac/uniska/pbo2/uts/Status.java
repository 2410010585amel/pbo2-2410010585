// Nama : Fadliatul Amaliyah
// NPM  : 2410010585
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author amell
 */
public enum Status {
    LULUS("Lulus"),
    REMIDIAL("Remidial"),
    TIDAK_LULUS("Tidak Lulus");

    private final String label;

    Status(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
