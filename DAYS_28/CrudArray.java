
import java.util.ArrayList;
import java.util.Scanner;

public class CrudArray {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        Scanner inputanMu = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah nama");
            System.out.println("2. Lihat nama-nama");
            System.out.println("3. Ubah nama");
            System.out.println("4. Hapus nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1/2/3/4/5): ");

            int pilihan = inputanMu.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama yang akan ditambahkan: ");
                    String namaBaru = inputanMu.next();
                    daftarNama.add(namaBaru);
                    System.out.println("Nama " + namaBaru + " ditambahkan.");
                    break;

                case 2:
                    System.out.println("Daftar nama-nama:");
                    for (String nama : daftarNama) {
                        System.out.println(nama);
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nama yang akan diubah: ");
                    String namaLama = inputanMu.next();
                    System.out.print("Masukkan nama baru: ");
                    String updateNama = inputanMu.next();
                    if (daftarNama.contains(namaLama)) {
                        int index = daftarNama.indexOf(namaLama);
                        daftarNama.set(index, updateNama);
                        System.out.println("Nama " + namaLama + " telah diubah menjadi " + updateNama);
                    } else {
                        System.out.println("Nama " + namaLama + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang akan dihapus: ");
                    String namaYgDihapus = inputanMu.next();
                    if (daftarNama.contains(namaYgDihapus)) {
                        daftarNama.remove(namaYgDihapus);
                        System.out.println("Nama " + namaYgDihapus + " telah dihapus.");
                    } else {
                        System.out.println("Nama " + namaYgDihapus + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    inputanMu.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, 4, atau 5.");
            }
        }
    }
}
