package DAYS_85;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class App extends JFrame {

    private JTextField inputField;
    private JTextArea resultArea;

    public App() {
        TamplanKomponent();
    }

    private void TamplanKomponent() {
        setLayout(null);

        JLabel label = new JLabel("Masukkan hari : ");
        label.setBounds(20, 20, 150, 25);
        add(label);

        inputField = new JTextField();
        inputField.setBounds(180, 20, 150, 25);
        add(inputField);

        JButton calculateButton = new JButton("Hitung");
        calculateButton.setBounds(20, 60, 100, 25);
        add(calculateButton);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setBounds(20, 100, 300, 100);
        add(resultArea);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilanPerhitungan();
            }
        });

        setTitle("Konversi Hari");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void tampilanPerhitungan() {
        try {
            int tahun = 365;
            int bulan = 30;
            int minggu = 7;

            ArrayList<String> gabungan = new ArrayList<>();

            int hari = Integer.parseInt(inputField.getText());

            if (hari % tahun != 0) {
                gabungan.add(hari / tahun + " Tahun");
                hari = hari % tahun;
                if (hari % bulan != 0) {
                    gabungan.add(hari / bulan + " Bulan");
                    hari = hari % bulan;
                    if (hari % minggu != 0) {
                        gabungan.add(hari / minggu + " Minggu");
                        hari = hari % minggu;
                        if (hari % 1 != 0) {
                            gabungan.add(hari / 1 + " Hari");
                            hari = hari % 1;
                        } else {
                            hari = hari / 1;
                            gabungan.add(hari + " Hari");
                        }
                    } else {
                        hari = hari / minggu;
                        gabungan.add(hari + " Minggu");
                    }
                } else {
                    hari = hari / bulan;
                    gabungan.add(hari + " Bulan");
                }
            } else {
                hari = hari / tahun;
                gabungan.add(hari + " Tahun");
            }

            resultArea.setText(String.join(", ", gabungan));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Inputan harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}

