package DAYS_40;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int harga;


    public String getKodeBarang() {
        return this.kodeBarang;
    }

    public void setKodeBarang(String kode) {
        this.kodeBarang = kode;

        if (kode == "P001") {
            this.namaBarang = "Printer";
            this.harga = 700000;
        } else if(kode == "V001") {
            this.namaBarang = "VGA Card";
            this.harga = 75000;
        } else if(kode == "M001") {
            this.namaBarang = "Motherboard";
            this.harga = 950000;
        } 
    }

    public String getNamaBarang() {
        return this.namaBarang;
    }

    public int getHarga() {
        return this.harga;
    }
}
