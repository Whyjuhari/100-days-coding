package DAYS_14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try (Scanner inputanUser = new Scanner(System.in)) {
            // Mingisi data user
            System.out.println("\t=====================");
            System.out.println("\tWELCOME TO COURSE-NET");
            System.out.println("\t=====================");

            System.out.print("Masukkan nama lengkap anda\t : ");
            String nama = inputanUser.nextLine();
            System.out.print("Masukkan alamat anda\t\t : ");
            String alamat = inputanUser.nextLine();
            System.out.print("Masukkan provinsi anda\t\t : ");
            String provinsi = inputanUser.nextLine();
            System.out.print("Masukkan kode pos anda\t\t : ");
            int kodepos = inputanUser.nextInt();
            System.out.print("Masukkan nomot telepon anda\t : ");
            Long nohp = inputanUser.nextLong();

            // Memanggil class pelajar dan membuat object (masihPemula)
            Pelajar masihPemula = new Pelajar(nama, alamat, provinsi, kodepos, nohp);
            masihPemula.setHargaProgram();
            masihPemula.detailPendaftaran();

        } catch (Exception e) {
            System.out.println("Inputan harus sesuai tipedata!");

        }


    }
}
