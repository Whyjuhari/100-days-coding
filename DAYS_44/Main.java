package DAYS_44;

public class Main {
    public static void main(String[] args) {
        
        String[][] mahasiswa = {
            {"Nama", "Umur", "Nim", "Jurusan"},
            {"Juhari", "20", "D0221322", "Informatika"},
            {"Ar", "15", "D0223122", "Sistem Informasi"},
            {"Juhar", "18", "D0222231", "Matematika"}
        };
        gambarTabel(mahasiswa);
    }

    public static void gambarTabel(String[][] mahasiswa) {
        
        // Menggambar baris
        for (int i = 0; i < mahasiswa[0].length; i++) {
            System.out.print("+------------------");
        }
        System.out.println("+");

        // Menggambar data mahasiswa
        for (String[] baris : mahasiswa) {
            for (String sel : baris) {
                System.out.printf("| %-17s", sel);
            }
            System.out.println("|");

            // Membuat garis horizontal antara setiap baris
            for (int i = 0; i < baris.length; i++) {
                System.out.print("+------------------");
            }
            System.out.println("+");
        }
    }
}
