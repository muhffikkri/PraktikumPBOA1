/* Nama File    : Dosen.java
 * Deskripsi    : Kelas turunan Pegawai untuk dosen, berisi atribut fakultas
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

public class Dosen extends Pegawai {
    /************ATRIBUT************/
    protected String fakultas;  // Fakultas tempat dosen mengajar

    /************METHOD************/
    // Konstruktor untuk inisialisasi atribut dosen
    public Dosen(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // Mengembalikan fakultas dosen
    public String getFakultas() {
        return fakultas;
    }

    // Mengeset fakultas dengan nilai baru
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}