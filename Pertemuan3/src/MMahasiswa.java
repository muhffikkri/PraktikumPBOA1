/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class MMahasiswa
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 2 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        // Membuat objek mahasiswa, dosen, dan kendaraan
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        
        // Mengatur dosen wali dan kendaraan untuk mahasiswa
        M1.setDosen(D1);
        M1.setKendaraan(K1);
        
        // Menambahkan mata kuliah ke mahasiswa
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        
        // Menampilkan detail mahasiswa
        M1.printDetailMhs();
        
        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
