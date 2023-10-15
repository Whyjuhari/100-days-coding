package loopingJava.DAYS_7;

import java.util.Scanner;
public class doWhile {
    

    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Latihan perulangan do while");
            int current, total = 0;

            do {
                System.out.print("Masukkan nilai : ");
                current = input.nextInt();
                total += current;
                System.out.printf("Total nilai saat ini %d\n",total);
                
            } while(current != 0);
            System.out.printf("Total nilai akhir %d\n",total);


            
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka!!");
        };






    }

}
