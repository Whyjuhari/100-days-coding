package DAYS_86;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    JTextField sisiField, panjangField, lebarField, tinggiField, panjangAlasField, lebarAlasField, tinggiLimasField;
    JTextArea resultArea;

    public App() {
        setLayout(null);

        JLabel labelSisi = new JLabel("Panjang Sisi Kubus:");
        labelSisi.setBounds(10, 10, 150, 20);
        add(labelSisi);

        sisiField = new JTextField();
        sisiField.setBounds(160, 10, 100, 20);
        add(sisiField);

        JButton btnKubus = new JButton("Hitung Kubus");
        btnKubus.setBounds(270, 10, 150, 20);
        btnKubus.addActionListener(this);
        add(btnKubus);

        JLabel labelPanjang = new JLabel("Panjang Balok:");
        labelPanjang.setBounds(10, 40, 150, 20);
        add(labelPanjang);

        panjangField = new JTextField();
        panjangField.setBounds(160, 40, 100, 20);
        add(panjangField);

        JLabel labelLebar = new JLabel("Lebar Balok:");
        labelLebar.setBounds(10, 70, 150, 20);
        add(labelLebar);

        lebarField = new JTextField();
        lebarField.setBounds(160, 70, 100, 20);
        add(lebarField);

        JLabel labelTinggiBalok = new JLabel("Tinggi Balok:");
        labelTinggiBalok.setBounds(10, 100, 150, 20);
        add(labelTinggiBalok);

        tinggiField = new JTextField();
        tinggiField.setBounds(160, 100, 100, 20);
        add(tinggiField);

        JButton btnBalok = new JButton("Hitung Balok");
        btnBalok.setBounds(270, 70, 150, 20);
        btnBalok.addActionListener(this);
        add(btnBalok);

        JLabel labelPanjangAlas = new JLabel("Panjang Alas Limas:");
        labelPanjangAlas.setBounds(10, 130, 150, 20);
        add(labelPanjangAlas);

        panjangAlasField = new JTextField();
        panjangAlasField.setBounds(160, 130, 100, 20);
        add(panjangAlasField);

        JLabel labelLebarAlas = new JLabel("Lebar Alas Limas:");
        labelLebarAlas.setBounds(10, 160, 150, 20);
        add(labelLebarAlas);

        lebarAlasField = new JTextField();
        lebarAlasField.setBounds(160, 160, 100, 20);
        add(lebarAlasField);

        JLabel labelTinggiLimas = new JLabel("Tinggi Limas:");
        labelTinggiLimas.setBounds(10, 190, 150, 20);
        add(labelTinggiLimas);

        tinggiLimasField = new JTextField();
        tinggiLimasField.setBounds(160, 190, 100, 20);
        add(tinggiLimasField);

        JButton btnLimas = new JButton("Hitung Limas");
        btnLimas.setBounds(270, 160, 150, 20);
        btnLimas.addActionListener(this);
        add(btnLimas);

        resultArea = new JTextArea();
        resultArea.setBounds(10, 220, 380, 80);
        resultArea.setEditable(false);
        add(resultArea);

        setTitle("Bangun Ruang Calculator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Hitung Kubus")) {
            hitungVolumeKubus();
        } else if (e.getActionCommand().equals("Hitung Balok")) {
            hitungVolumeBalok();
        } else if (e.getActionCommand().equals("Hitung Limas")) {
            hitungVolumeLimas();
        }
    }

    public void hitungVolumeKubus() {
        try {
            double sisi = Double.parseDouble(sisiField.getText());
            double volume = Math.pow(sisi, 3);
            resultArea.setText("Volume kubus adalah: " + volume);
        } catch (NumberFormatException ex) {
            resultArea.setText("Masukkan angka yang valid untuk sisi kubus.");
        }
    }

    public void hitungVolumeBalok() {
        try {
            double panjang = Double.parseDouble(panjangField.getText());
            double lebar = Double.parseDouble(lebarField.getText());
            double tinggi = Double.parseDouble(tinggiField.getText());
            double volume = panjang * lebar * tinggi;
            resultArea.setText("Volume balok adalah: " + volume);
        } catch (NumberFormatException ex) {
            resultArea.setText("Masukkan angka yang valid untuk panjang, lebar, dan tinggi balok.");
        }
    }

    public void hitungVolumeLimas() {
        try {
            double panjangAlas = Double.parseDouble(panjangAlasField.getText());
            double lebarAlas = Double.parseDouble(lebarAlasField.getText());
            double tinggiLimas = Double.parseDouble(tinggiLimasField.getText());
            double luasAlas = panjangAlas * lebarAlas;
            double volume = (luasAlas * tinggiLimas) / 3.0;
            resultArea.setText("Volume limas adalah: " + volume);
        } catch (NumberFormatException ex) {
            resultArea.setText("Masukkan angka yang valid untuk panjang, lebar alas, dan tinggi limas.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App().setVisible(true));
    }
}
