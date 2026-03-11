/* Nama File    : Tendik.java
 * Deskripsi    : Kelas turunan Pegawai untuk Tenaga Kependidikan dengan bidang kerja
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    /************ATRIBUT************/
    private String bidang;      // Bidang kerja tendik (Akademik, Keuangan, dll)
    private final int BUP = 55; // Batas Usia Pensiun tendik (55 tahun)

    /************METHOD************/
    // Konstruktor untuk inisialisasi atribut tendik
    public Tendik(String nip, String nama, String tglLahir, String tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // Mencetak informasi lengkap tendik dengan tanggal simulasi
    public void printInfo(LocalDate tglSimulasi) {
        super.printInfo();
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);
        
        var mk = getMasaKerja(tglSimulasi);
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        
        // Tanggal pensiun jatuh pada tanggal 1 bulan berikutnya dari (tglLahir + BUP)
        LocalDate pensiun = tglLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
        System.out.println("Tanggal Pensiun : " + pensiun.format(fmt));
        
        // Tunjangan tendik = 1% x masa kerja (tahun) x gaji pokok
        double tunjangan = 0.01 * mk.getYears() * gajiPokok;
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", tunjangan));
    }

    // Mengembalikan bidang kerja tendik
    public String getBidang() {
        return bidang;
    }

    // Mengeset bidang kerja dengan nilai baru
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // Mengembalikan Batas Usia Pensiun (hanya getter karena final)
    public int getBUP() {
        return BUP;
    }
}