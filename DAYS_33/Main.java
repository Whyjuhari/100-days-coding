package DAYS_33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Membuat objek HP
        Phone realme8 = new Realme();
        
        // Membuat objek user
        PhoneUser juhari = new PhoneUser(realme8);


        try (Scanner inputan = new Scanner(System.in)) {
            String aksi;

            while (true) {
                System.out.println("=== APLIKASI CLI SEDERHANA ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Perkecil Volume");
                System.out.println("[0] Keluar");
                System.out.println("------------------------------");
                System.out.print("Pilih aksi --> : ");
                aksi = inputan.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    juhari.turnOnThePhone();
                } else if (aksi.equalsIgnoreCase("2")) {
                    juhari.turnOffThePhone();
                } else if (aksi.equalsIgnoreCase("3")) {
                    juhari.makePhoneLouder();
                } else if (aksi.equalsIgnoreCase("4")) {
                    juhari.makePhoneSilent();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Oops... Kamu memilih aksi yang salah!");
                }

            }
        } catch (Exception e) {
            System.out.println("Inputan harus sesuai dengan tipedatanya");
        }

    }   
}
