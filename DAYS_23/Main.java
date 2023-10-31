package DAYS_23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan nama\t\t : ");
        String nama = inputan.nextLine();
        
        System.out.print("Masukkan pekerjaan\t : ");
        String pekerjaan = inputan.nextLine();
        
        System.out.print("Masukkan Penghasilan\t : ");
        int penghasilan = inputan.nextInt();

        Pekerja asep = new Pekerja(nama, pekerjaan, penghasilan);
        asep.hitungGaji();
        asep.tampilDetail();

    }
}
