package DAYS_32;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // Membuka file
        fileInput = new FileInputStream("input.txt");
        // System.out.println((char)fileInput.read());

        // Membaca file
        // int data = fileInput.read();
        // while ( data != -1) {
        //     System.out.println((char)data);
        //     data = fileInput.read();
            
        // }

        // Menutup file
        fileInput.close();

        try {
            // Membuka file 
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output.txt");

            // Membaca file
            int buffer = fileInput.read();

            while (buffer != -1) {
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }

            // Menulis file
            // fileOutput.write(buffer);

        } finally {
            if (fileInput != null) {
                fileInput.close();
            }
            if (fileOutput != null) {
                fileOutput.close();
            }
        }

        // Menggunakan (try with resources)
        try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("ouput2.txt")  
        ) {
          int data2 = in.read();
          while(data2 != -1) {
            System.out.print((char) data2);
            data2 = in.read();
          }
        } 
    }
}
