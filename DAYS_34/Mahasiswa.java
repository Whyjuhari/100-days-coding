package DAYS_34;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    static List<String> dataNIM = new ArrayList<>();
    static List<String> dataNama = new ArrayList<>();
    static List<String> dataStudi = new ArrayList<>();
    static List<Double> dataIPK = new ArrayList<>();
    

    void dataMahasiswa(String nim, String nama, String studi, double ipk) {
        dataNIM.add(nim);
        dataNama.add(nama);
        dataStudi.add(studi);
        dataIPK.add(ipk);
    }

    void tampilkanData(int x) {
        int n = 0;
        System.out.println("Jumlah mahasiswa yang telah diinput : " + x);

        for (int i = 0; i < x; i++) {
            n++;
            if (dataIPK.get(i) >= 3.50) {
                System.out.println("------------------");
                System.out.println("Mahasiswa ke : " + n);
                System.out.println("------------------");
                System.out.println("NIM\t : " + dataNIM.get(i));
                System.out.println("Nama\t : " + dataNama.get(i));
                System.out.println("Studi\t : " + dataStudi.get(i));
                System.out.println("IPK\t : " + dataIPK.get(i));
            }
        }
        System.out.println("Mahasiswa yang tidak tampil berarti nilai IPK-nya rendah");
    }
}
