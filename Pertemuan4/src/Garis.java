/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 Februari 2026
 */

public class Garis {
    /************ATRIBUT************/
    Titik TAwal;
    Titik TAkhir;
    static int counterGaris = 0;

    /************METHOD************/
    Garis(Titik TAwal, Titik TAkhir) {
        this.TAwal = TAwal;
        this.TAkhir = TAkhir;
        counterGaris++;
    }

    Garis() {
        this(new Titik(0,0),new Titik(1,1));
    }

    public Titik getTAwal() {
        return TAwal;
    }

    public Titik getTAkhir() {
        return TAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public void setTAwal(Titik tAwal) {
        TAwal = tAwal;
    }

    public void setTAkhir(Titik tAkhir) {
        TAkhir = tAkhir;
    }

    double lenGaris() {
        return Math.sqrt(Math.pow(getTAwal().getAbsis() - getTAkhir().getAbsis(), 2) + Math.pow(getTAwal().getOrdinat() - getTAkhir().getOrdinat(), 2));
    }

    double gradien() {
        return (getTAwal().getOrdinat() - getTAkhir().getOrdinat()) / (getTAwal().getAbsis() - getTAkhir().getAbsis());
    }

    Titik TTengahGaris() {
        double P = (getTAwal().getAbsis() + getTAkhir().getAbsis()) / 2;
        double Q = (getTAwal().getOrdinat() + getTAkhir().getOrdinat()) / 2;

        return new Titik(P, Q);
    }

    boolean isSejajar(Garis Gn) {
        double gradP = (getTAwal().getOrdinat() - getTAkhir().getOrdinat()) / (getTAwal().getAbsis() - getTAkhir().getAbsis());
        double gradQ = (Gn.getTAwal().getOrdinat() - Gn.getTAkhir().getOrdinat()) / (Gn.getTAwal().getAbsis() - Gn.getTAkhir().getAbsis());
        
        return gradP == gradQ;
    }

    boolean isTegakLurus(Garis Gn) {
        // double gradP = getTAwal().getOrdinat() - getTAkhir().getOrdinat() / (getTAwal().getAbsis() - getTAkhir().getAbsis());
        // double gradQ = Gn.getTAwal().getOrdinat() - Gn.getTAkhir().getOrdinat() / (Gn.getTAwal().getAbsis() - Gn.getTAkhir().getAbsis());

        // return gradP * gradQ == -1;

        return this.gradien() * Gn.gradien() == -1;
    }

    void printTGaris() {
        getTAwal().printTitik();
        getTAkhir().printTitik();
    }

    void persamaanGaris() {
        double grad = this.gradien();
        double constant = getTAwal().getOrdinat() - grad * getTAwal().getAbsis();
        System.out.println("y = " + grad + "x + " + constant);
    }
}