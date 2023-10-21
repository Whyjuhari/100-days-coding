package DAYS_13;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
   
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah semen yang dibeli : ");
            int jumlah_semen = inputan.nextInt();


            // Memanggil class semen.
            Semen portland = new Semen(60000, jumlah_semen);
            portland.hitungTotalHarga();
            portland.tampilkanTotal();
            
        } catch (Exception e) {
            System.out.println("Inputan harus sesuai dengan tipe data!!");
        }
    }
    
}