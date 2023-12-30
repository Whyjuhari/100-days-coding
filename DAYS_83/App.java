package DAYS_83;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private JTextField angkaField;
    private JComboBox<String> satuanComboBox;
    private JComboBox<String> satuanKonversiComboBox;
    private JTextArea resultTextArea;

    public App() {
        setTitle("Konversi Sederhana (satuan)");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel angkaLabel = new JLabel("Masukkan Angka:");
        angkaField = new JTextField();

        JLabel satuanLabel = new JLabel("Satuan:");
        String[] satuanOptions = {"m", "cm", "km"};
        satuanComboBox = new JComboBox<>(satuanOptions);

        JLabel satuanKonversiLabel = new JLabel("Satuan Konversi:");
        satuanKonversiComboBox = new JComboBox<>(satuanOptions);

        JButton convertButton = new JButton("Konversi");
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convert();
            }
        });

        add(angkaLabel);
        add(angkaField);
        add(satuanLabel);
        add(satuanComboBox);
        add(satuanKonversiLabel);
        add(satuanKonversiComboBox);
        add(new JLabel()); // Placeholder
        add(convertButton);
        add(new JLabel()); // Placeholder
        add(resultTextArea);
    }

    private void convert() {
        try {
            double angka = Double.parseDouble(angkaField.getText());
            String satuan = (String) satuanComboBox.getSelectedItem();
            String satuanKonversi = (String) satuanKonversiComboBox.getSelectedItem();

            if (satuan.equals(satuanKonversi)) {
                resultTextArea.setText("Satuan konversi tidak boleh sama. Coba lagi.");
                return;
            }

            double hasil = 0.0;

            if (satuan.equals("m")) {
                if (satuanKonversi.equals("cm")) {
                    hasil = angka * 100;
                } else if (satuanKonversi.equals("km")) {
                    hasil = angka / 1000;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                }
            } else if (satuan.equals("cm")) {
                if (satuanKonversi.equals("m")) {
                    hasil = angka / 100;
                } else if (satuanKonversi.equals("km")) {
                    hasil = angka / 100000;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                }
            } else if (satuan.equals("km")) {
                if (satuanKonversi.equals("m")) {
                    hasil = angka * 1000;
                } else if (satuanKonversi.equals("cm")) {
                    hasil = angka * 100000;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                }
            } else {
                System.out.println("Satuan asal tidak valid. Silakan coba lagi.");
            }

            resultTextArea.setText("Hasil konversi: " + hasil + " " + satuanKonversi);
        } catch (NumberFormatException ex) {
            resultTextArea.setText("Masukkan angka yang valid.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}
