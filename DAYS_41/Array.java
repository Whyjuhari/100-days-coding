package DAYS_41;

import java.util.Scanner;
import java.util.ArrayList;
public class Array {
    
    public static void main(String[] args) {

        int batasAwal, batasAkhir, angkaGenap, angkaGanjil;
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Integer> genap = new ArrayList<>();
            ArrayList<Integer> ganjil = new ArrayList<>();

            System.out.print("Batas awal : ");
            batasAwal = input.nextInt();

            System.out.print("Batas akhir : ");
            batasAkhir = input.nextInt();

            for (int i = batasAwal; i <= batasAkhir; i++) {
                if (i % 2 == 0) {
                    genap.add(i);
                } else {
                    ganjil.add(i);
                }
            }

            System.out.println("\n");
            System.out.println(genap);
            System.out.println(ganjil);

            angkaGenap = genap.get(0);
            angkaGanjil = ganjil.get(0);
            for (int x = 1; x < genap.size(); x++) {
                angkaGenap -= genap.get(x);
            }
            for (int x = 1; x < ganjil.size(); x++) {
                angkaGanjil -= ganjil.get(x);
            } 
            System.out.println("Pengurangan angka genap : " + angkaGenap);
            System.out.println("Pengurangan angka ganjil : " + angkaGanjil);

    
        } catch (Exception e) {
            System.err.println("Inputan harus berupa angka!!!");
        }


    }
}
