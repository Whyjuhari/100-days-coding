package StatementJava;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        try (Scanner inputCuaca = new Scanner(System.in)) {

            System.out.print("Cuaca Di Hari Ini : ");
            String cuaca = inputCuaca.nextLine();

            if (cuaca.equals("Hujan")) {
                System.out.println("Saya akan membeli makanan dengan gofood!");
            } else if (cuaca.equals("Mendung")) {
                System.out.println("Saya akan pergi ke restoran untuk membeli makanan dengan mengendarai mobil!");
            } else if (cuaca.equals("Cerah") || cuaca.equals("Panas")) {
                System.out.println("Saya akan pergi ke restoran untuk membeli makanan dengan mengendarai motor!");
            } else {
                System.out.println("Selain cuaca diatas saya akan pergi ke restoran dengan memakai payung!");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
