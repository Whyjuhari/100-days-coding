package DAYS_12;

public class Sambo {
    
    private int hargaPc, gaji, pengeluaran, tabungan;
    private double bulan, tahun;

    Sambo(int hargaPc, int gaji, int pengeluaran) {
        this.hargaPc = hargaPc;
        this.gaji = gaji;
        this.pengeluaran = pengeluaran;
    }

    public void getTabungan() {
        tabungan = gaji - pengeluaran;
    }

    public void hitungTahun() {
        bulan = (double) hargaPc / tabungan;
        tahun = (double) bulan / 12;
    }

    public void tampilTahun() {
        System.out.println("-----------------------------------------------");
        System.out.println("Sambo harus menabung selama " + tahun + " tahun");
        System.out.println("-----------------------------------------------");
    }
}
