package DAYS_45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();


        buatArray(data, input);
        int nilaiTerbesar = Collections.max(data);
        int nilaiTerkecil = Collections.min(data);

        System.out.println("\n===============================");
        System.out.println("Data : " + data);
        System.out.println("Nilai terbesar : " + nilaiTerbesar);
        System.out.println("Nilai tekecil  : " + nilaiTerkecil);
        System.out.println("===============================");

        genapGanjil(input, nilaiTerbesar, nilaiTerkecil);

    }

    public static void buatArray(ArrayList<Integer> array, Scanner inputan) {
        System.out.print("\nMasukkan jumlah n! : ");
        int n = inputan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka pada index ke " + i + " : ");
            int angka = inputan.nextInt();
            array.add(angka);
        }    
    }

    public static void genapGanjil(Scanner inputan, int nilaiTerbesar, int nilaiTerkecil) {
        System.out.print("Masukkan angka : ");
        int angka = inputan.nextInt();
        int total = 0;
        if (angka % 2 == 0) {
            total = angka + nilaiTerbesar;
            System.out.format("Total dari %d + %d = %d\n",angka, nilaiTerbesar,total);
        } else {
            total = angka + nilaiTerkecil;
            System.out.format("Total dari %d + %d = %d\n",angka, nilaiTerkecil,total);
        }
    }

}
