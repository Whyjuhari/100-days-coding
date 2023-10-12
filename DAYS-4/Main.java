package StatementJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        try (Scanner input = new Scanner(System.in)){
        
            System.out.println("Cuaca Di hari Ini : ");
            String cuaca = input.nextLine();

            switch (cuaca) {
                case "hujan":
                    System.out.println("Saya akan membeli makanan dengan gofood");
                    break;
                case "mendung":
                    System.out.println("Saya akan pergi ke restoran membeli makanan dengan mengendarai mobil");
                    break;
                case "cerah":
                    System.out.println("Saya akan pergi ke restoran membeli makanan dengan mengendarai motor");
                    break;
                default:
                    System.out.println("Selain cuaca diatas saya akan pergi ke restoran dengan memakai payung");
                    break;
        }
        } catch (Exception e) {
            System.out.println("Yang di input harus dalam bentuk huruf / string");
        }
        

    }   
}
