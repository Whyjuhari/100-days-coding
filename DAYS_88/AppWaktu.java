package DAYS_88;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWaktu extends JFrame {

    JTextField inputField;
    JLabel inputan, hasilKonversi;
    JButton tombolKonveri;

    AppWaktu() {
        setTitle("Konversi Waktu V.1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        inputan = new JLabel("Masukkan detik :");
        inputan.setBounds(20, 20, 200, 20);
        add(inputan);

        inputField = new JTextField();
        inputField.setBounds(170, 20, 120, 20);
        add(inputField);

        tombolKonveri = new JButton("Konversi");
        tombolKonveri.setBounds(80, 60, 120, 30);
        tombolKonveri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                konversiWaktu();
            }
        });
        add(tombolKonveri);

        hasilKonversi = new JLabel("Hasil konversi:");
        hasilKonversi.setBounds(20, 110, 300, 20);
        add(hasilKonversi);

        setVisible(true);
    }

    public void konversiWaktu() {
        try {
            int detikInput = Integer.parseInt(inputField.getText());
            int jam = detikInput / 3600;
            int sisaDetik = detikInput % 3600;
            int menit = sisaDetik / 60;
            int detik = sisaDetik % 60;

            String hasil = jam + " jam, " + menit + " menit, " + detik + " detik";
            hasilKonversi.setText("Hasil konversi: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka detik yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppWaktu();
            }
        });
    }
}
