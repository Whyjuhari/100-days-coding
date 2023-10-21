package DAYS_12;

public class Main {
    public static void main(String[] args) {
        
        // pc gaming = 150
        // gaji 13 jt / bulan
        // tagihan = 4 jt
        // biaya anak = 3 jt
        // biaya istri = 1 jt
        // tabungan <= 5 jt
        // Berapa tahun sambo harus menabung untuk bisa membeli pc gaming tersebut.

        Sambo gg = new Sambo(150000000, 13000000, 8000000);

        gg.getTabungan();
        gg.hitungTahun();
        gg.tampilTahun();
        

    }

}
