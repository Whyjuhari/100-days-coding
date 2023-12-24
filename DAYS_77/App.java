package DAYS_77;

import javax.swing.*;
import java.awt.event.*;
import java.time.*;

public class App extends JFrame implements ActionListener{
    public static void main(String[] args) {
        new App();
    }

    JPanel panel;
    JLabel label;
    JTextField inputField;
    JButton hitungButton;
    JLabel hasilLabel;
    App () {

            this.setTitle("Hitung Umur D: ");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel = new JPanel();
            label = new JLabel("Masukkan tanggal lahir [format : YYYY-MM-DD] : ");
            inputField = new JTextField(10);
            hitungButton = new JButton("Hitung Umur");
            hitungButton.addActionListener(this);
            hasilLabel = new JLabel();

            panel.add(label);
            panel.add(inputField);
            panel.add(hitungButton);
            panel.add(hasilLabel);

            this.getContentPane().add(panel);
            this.setSize(350, 150);
            this.setLocationRelativeTo(null); // agar posisi frame muncul di tengah layar 
            this.setResizable(false);
            this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==hitungButton) {
            String inputTanggal = inputField.getText();
            try {
                LocalDate tanggalLahir = LocalDate.parse(inputTanggal);
                Period umur = Period.between(tanggalLahir, LocalDate.now());
                hasilLabel.setText("Umur Anda: " + umur.getYears() + " tahun, " + umur.getMonths() + " bulan, " + umur.getDays() + " hari.");
            } catch (Exception ex) {
                hasilLabel.setText("Gunakan format: YYYY-MM-DD");
            }
        }
    }
}
