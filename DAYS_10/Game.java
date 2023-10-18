import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
       
        try (Scanner inputan = new Scanner(System.in)) {
            // memanggil class player
            Player Scriptkiddie = new Player();  

            // mengisi dan mengambil atribut player
            System.out.print("\nNama Player!\t\t : ");
            Scriptkiddie.nama = inputan.nextLine();
            Scriptkiddie.setName(Scriptkiddie.nama);
            Scriptkiddie.getName();

            System.out.print("Speed Player!\t\t : ");
            Scriptkiddie.speed = inputan.nextInt();
            Scriptkiddie.setSpeed(Scriptkiddie.speed);
            Scriptkiddie.getSpeed();

            System.out.print("Healthpoint Player!\t : ");
            Scriptkiddie.healthPoint = inputan.nextInt();
            Scriptkiddie.setHealtpoint(Scriptkiddie.healthPoint);
            Scriptkiddie.getHealtpoint();
            
            System.out.println("\n");

            // memanggil method belari player
            Scriptkiddie.berlari();

            if (Scriptkiddie.isDead()) {
                System.out.println("BY.. GAME OVER!!");
            }
        } catch (Exception e) {
            System.out.println("Inputan harus sesuai dengan tipedata!!");
        }
        
       
    }
}
