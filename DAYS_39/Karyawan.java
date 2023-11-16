package DAYS_39;

public class Karyawan {
    private String nama;
    private char golongan;
    private int jamKerja;
    private int upahPerJam = 0, totalGaji = 0, uangLembur = 0;

    Karyawan(String nama, char golongan, int jamKerja) {
        this.nama = nama;
        this.golongan = Character.toUpperCase(golongan);
        this.jamKerja = jamKerja;
    }
    
    void hitungGaji() {
        switch (golongan) {
            case 'A':
                upahPerJam = 5000;
                break;        
            case 'B':
                upahPerJam = 7000;
                break;
            case 'C':
                upahPerJam = 8000;
                break;
            case 'D':
                upahPerJam = 10000;
                break;
            default:
                System.out.println("Golongan hanya dari A sampai D!!!");
                break;
            }
        totalGaji = upahPerJam * jamKerja;
        if ((jamKerja - 48) > 0) {
            uangLembur = (jamKerja-48) * 4000;
        }
        totalGaji += uangLembur;

    }
    
    public void detailKaryawan() {
        System.out.println("\n===== Detail Karyawan =====");
        System.out.printf("Nama karyawan\t : %s\n",nama);
        System.out.printf("Golongan\t : %s\n",golongan);
        System.out.printf("Jam kerja\t : %d\n",jamKerja);
        System.out.printf("%s menerima gaji Rp. %d per minggu\n",nama, totalGaji);
    }

}
