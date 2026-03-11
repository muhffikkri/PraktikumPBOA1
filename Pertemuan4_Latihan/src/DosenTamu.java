/* Nama File    : DosenTamu.java
 * Deskripsi    : Kelas turunan Dosen untuk dosen tamu dengan NIDK dan kontrak terbatas
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /************ATRIBUT************/
    private String nidk;                    // Nomor Induk Dosen Khusus
    private LocalDate tglBerakhirKontrak;   // Tanggal berakhirnya kontrak dosen tamu

    /************METHOD************/
    // Konstruktor untuk inisialisasi atribut dosen tamu
    public DosenTamu(String nip, String nidk, String nama, String tglLahir, String tmt, double gajiPokok, String fakultas, String tglBerakhir) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = LocalDate.parse(tglBerakhir, fmt);
    }

    // Mencetak informasi lengkap dosen tamu dengan tanggal simulasi
    public void printInfo(LocalDate tglSimulasi) {
        super.printInfo();
        System.out.println("NIDK            : " + nidk);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        
        // Menghitung sisa kontrak dari tanggal simulasi
        Period sisa = Period.between(tglSimulasi, tglBerakhirKontrak);
        System.out.println("Sisa Kontrak    : " + sisa.getYears() + " tahun " + sisa.getMonths() + " bulan");
        
        // Tunjangan dosen tamu = 2.5% x gaji pokok (tidak tergantung masa kerja)
        double tunjangan = 0.025 * gajiPokok;
        System.out.println("Tunjangan       : Rp " + String.format("%,.2f", tunjangan));
    }

    // Mengembalikan NIDK dosen tamu
    public String getNidk() {
        return nidk;
    }

    // Mengeset NIDK dengan nilai baru
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    // Mengembalikan tanggal berakhir kontrak
    public LocalDate getTglBerakhirKontrak() {
        return tglBerakhirKontrak;
    }

    // Mengeset tanggal berakhir kontrak dengan nilai baru
    public void setTglBerakhirKontrak(LocalDate tglBerakhirKontrak) {
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }
}