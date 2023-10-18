import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
       
        try (Scanner inputan = new Scanner(System.in)) {
            // memanggil class player
            Player Scriptkiddie = new Player();  

            // mengisi dan mengambil atribut player

            System.out.print("\nNama Player!\t\t : ");
            String nama = inputan.nextLine();
            Scriptkiddie.setName(nama);
            Scriptkiddie.getName();

            System.out.print("Speed Player!\t\t : ");
            int speed = inputan.nextInt();
            Scriptkiddie.setSpeed(speed);
            Scriptkiddie.getSpeed();

            System.out.print("Healthpoint Player!\t : ");
            int healthPoint = inputan.nextInt();
            Scriptkiddie.setHealtpoint(healthPoint);
            Scriptkiddie.getHealtpoint();
            
            System.out.println("\n");

            // memanggil method player
            Scriptkiddie.berlari();

            if (Scriptkiddie.isDead()) {
                System.out.println("BY.. GAME OVER!!");
            }
        }
        
       
    }
}