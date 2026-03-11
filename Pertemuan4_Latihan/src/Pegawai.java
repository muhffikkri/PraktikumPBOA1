/* Nama File    : Pegawai.java
 * Deskripsi    : Kelas induk (superclass) untuk semua pegawai, berisi atribut dan method dasar
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /************ATRIBUT************/
    protected String nip;           // Nomor Induk Pegawai
    protected String nama;          // Nama pegawai
    protected LocalDate tglLahir;   // Tanggal lahir pegawai
    protected LocalDate tmt;        // Tanggal Mulai Tugas
    protected double gajiPokok;     // Gaji pokok pegawai
    protected DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID")); // Format tanggal Indonesia

    /************METHOD************/
    // Konstruktor untuk inisialisasi semua atribut pegawai
    public Pegawai(String nip, String nama, String tglLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = LocalDate.parse(tglLahir, fmt);
        this.tmt = LocalDate.parse(tmt, fmt);
        this.gajiPokok = gajiPokok;
    }

    // Menghitung masa kerja berdasarkan tanggal simulasi yang diinput
    // Return: Period yang berisi tahun dan bulan masa kerja
    public Period getMasaKerja(LocalDate tglSimulasi) {
        return Period.between(tmt, tglSimulasi);
    }

    // Mencetak informasi dasar pegawai
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir.format(fmt));
        System.out.println("TMT             : " + tmt.format(fmt));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
    }

    // Mengembalikan NIP pegawai
    public String getNip() {
        return nip;
    }

    // Mengeset NIP dengan nilai baru
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Mengembalikan nama pegawai
    public String getNama() {
        return nama;
    }

    // Mengeset nama dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengembalikan tanggal lahir pegawai
    public LocalDate getTglLahir() {
        return tglLahir;
    }

    // Mengeset tanggal lahir dengan nilai baru
    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    // Mengembalikan TMT pegawai
    public LocalDate getTmt() {
        return tmt;
    }

    // Mengeset TMT dengan nilai baru
    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    // Mengembalikan gaji pokok pegawai
    public double getGajiPokok() {
        return gajiPokok;
    }

    // Mengeset gaji pokok dengan nilai baru
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}