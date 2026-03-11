/* Nama File    : Main.java
 * Deskripsi    : Program utama untuk menguji class Persegi dan Lingkaran
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi dengan sisi=5, warna merah, border solid
        Persegi p1 = new Persegi(5, "Merah", "Solid");
        System.out.println("--- Info Persegi ---");
        p1.printInfo();     // Menampilkan informasi persegi
        
        System.out.println();

        // Membuat objek Lingkaran dengan diameter=7, warna biru, border dashed
        Lingkaran l1 = new Lingkaran(7, "Biru", "Dashed");
        System.out.println("--- Info Lingkaran ---");
        l1.printInfo();     // Menampilkan informasi lingkaran

        System.out.println();

        // Menampilkan total objek BangunDatar yang telah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}