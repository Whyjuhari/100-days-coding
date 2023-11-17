package DAYS_40;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaksi extends Barang implements Aktor {

  private String petugas;
  private String pembeli;
  private String[] kodeBarang;
  private String[] namaBarang;
  private int[] hargaBarang;
  private int[] jmlBarang;
  private int[] subTotal;
  private int total;
  private int index = -1;
  
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  Date now = new Date();
  String tanggal = sdf.format(now);
  
  public void jumlahPembelian(int x){
    this.kodeBarang = new String[x];
    this.namaBarang = new String[x];
    this.hargaBarang = new int[x];
    this.jmlBarang = new int[x];
    this.subTotal = new int[x];
  }
  
  
  public void setJumlahBeli (int jumlah){
    if(this.index == kodeBarang.length - 1){
      return;
    }
    
    int currentIndex = ++this.index;
    
    this.kodeBarang[currentIndex] = super.getKodeBarang();
    this.namaBarang[currentIndex] = super.getNamaBarang();
    this.hargaBarang[currentIndex] = super.getHarga();
    this.jmlBarang[currentIndex] = jumlah;
    this.subTotal[currentIndex] = jumlah * super.getHarga();
    
  }
  
  public void cetakTransaksi(){
    
    System.out.format("Nama petugas : " + this.petugas + "%n");
    System.out.format("Nama pembeli : " + this.pembeli + "%n%n");
    
    String leftAlignFormat = "| %-1d | %-4s | %-15s | %-9d | %-6d | %-9d |%n";
    System.out.format("+---+------+-----------------+-----------+--------+-----------+%n");
    System.out.format("|No.| Kode |   Nama Barang   |   Harga   | Jumlah |   Total   |%n");
    System.out.format("+---+------+-----------------+-----------+--------+-----------+%n");
    
    int total = 0;
    
    for(int i = 0; i < kodeBarang.length; i++){
      
      String kode = kodeBarang[i];
      String nama = namaBarang[i];
      int harga = hargaBarang[i];
      int jumlah = jmlBarang[i];
      int subtotal = subTotal[i];
      total = total + subtotal;
      
      if (kode != null){
        System.out.format(leftAlignFormat, i+1, kode, nama, harga, jumlah, subtotal);
      }

    }
    
    System.out.format("+---+------+-----------------+-----------+--------+-----------+%n");
    System.out.format("Total Pendapatan tanggal " + tanggal + " adalah sebesar : " + total + "%n");
  }
  
  // jangan lupa untuk mengimplementasikan SEMUA method dari interface.
  public void setPetugas(String nama) { this.petugas = nama; }
  public void setPembeli(String nama) { this.pembeli = nama; }
  
  

}