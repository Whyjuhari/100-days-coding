package DAYS_71;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {

    private JTextField hasil;
    private JButton[] tombolAngka = new JButton[10];
    private JButton tombolTambah, tombolKurang, tombolKali, tombolBagi, tombolSamadengan, tombolDelete, tombolClear;
    private JPanel panel;

    private double angka1, angka2, nilaiAkhir;
    private char operator;

    public App() {
        setTitle("Kalkulator Sederhana");

        hasil = new JTextField();
        hasil.setHorizontalAlignment(JTextField.RIGHT);
        hasil.setPreferredSize(new Dimension(300,50));

        for (int i = 0; i < 10; i++) {
            tombolAngka[i] = new JButton(String.valueOf(i));
            tombolAngka[i].addActionListener(this);
        }

        tombolTambah = new JButton("+");
        tombolKurang = new JButton("-");
        tombolKali = new JButton("*");
        tombolBagi = new JButton("/");
        tombolSamadengan = new JButton("=");
        tombolDelete = new JButton("Delete");
        tombolClear = new JButton("Clear");

        tombolTambah.addActionListener(this);
        tombolKurang.addActionListener(this);
        tombolKali.addActionListener(this);
        tombolBagi.addActionListener(this);
        tombolSamadengan.addActionListener(this);
        tombolDelete.addActionListener(this);
        tombolClear.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(tombolAngka[1]);
        panel.add(tombolAngka[2]);
        panel.add(tombolAngka[3]);
        panel.add(tombolTambah);

        panel.add(tombolAngka[4]);
        panel.add(tombolAngka[5]);
        panel.add(tombolAngka[6]);
        panel.add(tombolKurang);

        panel.add(tombolAngka[7]);
        panel.add(tombolAngka[8]);
        panel.add(tombolAngka[9]);
        panel.add(tombolKali);

        panel.add(tombolClear);
        panel.add(tombolAngka[0]);
        panel.add(tombolSamadengan);
        panel.add(tombolBagi);

        add(hasil, BorderLayout.NORTH);
        add(panel);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == tombolAngka[i]) {
                hasil.setText(hasil.getText() + i);
            }
        }

        if (e.getSource() == tombolTambah) {
            angka1 = Double.parseDouble(hasil.getText());
            operator = '+';
            hasil.setText("+");
        }

        if (e.getSource() == tombolKurang) {
            angka1 = Double.parseDouble(hasil.getText());
            operator = '-';
            hasil.setText("-");
        }

        if (e.getSource() == tombolKali) {
            angka1 = Double.parseDouble(hasil.getText());
            operator = '*';
            hasil.setText("-");
        }

        if (e.getSource() == tombolBagi) {
            angka1 = Double.parseDouble(hasil.getText());
            operator = '/';
            hasil.setText("/");
        }

        if (e.getSource() == tombolSamadengan) {
            angka2 = Double.parseDouble(hasil.getText());

            switch (operator) {
                case '+':
                    nilaiAkhir = angka1 + angka2;
                    break;
                case '-':
                    nilaiAkhir = angka1 - angka2;
                    break;
                case '*':
                    nilaiAkhir = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        nilaiAkhir = angka1 / angka2;
                    } else {
                        hasil.setText("Error");
                        return;
                    }
                    break;
            }

            hasil.setText(String.valueOf(nilaiAkhir));
            angka1 = nilaiAkhir;
        }

        if (e.getSource() == tombolClear) {
            hasil.setText("");
            angka1 = angka2 = nilaiAkhir = 0;
        }

        if (e.getSource() == tombolDelete) {
            String currentText = hasil.getText();
            if (!currentText.isEmpty()) {
                hasil.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
