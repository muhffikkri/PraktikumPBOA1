/* Nama File    : Lingkaran.java
 * Deskripsi    : Kelas turunan dari BangunDatar yang merepresentasikan bangun lingkaran
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

public class Lingkaran extends BangunDatar{
    /************ATRIBUT************/
    private double jari;    // jari-jari lingkaran

    /************METHOD************/
    // Konstruktor default, mengeset jumlah sisi = 1 (lingkaran dianggap punya 1 sisi)
    public Lingkaran(){
        setJmlSisi(1);
    }

    // Konstruktor berparameter dengan diameter, warna, dan border
    public Lingkaran (double diameter, String warna, String border){
        super(1, warna, border);    // memanggil konstruktor superclass
        this.jari = diameter/2;     // mengkonversi diameter ke jari-jari
    }

    // Mengembalikan nilai jari-jari lingkaran
    public double getJari (){
        return jari; 
    }

    // Mengeset jari-jari dengan nilai baru
    public void setJari(double jari){
        this.jari = jari;
    }

    // Menghitung dan mengembalikan luas lingkaran (π * r²)
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    // Menghitung dan mengembalikan keliling lingkaran (2 * π * r)
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    // Override method printInfo untuk menampilkan informasi lengkap lingkaran
    @Override
    public void printInfo() {
        super.printInfo();  // Memanggil method printInfo dari superclass
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}