package DAYS_13;

public class Semen {
    
    private int harga_semen, jumlah_semen;
    private double potongan, diskon, total_harga;

    Semen(int harga, int jumlah) {
        this.harga_semen = harga;
        this.jumlah_semen = jumlah;
    }

    // Hitung total bayar berdasarkan pajak
    public void hitungTotalHarga() {
        if (jumlah_semen >= 100 && jumlah_semen < 200) {
            potongan = (double) 2/100 * harga_semen;
            total_harga = harga_semen * jumlah_semen - potongan;            
        }
        else if(jumlah_semen == 200 || jumlah_semen >= 200) {
            diskon = (double) 5/100 * harga_semen;
            total_harga = harga_semen * jumlah_semen - diskon;
        } 
        else {
            total_harga = harga_semen * jumlah_semen;
        }

    }

    // Tampilkan hasil dari total harga semen
    public void tampilkanTotal() {
        System.out.println("Total harga yang harus dibayar : " + total_harga);
    }

}
