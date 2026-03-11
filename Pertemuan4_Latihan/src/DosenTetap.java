/* Nama File    : DosenTetap.java
 * Deskripsi    : Kelas turunan Dosen untuk dosen tetap dengan NIDN dan tunjangan berdasarkan masa kerja
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /************ATRIBUT************/
    private String nidn;        // Nomor Induk Dosen Nasional
    private final int BUP = 65; // Batas Usia Pensiun dosen tetap (65 tahun)

    /************METHOD************/
    // Konstruktor untuk inisialisasi atribut dosen tetap
    public DosenTetap(String nip, String nidn, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas); // Memanggil konstruktor Dosen
        this.nidn = nidn;
    }

    // Menghitung tanggal pensiun dosen tetap
    // Pensiun jatuh pada tanggal 1 bulan berikutnya dari (tglLahir + BUP)
    public LocalDate getTanggalPensiun() {
        return tglLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    // Mencetak informasi lengkap dosen tetap dengan tanggal simulasi
    public void printInfo(LocalDate tglSimulasi) {
        super.printInfo();
        System.out.println("NIDN            : " + nidn);
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);
        
        var mk = getMasaKerja(tglSimulasi);
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getTanggalPensiun().format(fmt));
        
        // Tunjangan dosen tetap = 2% x masa kerja (tahun) x gaji pokok
        double tunjangan = 0.02 * mk.getYears() * gajiPokok;
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", tunjangan));
    }

    // Mengembalikan NIDN dosen tetap
    public String getNidn() {
        return nidn;
    }

    // Mengeset NIDN dengan nilai baru
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    // Mengembalikan Batas Usia Pensiun (hanya getter karena final)
    public int getBUP() {
        return BUP;
    }
}