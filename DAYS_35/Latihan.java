package DAYS_35;

class Semangka  {
    private double hargaSemangka;
    private double banyakKeranjang;
    private double buahPerKeranjang;

    private double totalBanyakBuah;

    Semangka(double harga, double keranjang, double buah) {
        this.hargaSemangka = harga;
        this.banyakKeranjang = keranjang;
        this.buahPerKeranjang = buah;
    }

    void hitungHarga() {
        // karena terdapa 3 keranjang buah semangka yang busuk maka
        banyakKeranjang -= 3;
        totalBanyakBuah = buahPerKeranjang * banyakKeranjang;
        double totalHarga = hargaSemangka * totalBanyakBuah;
        System.out.println("Total uang yang diterima ibu riska adalah " + totalHarga);
    }
    
}

public class Latihan {
    public static void main(String[] args) {

        Semangka cumanSemangka = new Semangka(5500, 48, 21);
        cumanSemangka.hitungHarga();
    }
}
