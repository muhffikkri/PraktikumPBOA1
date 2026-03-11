/* Nama File    : Persegi.java
 * Deskripsi    : Kelas turunan dari BangunDatar yang merepresentasikan bangun persegi
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

public class Persegi extends BangunDatar {
    /************ATRIBUT************/
    private double sisi;                // panjang sisi persegi
    public static int CounterPersegi;   // counter untuk menghitung jumlah objek Persegi

    /************METHOD************/
    // Konstruktor default, mengeset jumlah sisi = 4 dan menambah counter
    public Persegi() {
        setJmlSisi(4);
        CounterPersegi++;
    }
    
    // Konstruktor berparameter menggunakan keyword super untuk memanggil konstruktor superclass
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
        CounterPersegi++;
    }

    // Mengembalikan nilai sisi persegi
    public double getSisi() {
        return sisi;
    }

    // Mengeset sisi persegi dengan nilai baru
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menghitung dan mengembalikan luas persegi (sisi * sisi)
    public double getLuas() {
        return sisi * sisi;
    }

    // Menghitung dan mengembalikan keliling persegi (4 * sisi)
    public double getKeliling() {
        return 4 * sisi;
    }

    // Menghitung dan mengembalikan panjang diagonal persegi (√2 * sisi)
    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    // Override method printInfo untuk menampilkan informasi lengkap persegi
    @Override
    public void printInfo() {
        super.printInfo(); // Memanggil method printInfo dari superclass
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
    
    // Method static untuk mencetak jumlah objek Persegi yang telah dibuat
    public static void printCounterPersegi() {
        System.out.println("Jumlah Objek Persegi: " + CounterPersegi);
    }
}