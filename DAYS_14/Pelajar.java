package DAYS_14;


import java.util.Scanner;
public class Pelajar {
 
    // Identitas 
    private String nama, alamat, provinsi;
    private int kode_pos;
    private Long nohp;

    // Daftar Program Pembelajaran
    private int algoritmaP, dSystem, cNetwork, oop, android;
    private int pilihan1, pilihan2, pilihan3, pilihan4, pilihan5;
    private int total;


    Scanner pilihanUser = new Scanner(System.in);

    // konstruktor untuk class pelajar
    Pelajar(String nama, String alamat, String provinsi, int kode_pos, Long nohp) {
        this.nama = nama;
        this.alamat = alamat;
        this.provinsi = provinsi;
        this.kode_pos = kode_pos;
        this.nohp = nohp;
    }

    public void setHargaProgram() {

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
