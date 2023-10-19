package DAYS_11;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try (Scanner inputan = new Scanner(System.in)) {
            System.out.print("Masukkan pekerjaan\t : ");
            String pekerjaan = inputan.nextLine();
            System.out.print("Masukkan penghasilan\t : ");
            int gaji = inputan.nextInt();

            Pekerja juniorCode = new Pekerja(pekerjaan, gaji);

            // menghitung pajak & dan total gaji
            juniorCode.hitungPajak();
            juniorCode.hitungGajiBersih();

            // menampilkan hasil pajak dan gaji bersih
            juniorCode.ambilPajak();
            juniorCode.ambilGajiBersih();
        } catch (Exception e) {
            System.out.println("Inputan harus sesuai dengan tipe data!!");
        }

    }

}