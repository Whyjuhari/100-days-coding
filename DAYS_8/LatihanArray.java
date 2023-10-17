import java.util.Scanner;
public class LatihanArray {

    public static void main(String[] args) {
        
        // Latihan array multi dimensi
        // membuat array
        
        String[][] meja = new String[2][3];
        try (Scanner inputArray = new Scanner(System.in)) {            
            // mengisi setiap array
            for (int bar = 0; bar < meja.length; bar++) {
                for (int kol = 0; kol < meja[bar].length; kol++) {
                    System.out.format("Siapa yang akan duduk dimeja (%d, %d): ", bar, kol);
                    meja[bar][kol] = inputArray.nextLine();
                }
            }
    
            // menampilkan array
            System.out.println("-----------------------------");
            for (int bar = 0; bar < meja.length; bar++) {
                for (int kol = 0; kol < meja[bar].length; kol++) {
                    System.out.format("| %s | \t", meja[bar][kol]);
                }
                System.out.println("");
            }
            System.out.println("-----------------------------");
        }

    }
    
}
