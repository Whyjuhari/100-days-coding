package DAYS_99;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonversiBiner extends JFrame {

    private JTextField binerField;
    private JTextField desimalField;

    public KonversiBiner() {
        setTitle("Konversi Biner Ke Desimal");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel binaryLabel = new JLabel("Biner ");
        JLabel decimalLabel = new JLabel("Desimal ");

        binerField = new JTextField(20);
        desimalField = new JTextField(20);
        desimalField.setEditable(false);

        JButton convertButton = new JButton("Konversi");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertBinaryToDecimal();
            }
        });

        setLayout(new GridLayout(3, 2));

        add(binaryLabel);
        add(binerField);
        add(decimalLabel);
        add(desimalField);
        add(convertButton);

        setVisible(true);
    }

    private void convertBinaryToDecimal() {
        try {
            String binerInput = binerField.getText().trim();
            if (!binerInput.matches("[01]+")) {
                JOptionPane.showMessageDialog(this, "Nomor biner tidak valid! Masukkan nomor biner yang valid.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            long decimalValue = Long.parseLong(binerInput, 2);
            desimalField.setText(String.valueOf(decimalValue));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan mengonversi biner menjadi desimal.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KonversiBiner();
            }
        });
    }
}

