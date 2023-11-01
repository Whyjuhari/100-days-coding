package DAYS_24;

public class UcupBelanja {
    public static void main(String[] args) {
        
        double totalHargaApel = 0;
        double totalHargaAnggur = 0;
        double totalHargaRambutan = 0;
        double totalHargaJeruk = 0;

        // Inisialisasi harga dari masing-masing buah
        double hargaApel = 5000;
        double hargaAnggur = 3000;
        double hargaRambutan = 15000;
        double hargaJeruk = 45000;
        
        // Inisialisasi berat dari masing-masing buah
        double beratapelPerbuah = 200;
        double beratanggurPerbuah = 100;
        double beratrambutanPerbuah = 1000;
        double beratjerukPerbuah = 1000;

        // Inisialisasi jumlah kg dari masing-masing buah
        double jumlahKgApel = 20;
        double jumlahKgAnggur = 18;
        double jumlahKgRambutan = 17;
        double jumlahKgJeruk = 29;

        // Inisialisasi total kg dari masing-masing buah
        double totalBeratApel = 1000 * jumlahKgApel;
        double totalBeratAnggur = 1000 * jumlahKgAnggur;
        double totalBeratRambutan = 1000 * jumlahKgRambutan;
        double totalBeratJeruk = 1000 * jumlahKgJeruk;

        
        // Menghitung total harga masing-masing buah
        totalHargaApel = hargaApel * (totalBeratApel / beratapelPerbuah);
        totalHargaAnggur = (hargaAnggur / 100) * (totalBeratAnggur / beratanggurPerbuah);
        totalHargaRambutan = (hargaRambutan / 1000) * (totalBeratRambutan / beratrambutanPerbuah);
        totalHargaJeruk = (hargaJeruk / 3000) * (totalBeratJeruk / beratjerukPerbuah);

        // System.out.println(totalHargaApel);
        // System.out.println(totalHargaAnggur);
        // System.out.println(totalHargaRambutan);
        // System.out.println(totalHargaJeruk);
        
        // Menghitung tambahan bonus
        double bonusApel = (totalBeratApel / 5000) * 0.5;
        double bonusAnggur = (totalBeratAnggur / 5000) * 0.5;
        double bonusRambutan = (totalBeratRambutan / 5000) * 0.5;
        double bonusJeruk = (totalBeratJeruk / 5000) * 0.5;

        // Kemudian menambah bonus ke masing-masing buah
        totalHargaApel += (bonusApel * hargaApel);
        totalHargaAnggur += (bonusAnggur * (hargaAnggur / 100));
        totalHargaRambutan += (bonusRambutan * (hargaRambutan / 1000));
        totalHargaJeruk += (bonusJeruk * (hargaJeruk / 3000));

        double totalHargaSemuaBuah = totalHargaApel + totalHargaAnggur + totalHargaRambutan + totalHargaJeruk;
        
        double totalBeratSemuaBuah = totalBeratApel + totalBeratAnggur + totalBeratRambutan + totalBeratJeruk;

        double diskon = 0;

        // Untuk mendapatkan diskon pembelian buah
        if (totalBeratSemuaBuah > 20000) {
            diskon = totalHargaSemuaBuah * 0.002;
        } else {
            diskon = 0;
        }

        double totalPembayaranAkhir = totalHargaSemuaBuah - diskon;

        System.out.println("Harga Apel\t\t : " + totalHargaApel);
        System.out.println("Harga Anggur\t\t : " + totalHargaAnggur);
        System.out.println("Harga Rambutan\t\t : " + totalHargaRambutan);
        System.out.println("Harga Jeruk\t\t : " + totalHargaJeruk);
        System.out.println("Total Harga\t\t : " + totalHargaSemuaBuah);
        System.out.println("Total Diskon\t\t : " + diskon);
        System.out.println("Total Bonus\t\t : " + (bonusApel + bonusAnggur + bonusRambutan + bonusJeruk));
        System.out.println("\nTotal yang dibayar oleh ucup adalah : \n" + totalPembayaranAkhir);




;
    }
}
