/* Nama File    : MainLatihan.java
 * Deskripsi    : Program utama untuk menguji kelas-kelas Pegawai, Dosen, dan Tendik
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainLatihan {
    public static void main(String[] args) {
        // Format tanggal Indonesia
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        
        // Tanggal simulasi (hari ini)
        LocalDate tglSimulasi = LocalDate.now();
        System.out.println("Tanggal Simulasi: " + tglSimulasi.format(fmt));
        System.out.println();

        // Contoh pembuatan objek Dosen Tetap
        DosenTetap dosen1 = new DosenTetap(
            "9545647548", "78647324", "Andi", 
            "5 Mei 1990", "1 Januari 2015", 5000000, 
            "Fakultas Sains dan Matematika"
        );

        System.out.println("=== INFORMASI DOSEN TETAP ===");
        dosen1.printInfo(tglSimulasi); // Memanggil dengan parameter tanggal simulasi
        System.out.println();

        // Contoh pembuatan objek Tendik
        Tendik staf1 = new Tendik(
            "123456789", "Budi", 
            "10 Maret 1995", "1 Februari 2020", 4000000, 
            "Akademik"
        );

        System.out.println("=== INFORMASI TENDIK ===");
        staf1.printInfo(tglSimulasi); // Memanggil dengan parameter tanggal simulasi
    }
}