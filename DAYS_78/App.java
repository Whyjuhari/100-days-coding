package DAYS_78;

import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import java.awt.Color;
import java.awt.event.*;
public class App extends JFrame implements ActionListener {

    // membuat variabel dengan tipe object
    JLabel labelGaji, labelLembur;
    JTextField inputGaji, inputLembur;

    JButton hitung, reset;
    JTextArea hasil;

    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hitung Gaji V.GUI");
        this.setSize(400,400);
        this.setLayout(null);
        
        labelGaji = new JLabel("GAJI KARYWAN");
        labelGaji.setBounds(50, 20, 200, 50);
        inputGaji = new JTextField();
        inputGaji.setMargin(new InsetsUIResource(0, 10, 0, 10));
        inputGaji.setBounds(50, 60, 300, 30);
        
        labelLembur = new JLabel("LAMA LEMBUR [ JAM ]");
        labelLembur.setBounds(50, 90, 200, 50);
        inputLembur = new JTextField();
        inputLembur.setMargin(new InsetsUIResource(0, 10, 0, 10));
        inputLembur.setBounds(50, 130, 300, 30);

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
        
        this.add(labelGaji);
        this.add(inputGaji);

        this.add(labelLembur);
        this.add(inputLembur);

        this.add(hitung);
        this.add(reset);
        this.add(hasil);

        this.getContentPane().setBackground(new Color(95, 110, 255));
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==hitung) {
            try {
                double gajiLembur = 55000;
                double gajiPokok = Double.parseDouble(inputGaji.getText());
                double lamaLembur = Double.parseDouble(inputLembur.getText());

                double gajiBersih = gajiPokok + (gajiLembur * lamaLembur);
                
                // memunculkan hasil kedalam textarea tadi 
                hasil.setText("Gaji bersih karyawan adalah : " + gajiBersih);
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Coba periksa dulu inputanmu!", "Pesan", JOptionPane.DEFAULT_OPTION);
            }
        } else if(e.getSource()==reset) {
            inputGaji.setText("");
            inputLembur.setText("");
            hasil.setText("");
        }

    }

    public static void main(String[] args) {
        new App();
    }
}
