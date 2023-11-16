package DAYS_39;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        try (Scanner inputDong = new Scanner(System.in)) {
            System.out.print("\nMasukkan nama\t\t : ");
            String nama = inputDong.next();
            
            System.out.print("Masukkan golongan\t : ");
            char golongan = inputDong.next().charAt(0);

            System.out.print("Masukkan jam kerja\t : ");
            int jam = inputDong.nextInt();

            Karyawan jrCode = new Karyawan(nama, golongan, jam);
            
            jrCode.hitungGaji();
            jrCode.detailKaryawan();
        } catch (Exception e) {
            System.err.println("Inputan harus sesuai dengan tipedata!!");
        }

    
    }

}
