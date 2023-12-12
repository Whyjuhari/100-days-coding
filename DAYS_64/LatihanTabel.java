package DAYS_64;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class LatihanTabel implements ActionListener{
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
    // Membuat DefaultTableModel untuk tabel
    DefaultTableModel model;

    LatihanTabel() {
        judul.setBounds(120, 50, 300, 25);
        judul.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        nama.setBounds(50, 100, 200, 25);
        notelp.setBounds(50, 150, 200, 25);
        namaPengirim.setBounds(150, 100, 200, 35);
        noTelepon.setBounds(150, 150, 200, 35);

        // Inputan untuk pilihan
        String[] pilihan = {"-=pilih=-","Bandung", "Jakarta", "Semarang" ,"Pallettoang"};
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


        String[] kolom = {"Nama", "No Hp", "Tujuan", "Jenis", "Berat", "Asuransi", "Total Bayar"};

        model = new DefaultTableModel(kolom, 0);

        JLabel judulTabel = new JLabel("DAFTAR PENGIRIMAN BARANG");
        judulTabel.setBounds(750, 50, 400, 50);
        judulTabel.setFont(new Font("Comic Sans MS",Font.BOLD,15));

        // Membuat tabel 
        JTable dataTable = new JTable(model);
        // dataTable.setFont(new Font("Comic Sans MS", Font.BOLD, 13))
        dataTable.setRowHeight(20);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER); 

        // ini artinya mengambil item pada tabel berdasarkan posisi kolom.
        // dataTable.getColumnModel().getColumn(0).setCellRenderer(center);

        // untuk mengambil semua item pada tabel, berdasarkan jumlah kolom.
        for (int i = 0; i < dataTable.getColumnCount(); i++) {
            dataTable.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        // Menambahkan tabel ke dalam JScrollPane
        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setBounds(450, 100, 850, 150);
        frame.add(scrollPane);


        // Label 
        frame.add(judul);
        frame.add(judulTabel);
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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1350,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            // Proses perhitungan total bayar
            String selectedTujuan = tujuan.getSelectedItem().toString();
            double hargaPerKg = 0;

            if (regular.isSelected()) {
                if (selectedTujuan.equals("Bandung")) {
                    hargaPerKg = 10000;
                } else if (selectedTujuan.equals("Jakarta")) {
                    hargaPerKg = 20000;
                } else if (selectedTujuan.equals("Semarang")) {
                    hargaPerKg = 30000;
                } else if (selectedTujuan.equals("pallettoang")) {
                    hargaPerKg = 40000;
                }
            } else if (express.isSelected()) {
                if (selectedTujuan.equals("Bandung")) {
                    hargaPerKg = 12000;
                } else if (selectedTujuan.equals("Jakarta")) {
                    hargaPerKg = 24000;
                } else if (selectedTujuan.equals("Semarang")) {
                    hargaPerKg = 35000;
                } else if (selectedTujuan.equals("Pallettoang")) {
                    hargaPerKg = 45000;
                }
            }

            double berat = Double.parseDouble(beratBarang.getText());
            double totalHarga = hargaPerKg * berat;

            if (asuransi.getSelectedItem().toString().equals("YA")) {
                double biayaAsuransi = 0.07 * totalHarga;
                totalHarga += biayaAsuransi;

                DecimalFormat df = new DecimalFormat("#.##");
                totalHarga = Double.parseDouble(df.format(totalHarga));

                model.addRow(new Object[]{namaPengirim.getText(), noTelepon.getText(), selectedTujuan,
                        (regular.isSelected() ? "REGULAR" : "EXPRESS"), berat, "YA", totalHarga});
            } else {
                DecimalFormat df = new DecimalFormat("#.##");
                totalHarga = Double.parseDouble(df.format(totalHarga));

                model.addRow(new Object[]{namaPengirim.getText(), noTelepon.getText(), selectedTujuan,
                        (regular.isSelected() ? "REGULAR" : "EXPRESS"), berat, "TIDAK", totalHarga});
            }

            // Pesan
            JOptionPane.showMessageDialog(null, "Data sudah ditambahkan!", "Pesan", JOptionPane.INFORMATION_MESSAGE);


        } else if (e.getSource() == reset) {
            // Reset semua input
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
