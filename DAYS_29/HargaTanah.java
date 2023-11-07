public class HargaTanah {
    public static void main(String[] args) {
        int jumlahKampling = 30;
        double panjangLahan = 10;
        double lebarLahan = 15;
        double hargaPerMeterPersegi = 500000; 
        
        double luasPerKampling = panjangLahan * lebarLahan;
        double hargaPerKampling = luasPerKampling * hargaPerMeterPersegi; // dalam rupiah

        double totalHarga = hargaPerKampling * jumlahKampling; // dalam rupiah

        System.out.println("Total keseluruhan harga tanah: " + totalHarga + " rupiah");
    }
}
