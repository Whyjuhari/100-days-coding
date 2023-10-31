package DAYS_23;

public class Pekerja {
    private String nama, pekerjaan;
    private int gaji;
    private double pajak, bantuan;
    private double gaji_bersih = 0;

    Pekerja(String nama, String pekerjaan, int gaji) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public void hitungGaji() {

        // Kondisi untuk penghasilan
        if (gaji > 3000000) {
            pajak = (double) 5/100 * gaji;
        } else if(gaji > 10000000) {
            pajak = (double) 15/100 * gaji; 
        } else {
            pajak = 0;
        }

        // Kondisi untuk pekerjaan
        if (pekerjaan.equalsIgnoreCase("petani")) {
            bantuan = 1000000;
        } else if(pekerjaan.equalsIgnoreCase("pns")) {
            bantuan = 0;
        } else {
            bantuan = 200000;
            // gaji_bersih = gaji + bantuan;
        }
        gaji_bersih = gaji - pajak + bantuan;
        
    }
    
    public void tampilDetail() {
        System.out.println("\nHITUNG GAJI");
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Pekerjaan\t : " + pekerjaan);
        System.out.println("Pajak\t\t : " + pajak);
        System.out.println("Bantuan\t\t : " + bantuan);
        System.out.println("Gaji bulanan\t : " + gaji_bersih);
    }

    
}
