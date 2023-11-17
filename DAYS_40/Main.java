package DAYS_40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner inputDong = new Scanner(System.in)) {
            System.out.print("Masukkan nama petugas : ");
            String namaPetugas = inputDong.next();

            System.out.print("Masukkan nama pembeli : ");
            String namaPembeli = inputDong.next();

            Transaksi t1 = new Transaksi();

            t1.setPetugas(namaPetugas);
            t1.setPembeli(namaPembeli);
            t1.jumlahPembelian(5);

            t1.setKodeBarang("M001");
            t1.setJumlahBeli(2);
            t1.setKodeBarang("P001");
            t1.setJumlahBeli(4);
            t1.setKodeBarang("V001");
            t1.setJumlahBeli(7);
            t1.cetakTransaksi();
        } catch (Exception e) {
            System.err.println("Nama harus berupa string");
        }

    }
}