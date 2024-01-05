package DAYS_89;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWaktu extends JFrame {

    JTextField inputField;
    JLabel inputan, hasilKonversi, labelJenisWaktu;
    JButton tombolKonversi;
    JComboBox<String> jenisWaktuComboBox;

    public AppWaktu() {
        setTitle("Konversi Waktu V.2");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        inputan = new JLabel("Masukkan nilai");
        inputan.setBounds(20, 20, 200, 20);
        add(inputan);

        inputField = new JTextField();
        inputField.setBounds(170, 20, 120, 20);
        add(inputField);

        labelJenisWaktu = new JLabel("Pilih Jenis Waktu");
        labelJenisWaktu.setBounds(20, 50, 200, 20);
        add(labelJenisWaktu);

        jenisWaktuComboBox = new JComboBox<>(new String[]{"Detik", "Menit", "Jam"});
        jenisWaktuComboBox.setBounds(170, 50, 120, 20);
        add(jenisWaktuComboBox);

        tombolKonversi = new JButton("Konversi");
        tombolKonversi.setBounds(80, 90, 120, 30);
        tombolKonversi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                konversiWaktu();
            }
        });
        add(tombolKonversi);

        hasilKonversi = new JLabel("Hasil konversi:");
        hasilKonversi.setBounds(20, 130, 300, 20);
        add(hasilKonversi);

        setVisible(true);
    }

    public void konversiWaktu() {
        try {
            int nilaiInput = Integer.parseInt(inputField.getText());
            String jenisWaktu = jenisWaktuComboBox.getSelectedItem().toString();

            int detik = 0;
            if (jenisWaktu.equals("Detik")) {
                detik = nilaiInput;
            } else if (jenisWaktu.equals("Menit")) {
                detik = nilaiInput * 60;
            } else if (jenisWaktu.equals("Jam")) {
                detik = nilaiInput * 3600;
            }

            int jam = detik / 3600;
            int sisaDetik = detik % 3600;
            int menit = sisaDetik / 60;
            int detikSisa = sisaDetik % 60;

            String hasil = jam + " jam, " + menit + " menit, " + detikSisa + " detik";
            hasilKonversi.setText("Hasil konversi: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.", "Error", JOptionPane.ERROR_MESSAGE);
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

