package DAYS_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Pilih bangun ruang:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungVolumeKubus(input);
                    break;
                case 2:
                    hitungVolumeBalok(input);
                    break;
                case 3:
                    hitungVolumeLimas(input);
                    break;
                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
        
        input.close();
    }

    public static void hitungVolumeKubus(Scanner input) {
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        double volume = Math.pow(sisi, 3);
        System.out.println("Volume kubus adalah: " + volume);
    }

    public static void hitungVolumeBalok(Scanner input) {
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah: " + volume);
    }

    public static void hitungVolumeLimas(Scanner input) {
        System.out.print("Masukkan panjang alas limas: ");
        double panjangAlas = input.nextDouble();
        System.out.print("Masukkan lebar alas limas: ");
        double lebarAlas = input.nextDouble();
        System.out.print("Masukkan tinggi limas: ");
        double tinggiLimas = input.nextDouble();
        double luasAlas = panjangAlas * lebarAlas;
        double volume = (luasAlas * tinggiLimas) / 3.0;
        System.out.println("Volume limas adalah: " + volume);
    }
}
