package DAYS_36;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner inputHari = new Scanner(System.in)) {
            int tahun = 365;
            int bulan = 30;
            int minggu = 7;
            
            ArrayList<String> gabungan = new ArrayList<>();

            System.out.print("Masukkan jumlah hari : ");
            int hari = inputHari.nextInt();

            if (hari % tahun != 0) {
                gabungan.add(hari / tahun + " Tahun");
                hari = hari % tahun;
                if (hari % bulan != 0) {
                    gabungan.add(hari / bulan + " Bulan");
                    hari = hari % bulan;
                    if (hari % minggu != 0) {                    
                        gabungan.add(hari / minggu + " Minggu");
                        hari = hari % minggu;
                        if (hari % 1 != 0) {
                            gabungan.add(hari / 1 + " Hari");
                            hari = hari % 1;
                        } else {
                            hari = hari / 1;
                            gabungan.add(hari + " Hari");
                        }
                    } else {
                        hari = hari / minggu;
                        gabungan.add(hari + " Minggu");
                    }
                } else {
                    hari = hari / bulan;
                    gabungan.add(hari + " Bulan");
                }
            } else {
                hari = hari / tahun;
                gabungan.add(hari + " Tahun");
            }

            System.out.println(String.join(", ", gabungan));
        } catch (Exception e) {
            System.err.println("Inputan harus berupa angka!!");
        }
    }
}

