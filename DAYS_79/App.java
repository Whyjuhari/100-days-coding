package DAYS_79;

import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    // membuat variabel dengan tipe object
    JLabel labelLuas, labelHarga;
    JTextField inputLuas, inputHarga;

    JButton hitung, reset;
    JTextArea hasil;

    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Uang Bersih Jual Tanah V.GUI");
        this.setSize(400,400);
        this.setLayout(null);
        
        labelLuas = new JLabel("LUAS TANAH");
        labelLuas.setBounds(50, 20, 200, 50);
        inputLuas = new JTextField();
        inputLuas.setMargin(new InsetsUIResource(0, 10, 0, 10));
        inputLuas.setBounds(50, 60, 300, 30);
        
        labelHarga = new JLabel("HARGRA PERMETER");
        labelHarga.setBounds(50, 90, 200, 50);
        inputHarga = new JTextField();
        inputHarga.setMargin(new InsetsUIResource(0, 10, 0, 10));
        inputHarga.setBounds(50, 130, 300, 30);

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
        
        this.add(labelLuas);
        this.add(inputLuas);

        this.add(labelHarga);
        this.add(inputHarga);

        this.add(hitung);
        this.add(reset);
        this.add(hasil);

        this.getContentPane().setBackground(new Color(206, 212, 44));
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==hitung) {
            try {

                double luasTanah = Double.parseDouble(inputLuas.getText());
                double hargaPermeter = Double.parseDouble(inputHarga.getText());

                double totalHarga = luasTanah * hargaPermeter;
                double pajak;

                if (totalHarga >= 100000000) {
                    pajak = 0.05 * totalHarga;
                }else if (totalHarga >= 50000000) {
                    pajak = 0.03 * totalHarga;
                }else {
                    pajak = 0.01 * totalHarga;
                }
                
                double uangBersih = totalHarga - pajak;

                // memunculkan hasil kedalam textarea tadi 
                hasil.setText(
                    String.format("Harga jual\t : %.2f%n",totalHarga)
                    +String.format("Uang bersih\t : %.2f%n",uangBersih)
                );
                hasil.setFont(new Font("Cascaida Code", Font.BOLD, 14));


            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Coba periksa dulu inputanmu!", "Pesan", JOptionPane.WARNING_MESSAGE);
            }
        } else if(e.getSource()==reset) {
            inputLuas.setText("");
            inputHarga.setText("");
            hasil.setText("");
        }

    }

    public static void main(String[] args) {
        new App();
    }
}
