package DAYS_62;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form implements ActionListener {


    JFrame frame = new JFrame("NGODING AJA DULUU!!");

    JPanel panel = new JPanel();
    
    JTextField namaPengirim = new JTextField();
    JTextField noTelepon = new JTextField();

    // Menu pilihan
    JComboBox tujuan, asuransi;

    JRadioButton regular;
    JRadioButton express;

    JLabel judul = new JLabel("FORM PEGIRIMAN BARANG");
    
    JLabel nama = new JLabel("Nama");
    JLabel notelp = new JLabel("No Hp");

    JLabel labelTujuan = new JLabel("Tujuan");
    JLabel jenisPengiriman = new JLabel("Jenis");

    JLabel labelBerat = new JLabel("Berat"); 
    JTextField beratBarang = new JTextField();

    JLabel labelAsuransi = new JLabel("Asuransi"); 

    JButton submit = new JButton("submit");
    JButton reset = new JButton("reset");

    Form() {

        judul.setBounds(120, 50, 300, 25);
        judul.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        nama.setBounds(50, 100, 200, 25);
        notelp.setBounds(50, 150, 200, 25);
        namaPengirim.setBounds(150, 100, 200, 35);
        noTelepon.setBounds(150, 150, 200, 35);

        // Inputan untuk pilihan
        String[] pilihan = {"-=pilih=-","Bandung", "Jakarta", "Semarang"};
        labelTujuan.setBounds(50, 200, 150, 25);
        tujuan = new JComboBox<>(pilihan);
        tujuan.addActionListener(this);
        tujuan.setBounds(150, 200, 200, 25);

        // Pilihan jenis pengiriman
        jenisPengiriman.setBounds(50, 240, 200, 25);
        regular = new JRadioButton("REGULAR");
        regular.setBounds(150, 240, 100, 35);
        regular.addActionListener(this);
        express = new JRadioButton("EXPRESS");
        express.setBounds(250, 240, 100, 35);
        express.addActionListener(this);

        // agar radiobutton tidak bisa dipilih dua-duanya
        ButtonGroup group = new ButtonGroup();
        group.add(regular);
        group.add(express);

        // Inputan berat barang
        labelBerat.setBounds(50, 290, 200, 25);
        beratBarang.setBounds(150, 290, 200, 35);

        // Pilihan asuransi
        labelAsuransi.setBounds(50, 340, 200, 25);
        String[] pilih = {"-=pilih=-","YA", "TIDAK"};
        asuransi = new JComboBox<>(pilih);
        asuransi.setBounds(150, 340, 200, 25);



        // Tombol submit dan reset
        submit.setBounds(150, 400, 100, 25);
        submit.addActionListener(this);
        
        reset.setBounds(250, 400, 100, 25);
        reset.addActionListener(this);

        panel.setBackground(Color.GREEN);
        panel.setBounds(0,450,420, 150);
        panel.setLayout(null);


        // Label 
        frame.add(judul);
        frame.add(nama);
        frame.add(notelp);

        // Text input
        frame.add(namaPengirim);
        frame.add(noTelepon);

        frame.add(labelTujuan);
        frame.add(tujuan);

        frame.add(jenisPengiriman);
        frame.add(regular);
        frame.add(express);

        frame.add(labelBerat);
        frame.add(beratBarang);

        frame.add(labelAsuransi);
        frame.add(asuransi);

        frame.add(submit);
        frame.add(reset);

        // frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String pilihTujuan = tujuan.getSelectedItem().toString();
            double harga_perKg = 0;

            if (regular.isSelected()) {
                if (pilihTujuan.equals("Bandung")) {
                    harga_perKg = 10000;
                } else if (pilihTujuan.equals("Jakarta")) {
                    harga_perKg = 20000;
                } else if (pilihTujuan.equals("Semarang")) {
                    harga_perKg = 30000;
                }
            } else if (express.isSelected()) {
                if (pilihTujuan.equals("Bandung")) {
                    harga_perKg = 12000;
                } else if (pilihTujuan.equals("Jakarta")) {
                    harga_perKg = 24000;
                } else if (pilihTujuan.equals("Semarang")) {
                    harga_perKg = 35000;
                }
            }

            double berat = Double.parseDouble(beratBarang.getText());
            double harga = harga_perKg * berat;
            double totalHarga = 0;
            double biayaAsuransi = 0.07 * harga;

            if (asuransi.getSelectedItem().toString().equals("YA")) {
                totalHarga = harga + biayaAsuransi;
            } else {
                totalHarga = harga;
            }

            System.out.println("\n===== HASIL PERHITUNGAN ====");
            System.out.println("Nama Pengirim\t : " + namaPengirim.getText());
            System.out.println("No Telepon\t : " + noTelepon.getText());
            System.out.println("Tujuan\t\t : " + pilihTujuan);
            System.out.println("Jenis Pengiriman : " + regular.getText());
            System.out.println("Berat Barang\t : " + berat + " kg");
            System.out.println("Asuransi\t : " + asuransi.getSelectedItem());
            System.out.println("\nBAYAR\t\t : Rp. " + harga);
            System.out.println("BIAYA ASURANSI\t : Rp. " + biayaAsuransi);
            System.out.println("TOTAL BAYAR\t : Rp. " + totalHarga);
            
        }
        else if (e.getSource()==reset) {
            namaPengirim.setText("");
            noTelepon.setText("");
            tujuan.setSelectedIndex(0);
            regular.setSelected(false);
            express.setSelected(false);
            beratBarang.setText("");
            asuransi.setSelectedIndex(0);
        }
    }
    
}
