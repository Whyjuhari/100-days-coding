package DAYS_98;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppGui extends JFrame {
    JTextField inputTahun;
    JLabel hasilLabel;

    public AppGui() {
        setTitle("Cek Tahun Kabisat");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 270, 100);
        panel.setLayout(null);

        JLabel labelTahun = new JLabel("Input Tahun ");
        labelTahun.setBounds(10, 10, 120, 20);

        hasilLabel = new JLabel();
        hasilLabel.setBounds(10, 70, 250, 20);

        inputTahun = new JTextField();
        inputTahun.setBounds(140, 10, 120, 20);

        JButton cekButton = new JButton("Cek");
        cekButton.setBounds(10, 40, 250, 20);

        cekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cekTahun();
            }
        });

        panel.add(labelTahun);
        panel.add(inputTahun);
        panel.add(cekButton);
        panel.add(hasilLabel);

        add(panel);
        setVisible(true);
    }

    public void cekTahun() {
        try {
            int tahun = Integer.parseInt(inputTahun.getText());
            if (isTahunKabisat(tahun)) {
                hasilLabel.setText(tahun + " adalah tahun kabisat.");
            } else {
                hasilLabel.setText(tahun + " bukan tahun kabisat.");
            }
        } catch (NumberFormatException e) {
            hasilLabel.setText("Masukkan tahun yang valid.");
        }
    }

    public boolean isTahunKabisat(int tahun) {
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppGui();
            }
        });
    }
}
