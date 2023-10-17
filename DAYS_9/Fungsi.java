package Fungsi.DAYS_9;
import java.util.Scanner;
public class Fungsi {
    public static void main(String[] args) {

        // Latihan fungsi rekursif
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.print("Masukkan angka! : ");
            int angka = userInput.nextInt();
            
            int jumlah = faktorial(angka);
            System.out.format("Hasil faktorial dari %d = %d\n",angka,jumlah);
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka!");
        }
        
    }

    // Fungsi rekursif sederhana dengan faktorial
    private static int faktorial(int nilai) {
        if (nilai == 1) {
            return nilai;
        }
        return nilai * faktorial(nilai - 1);
    }

}
