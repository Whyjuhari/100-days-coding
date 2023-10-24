package DAYS_16;
public class IbuUcup {
    
    private int uangAwal, targetBawah, targetAtas, tabunganHarian, minggu;

    IbuUcup(int uang, int tBawah, int tAtas, int tabungan, int minggu) {
         this.uangAwal = uang;   
         this.targetBawah = tBawah;   
         this.targetAtas = tAtas;   
         this.tabunganHarian = tabungan;   
         this.minggu = minggu;   

    }

    // Method hitung hari
    public void hitungHari() {
        while (uangAwal < targetAtas) {
            uangAwal += tabunganHarian * 7;
            minggu++;

            if (uangAwal >= targetBawah && uangAwal <= targetAtas) {
                System.out.println("Ibu Ucup harus menabung selama " + minggu + " minggu.");
                break;
            }
        }
    } 


}
