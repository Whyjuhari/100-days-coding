import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pesan : ");
        String message = input.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". " + message);
        }

        System.out.println("Pesan ini dimulai dari 5.");
        for (int i = 5; i <= 50; i += 5) {
            System.out.println(i + ". " + message);
        }

        System.out.println("Terakhir, pesan ditampilkan 3 kali dari atas.");
        for (int i = 3; i >= 1; i--) {
            System.out.println(i + ". " + message);
        }
    }
}
