package DAYS_11;
public class Pekerja {
    private int gaji;
    private double gaji_bersih, pajak;
    private String pekerjaan;

    Pekerja(String pekerjaan, int gaji) {
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public void hitungPajak () {
        if (gaji >= 3000000 && gaji < 5000000 && !pekerjaan.equalsIgnoreCase("pns")) {
            pajak = (double) 5/100 * gaji;
        } else if(gaji >= 3000000 && gaji < 5000000 && pekerjaan.equalsIgnoreCase("pns")) {
            pajak = (double) 10/100 * gaji;
        } else if (gaji >= 5000000 && !pekerjaan.equalsIgnoreCase("pns")) {
            pajak = (double) 10/100 * gaji;
        } else if (gaji >= 5000000 && pekerjaan.equalsIgnoreCase("pns")) {
            pajak = (double) 15/100 * gaji;
        } else {
            pajak = 0;
        }
    }

    public void hitungGajiBersih() {
        gaji_bersih = gaji - pajak;
    }

    public void ambilPajak() {
        if (pajak > 0) {
            System.out.println("\nAnda dikenakan pajak sebanyak " + (pajak * 100 / gaji) + "%");
        } else {
            System.out.println("\nAnda tidak dikenakan pajak");
        }
    }

    public void ambilGajiBersih() {
        System.out.println("Total gaji bersih\t : " + gaji_bersih);
    }



}
