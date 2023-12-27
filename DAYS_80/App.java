package DAYS_80;

import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    // membuat variabel dengan tipe object
    JLabel labelPenghasilan, labelPekerjaan;
    JTextField inputPenghasilan;
    JComboBox inputPekerjaan;

    JButton hitung, reset;
    JTextArea hasil;

    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hitung Gaji V.GUI");
        this.setSize(400,400);
        this.setLayout(null);
        
        labelPenghasilan = new JLabel("PENGHASILAN");
        labelPenghasilan.setBounds(50, 20, 200, 50);
        inputPenghasilan = new JTextField();
        inputPenghasilan.setMargin(new InsetsUIResource(0, 10, 0, 10));
        inputPenghasilan.setBounds(50, 60, 300, 30);
        
        labelPekerjaan = new JLabel("PEKERJAAN");
        labelPekerjaan.setBounds(50, 90, 200, 50);

        String[] pekerjaan = {"--pilih--","pns", "petani", "buru", "youtuber", "programmer"};

        inputPekerjaan = new JComboBox(pekerjaan);
        inputPekerjaan.setBounds(50, 130, 300, 30);

        hitung = new JButton("HITUNG");
        hitung.setBounds(50, 180, 100, 30);
        hitung.setFocusable(false);
        hitung.addActionListener(this);

        reset = new JButton("RESET");
        reset.setBounds(250, 180, 100, 30);
        reset.setFocusable(false);
        reset.addActionListener(this);

        hasil = new JTextArea();
        hasil.setBounds(50, 235, 300, 100);
        hasil.setEditable(false);
        hasil.setMargin(new InsetsUIResource(10, 10, 10, 10));
        
        this.add(labelPenghasilan);
        this.add(inputPenghasilan);

        this.add(labelPekerjaan);
        this.add(inputPekerjaan);

        this.add(hitung);
        this.add(reset);
        this.add(hasil);

        // this.getContentPane().setBackground(new Color(206, 212, 44));
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==hitung) {
            try {

                double gaji = Double.parseDouble(inputPenghasilan.getText());
                String pekerjaan = (String) inputPekerjaan.getSelectedItem();

                double pajak;

                if (gaji >= 3000000 && gaji < 5000000 && !pekerjaan.equalsIgnoreCase("pns")) {
                    pajak = 0.05 * gaji;
                } else if (gaji >= 3000000 && gaji < 5000000 && pekerjaan.equalsIgnoreCase("pns")) {
                    pajak = 0.1 * gaji;
                } else if (gaji >= 5000000 && !pekerjaan.equalsIgnoreCase("pns")) {
                    pajak = 0.1 * gaji;
                } else if (gaji >= 5000000 && pekerjaan.equalsIgnoreCase("pns")) {
                    pajak = 0.15 * gaji;
                } else {
                    pajak = 0;
                }

                
                double uangBersih = gaji - pajak;

                // memunculkan hasil kedalam textarea tadi 
                hasil.setText("Pajak anda\t :  " + (pajak * 100 / gaji + "%\n")
                    +String.format("Uang bersih\t : %.2f%n",uangBersih)
                );
                hasil.setFont(new Font("Cascaida Code", Font.BOLD, 14));


            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Coba periksa dulu inputanmu!", "Pesan", JOptionPane.WARNING_MESSAGE);
            }
        } else if(e.getSource()==reset) {
            inputPenghasilan.setText("");
            inputPekerjaan.setSelectedIndex(0);
            hasil.setText("");
        }

    }

    public static void main(String[] args) {
        new App();
    }
}

