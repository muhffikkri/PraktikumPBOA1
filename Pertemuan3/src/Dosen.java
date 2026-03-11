/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 2 Maret 2026
 */


public class Dosen {
    // Atribut
    private String nip;
    private String nama;
    private String prodi;

    // Method

    // Konstruktor tanpa parameter
    public Dosen() {
        nip = "#";
        nama = "#";
        prodi = "#";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // mengembalikan nilai nip
    String getNIP() {
        return nip;
    }

    // mengembalikan nilai nama
    String getNama() {
        return nama;
    }

    // mengembalikan nilai prodi
    String getProdi() {
        return prodi;
    }

    // mengeset nilai nip
    public void setNIP(String newNip) {
        nip = newNip;
    }

    // mengeset nilai nama
    public void setNama(String newNama) {
        nama = newNama;
    }

    // mengeset nilai prodi
    public void setProdi(String newProdi) {
        prodi = newProdi;
    }
}
