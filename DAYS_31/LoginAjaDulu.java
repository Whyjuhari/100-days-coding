package DAYS_31;

import java.util.Scanner;
import java.util.ArrayList;

public class LoginAjaDulu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> dataUser = new ArrayList<>();

        System.out.println("\nHaloo, Selamat datang di login sederhana");
        System.out.println("Daftar dulu dong!");
        System.out.print("Masukkan username! : ");
        String user = input.next();
        System.out.print("Masukkan password! : ");
        String pass = input.next();
        
        dataUser.add(user);
        dataUser.add(pass);
        
        login(user, pass, input);


    }


    public static void login(String user, String pass, Scanner input) {

        System.out.println("\nSilahkan login!");
        System.out.print("Masukkan username! : ");
        String username = input.next();
        System.out.print("Masukkan password! : ");
        String password = input.next();

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Selamat " + user + " Kamu berhasil login");
        } else if (!username.equals(user) && password.equals(pass)) {
            System.out.println("Username mu salah cuy!!");
            login(user, pass, input);
        } else if (username.equals(user) && !password.equals(pass)) {
            System.out.println("Password mu salah cuy!!");
            login(user, pass, input);
        } else if (!username.equals(user) && !password.equals(pass)) {
            System.out.println("Oops username & password mu salahh!!");
            login(user, pass, input);
        } else {
            System.out.println("Kamu gagal login, Coba lagi nanti yaa!");
            login(user, pass, input);
        }

    }
}
