package DAYS_15;

public class Sepuh {
    private int hargaKartu, modal, penjualanHarian, hargaHpReadme;
    // private int totalTabungan = modal;
    private int tahun, bulan;


    Sepuh(int hargaKartu, int modal, int penjualanHarian, int hargaHpReadme, int bulan) {
        this.hargaKartu = hargaKartu;
        this.modal = modal;
        this.penjualanHarian = penjualanHarian;
        this.hargaHpReadme = hargaHpReadme;
        this.bulan = bulan;
    }

    public void hitungTotal() {
        while (modal < hargaHpReadme) {
            modal += penjualanHarian * hargaKartu;
            penjualanHarian++;
            if (penjualanHarian > 7) {
                penjualanHarian = 0;
            }
            if (bulan % 12 == 0) {
                // Pengurangan biaya wifi setiap bulan
                modal -= 300000;
            }
            bulan++;
        }

        tahun = bulan / 12;

    }

    // Mendapatkan tahun
    public void hitungTotalTahun() {
        System.out.println("Fyan bisa mengumpulkan uang sebanyak 2.400.000 dalam " + tahun + " tahun");
    }
}
