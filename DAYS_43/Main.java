package DAYS_43;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputDong = new Scanner(System.in);

        System.out.print("\nMasukkan jumlah mahasiswa : ");
        int n = inputDong.nextInt();

        String nama[] = new String[n];
        String status[] = new String[n];
        int nilai[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa Ke : " + (i+1));

            System.out.print("Nama\t : ");
            nama[i] = inputDong.next();

            System.out.print("Nilai\t : ");
            nilai[i] = inputDong.nextInt();

            if (nilai[i] <= 50) {
                status[i] = "Tidak lulus";
            } else {
                status[i] = "Lulus";
            }
        }
        tampilData(nama, status, nilai, n);
    }
    public static void tampilData(String nama[], String status[], int nilai[], int n) {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("======================================");
        System.out.println("No\t Nama\t  Nilai\t Status   ");
        System.out.println("======================================");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"\t "+nama[i]+"\t  "+nilai[i]+"\t "+status[i]); 
        }
        System.out.println("======================================");
    }
}
