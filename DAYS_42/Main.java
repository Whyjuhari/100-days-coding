package DAYS_42;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList bersarang
        ArrayList<ArrayList<String>> meja = new ArrayList<>();

        Scanner inputan = new Scanner(System.in);


        for (int bar = 0; bar < 2; bar++) {
            meja.add(new ArrayList<String>());
            for (int kol = 0; kol < 3; kol++) {
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja.get(bar).add(inputan.nextLine());
            }
        }


        System.out.println("\n----------------------------------");
        for (ArrayList<String> baris : meja) {
            for (String nama : baris) {
                System.out.format("| %s |", nama);
            }
            System.out.println("");
        }
        System.out.println("----------------------------------");
    }
}
