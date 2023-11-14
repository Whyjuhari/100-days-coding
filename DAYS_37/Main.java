package DAYS_37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Nama\t : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM\t : ");
            String nim = scanner.nextLine();

            
            int duaDigitTerakhirNIM = Integer.parseInt(nim.substring(nim.length() - 2));

            int gajiPokok = 1000000;
            int gajiLemburPerJam = 5000;
            int lamaLembur = duaDigitTerakhirNIM;
            double pajak = 0.09;
            int potongan = 90000;

            int gajiLembur = gajiLemburPerJam * lamaLembur;
            int gajiKotor = gajiPokok + gajiLembur;
            int gajiBersih = gajiKotor - potongan;

            System.out.println("\nData karyawan");
            System.out.println("Nama            : " + nama);
            System.out.println("Nim             : " + nim);
            System.out.println("Gaji Pokok      : Rp. " + String.format("%,d", gajiPokok));
            System.out.println("Gaji Lembur     : Rp. " + String.format("%,d", gajiLembur));
            System.out.println("Gaji Kotor      : Rp. " + String.format("%,d", gajiKotor));
            System.out.println("Pajak           : " + pajak);
            System.out.println("Gaji Bersih     : Rp. " + String.format("%,d", gajiBersih));
        } catch (Exception e) {
            System.out.println("Inputan tidak sesuai tipedata");
        }
    }
}
