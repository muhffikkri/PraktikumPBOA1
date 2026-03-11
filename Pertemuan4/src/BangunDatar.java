/* Nama File    : BangunDatar.java
 * Deskripsi    : Kelas induk (superclass) untuk bangun datar, berisi atribut dan method dasar
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

public class BangunDatar {
    /************ATRIBUT************/
    // Menggunakan protected agar bisa diakses langsung oleh subclass
    protected int jmlSisi;      // jumlah sisi bangun datar
    protected String warna;     // warna bangun datar
    protected String border;    // jenis border bangun datar
    
    // Atribut static untuk menghitung jumlah objek BangunDatar
    private static int counterBangunDatar = 0;

    /************METHOD************/
    // Konstruktor default, menambah counter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor berparameter untuk inisialisasi semua atribut
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Mengembalikan jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Mengeset jumlah sisi dengan nilai baru
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengembalikan warna bangun datar
    public String getWarna() {
        return warna;
    }

    // Mengeset warna dengan nilai baru
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengembalikan jenis border
    public String getBorder() {
        return border;
    }

    // Mengeset border dengan nilai baru
    public void setBorder(String border) {
        this.border = border;
    }

    // Mencetak informasi bangun datar (dapat di-override oleh subclass)
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Method static untuk mencetak jumlah objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}