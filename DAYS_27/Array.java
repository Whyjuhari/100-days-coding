import java.util.ArrayList;

public class SearchingExample {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Juhari");
        daftarNama.add("Juh");
        daftarNama.add("Hari");
        daftarNama.add("Ri");

        String namaYgDicari = "Ari";
        
        if (daftarNama.contains(namaYgDicari)) {
            System.out.println(namaYgDicari + " ditemukan dalam daftar.");
        } else {
            System.out.println(namaYgDicari + " tidak ditemukan dalam daftar.");
        }
    }
}
