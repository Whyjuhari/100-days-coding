package DAYS_14;
import java.util.Scanner;
public class Pelajar {
    
    Scanner pilihanUser = new Scanner(System.in);
 
    // Identitas 
    private String nama, alamat, provinsi;
    private int kode_pos;
    private Long nohp;

    // Daftar Program Pembelajaran
    private int algoritmaP, dSystem, cNetwork, oop, android;
    private int pilihan1, pilihan2, pilihan3, pilihan4, pilihan5;
    private int total;

    // konstruktor untuk class pelajar
    Pelajar(String nama, String alamat, String provinsi, int kode_pos, Long nohp) {
        this.nama = nama;
        this.alamat = alamat;
        this.provinsi = provinsi;
        this.kode_pos = kode_pos;
        this.nohp = nohp;
    }

    // Method menghitung total program.
    public void setHargaProgram() {

        System.out.format("\nHello, %s \nList program pembelajaran yang tersedia \n[1 untuk ambil / 0 untuk tidak]",nama);

        System.out.println("\n---------------------------------------------------");
        System.out.print("\nAlgoritma dan struktur data (Rp. 500000)\t : ");
        pilihan1 = pilihanUser.nextInt();
        System.out.print("Database System (Rp. 1000000)\t\t\t : ");
        pilihan2 = pilihanUser.nextInt();
        System.out.print("Computer Network (Rp. 1500000)\t\t\t : ");
        pilihan3 = pilihanUser.nextInt();
        System.out.print("Object Oriented (Rp. 2000000)\t\t\t : ");
        pilihan4 = pilihanUser.nextInt();
        System.out.print("Android (Rp. 2500000)\t\t\t\t : ");
        pilihan5 = pilihanUser.nextInt();
        System.out.println("\n---------------------------------------------------");


        // kondisi if untuk setiap jenis program pembelajaran
        if (pilihan1 == 1) {
            algoritmaP = 500000;
            total = algoritmaP;
        } if (pilihan2 == 1) {
            dSystem = 1000000;
            total = dSystem;
        } if (pilihan3 == 1) {
            cNetwork = 1500000;
            total = cNetwork;
        } if (pilihan4 == 1) {
            oop = 2000000;
            total = oop;
        } if (pilihan5 == 1) {
            android = 2500000;
            total = android;
        } else {
            total = 0;
        } 
        total = algoritmaP + dSystem + cNetwork + oop + android;
    }
    
    // Method menampilkan detail seorang pelajar. Serta total yang harus dibayar
    public void detailPendaftaran() {
        System.out.println("\nNama lengkap\t : " + nama);
        System.out.println("Alamat\t\t : " + alamat);
        System.out.println("Kode pos\t : " + kode_pos);
        System.out.println("Provinsi\t : " + provinsi);
        System.out.println("No. Telp\t : " + nohp);

        System.out.println("\nTotal biaya kursus : " + total);
        System.out.println("Terimah kasih telah bergabung dengan Course-Net");
    }
    
}
