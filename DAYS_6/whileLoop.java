package loopingJava.DAYS_6;

import java.util.Scanner;

public class whileLoop {
    
    public static void main(String[] args) {

        // Latihan while loop sederhana, dengan ngecek suatu pin
        int pin, entry;
        
        pin = 232004;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan pin kamu! : ");
            entry = input.nextInt();
            
            while (entry != pin ) {
                System.out.println("PIN kamu tidak sesuai!!");
                System.out.print("Masukkan pin kamu! : ");
                entry = input.nextInt();
            }              
            System.out.println("PIN sudah berhasil, kamu berhasil login!!");
        } catch (Exception e) {
            System.out.println("PIN harus dalam bentuk angka!!(~__~)");
        }

    }
}
