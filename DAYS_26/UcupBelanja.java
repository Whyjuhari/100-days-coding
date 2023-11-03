package DAYS_26;

public class UcupBelanja {
    public static void main(String[] args) {
        

        double jumlah_apel = 20;
        double jumlah_anggur = 18;
        double jumlah_rambutan = 17;
        double jumlah_jeruk = 29;

        double bonus_apel = hitungBonus(jumlah_apel);
        double bonus_anggur = hitungBonus(jumlah_anggur);
        double bonus_rambutan = hitungBonus(jumlah_rambutan);
        double bonus_jeruk = hitungBonus(jumlah_jeruk);

        double harga_apel = 5000 * 5;
        double harga_anggur = 3000;
        double anggur_sekilo = harga_anggur * 10;
        double harga_tambutan = 15000;
        double harga_jeruk = 45000 / 3;
        
        double total_harga_apel = hitungHarga(jumlah_apel, harga_apel);
        double total_harga_anggur =  hitungHarga(jumlah_anggur, anggur_sekilo);
        double total_harga_rambutan =  hitungHarga(jumlah_rambutan, harga_tambutan);
        double total_harga_jeruk =  hitungHarga(jumlah_jeruk, harga_jeruk);

        double totalBayar = total_harga_apel + total_harga_anggur + total_harga_rambutan + total_harga_jeruk;

        System.out.println("Total harga apel\t\t : " + total_harga_apel);
        System.out.println("Total harga anggur\t\t : " + total_harga_anggur);
        System.out.println("Total harga rambutan\t\t : " + total_harga_rambutan);
        System.out.println("Total harga jeruk\t\t : " + total_harga_jeruk);
        System.out.println("Total harga yang bayar oleh ucup : " + totalBayar);

        double jumlahbonus_apel = jumlah_apel + bonus_apel;
        double jumlahbonus_anggur = jumlah_anggur + bonus_apel;
        double jumlahbonus_rambutan = jumlah_rambutan + bonus_apel;
        double jumlahbonus_jeruk = jumlah_jeruk + bonus_apel;

        System.out.println();
        System.out.println("Jumlah buah apel : " + jumlahbonus_apel);
        System.out.println("Jumlah buah anggur : " + jumlahbonus_anggur);
        System.out.println("Jumlah buah rambutan : " + jumlahbonus_rambutan);
        System.out.println("Jumlah buah jeruk : " + jumlahbonus_jeruk);

    }

    public static double hitungHarga(double jumlah, double harga) {
        double diskon;
        if (jumlah > 20) {
            diskon = (double) 0.2/100 * harga;
        } else {
            diskon = 0;   
        }
        double totalbayar = (double) (jumlah * harga - diskon);
        return totalbayar;
    }
    public static double hitungBonus(double jumlah) {
        double bonus = (jumlah / 5) * 0.5;
        return bonus;
    }
}
