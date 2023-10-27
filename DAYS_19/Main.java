package DAYS_19;

import java.util.Scanner;

class User{

    protected String username;
    protected String password;

    void register(String username, String password){
        this.username = username;
        this.password = password;
        System.out.println("username : "+ this.username);
        System.out.println("password : "+ this.password);
    }

    void notification() {
        System.out.println("user create by User");
    }    
}

class Admin extends User {
    final String role = "admin";
    
    @Override
    void notification() {
        System.out.println("User Created By " + role);
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("REGISTRASI");
        System.out.print("Masukkan Username : ");
        String username = input.nextLine();
        System.out.print("Masukkan Password : ");
        String password = input.nextLine();


        User user1 = new Admin();
        user1.register(username, password);
        user1.notification();
    }
}
