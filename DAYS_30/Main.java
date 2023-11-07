package DAYS_30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputDong = new Scanner(System.in);
        
        while (true) {

            System.out.print("Masukkan Angka : ");
            double angka = inputDong.nextDouble();
            
            
            System.out.print("Masukkan satuan [m, cm, km]: ");
            String satuan = inputDong.next();
            
            
            System.out.print("Masukkan satuan konversi [m, cm, km]: ");
            String satuanKonversi = inputDong.next();
            
            if (satuan.equals(satuanKonversi)) {
                System.out.println("Satuan konversi tidak boleh sama. Coba lagi.");
                continue;
            }
            

            double hasil = 0.0;
            
            if (satuan.equals("m")) {
                if (satuanKonversi.equals("cm")) {
                    hasil = angka * 100;
                } else if (satuanKonversi.equals("km")) {
                    hasil = angka / 1000;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                    continue;
                }
            } else if (satuan.equals("cm")) {
                if (satuanKonversi.equals("m")) {
                    hasil = angka / 100;
                } else if (satuanKonversi.equals("km")) {
                    hasil = angka / 100000;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                    continue;
                }
            } else if (satuan.equals("km")) {
                if (satuanKonversi.equals("m")) {
                    hasil = angka * 1000;
                } else if (satuanKonversi.equals("cm")) {
                    hasil = angka * 100000;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                    continue;
                }
            } else {
                System.out.println("Satuan asal tidak valid. Silakan coba lagi.");
                continue;
            }
            
            System.out.println("Hasil konversi: " + hasil + " " + satuanKonversi);
            
            System.out.print("Ingin melakukan konversi lagi? (y/n): ");
            String ulangi = inputDong.next();
            if (!ulangi.equalsIgnoreCase("y")) {
                break;
            }
        }
        
        inputDong.close();
    }
}

