/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 2 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa  {
    // Atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Method
    
    // Konstruktor tanpa parameter
    Mahasiswa() {
        nim = "#";
        nama = "#";
        prodi = "#";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    // Konstruktor dengan parameter
    Mahasiswa(String newNim, String newNama, String newProdi) {
        nim = newNim;
        nama = newNama;
        prodi = newProdi;
        this.listMatkul = new ArrayList<>();
    }

    // Menghitung total SKS dari semua mata kuliah
    int getJumlahSKS() {
        int total = 0;
        
        for (MataKuliah mataKuliah : listMatkul) {
            total = total + mataKuliah.getSks();
        }

        return total;
    }

    // Mengembalikan jumlah mata kuliah
    int getJumlahMatKul() {
        return listMatkul.size();
    }

    // Mengembalikan nilai nim
    String getNim() {
        return nim;
    }

    // Mengembalikan nilai nama
    String getNama() {
        return nama;
    }

    // Mengembalikan nilai prodi
    String getProdi() {
        return prodi;
    }

    // Mengembalikan daftar mata kuliah
    ArrayList<MataKuliah> getListMatKul() {
        return listMatkul;
    }

    // Mengembalikan dosen wali
    Dosen getDosen() {
        return dosenWali;
    }

    // Mengembalikan kendaraan
    Kendaraan getKendaraan() {
        return kendaraan;
    }

    // Mengatur nilai nim
    public void setNim(String newNim) {
        nim = newNim;
    }

    // Mengatur nilai nama
    public void setNama(String newNama) {
        nama = newNama;
    }

    // Mengatur nilai prodi
    public void setProdi(String newProdi) {
        prodi = newProdi;
    }

    // Mengatur dosen wali
    public void setDosen(Dosen newDosen) {
        dosenWali = newDosen;
    }

    // Mengatur kendaraan
    public void setKendaraan(Kendaraan newKendaraan) {
        kendaraan = newKendaraan;
    }
    
    // Menambahkan mata kuliah ke dalam list
    public void addMatKul (MataKuliah newMatKul) {
        listMatkul.add(newMatKul);
    }

    // Mencetak informasi singkat mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah MatKul: " + getJumlahMatKul());
    }

    // Mencetak informasi lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar mata kuliah: ");
        for (MataKuliah mataKuliah : listMatkul) {
            System.out.println(mataKuliah.getNamaMatKul());
        }
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis());
    }
    
}