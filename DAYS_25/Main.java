package DAYS_25;

public class Main {
    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(8);
        Segitiga segitiga = new Segitiga(10, 15);
        Lingkaran lingkaran = new Lingkaran(25);

        // bangunDatar.luas();
        // bangunDatar.keliling();

        System.out.println("Luas persegi\t\t : " + persegi.luas());
        System.out.println("Keliling persegi\t : " + persegi.keliling());
        System.out.println("Luas segitiga\t\t : " + segitiga.luas());
        System.out.println("Luas lingkaran\t\t : " + lingkaran.luas());
    }
}
