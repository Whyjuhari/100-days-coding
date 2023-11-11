package DAYS_34;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        int x = 0;

        Scanner inputan = new Scanner(System.in);

        Mahasiswa angkatan21 = new Mahasiswa();

        System.out.println("PROGRAM SEDERHANA PENGELOLAHAN DATA MAHASISWA");

        boolean stop = false;

        while (!stop) {
            bersihkanTerminal();
            System.out.print("Masukkan NIM\t : ");
            String nim = inputan.nextLine();

            System.out.print("Masukkan Nama\t : ");
            String nama = inputan.nextLine();

            System.out.print("Masukkan Studi\t : ");
            String studi = inputan.nextLine();

            System.out.print("Masukkan IPK\t : ");
            double IPK = Double.parseDouble(inputan.nextLine());

            angkatan21.dataMahasiswa(nim, nama, studi, IPK);
            x++;

            System.out.print("Ingin lanjut mengisi data? [y/N] : ");
            String lanjut = inputan.nextLine().toLowerCase();
            if (lanjut.equals("n")) {
                stop = true;
            }
        }

        angkatan21.tampilkanData(x);
    }

    public static void bersihkanTerminal() {
        try {
            ProcessBuilder prosesBuild = new ProcessBuilder("clear");
            prosesBuild.inheritIO();
            Process proses = prosesBuild.start();
            proses.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
