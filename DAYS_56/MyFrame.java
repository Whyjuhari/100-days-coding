package DAYS_56;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener {


    JButton submit;
    JTextField nama, nim;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        // this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Mengatur layout menjadi BoxLayout dengan Y_AXIS


        JLabel labelNama = new JLabel("NAMA");
        nama = new JTextField();
        nama.setColumns(20);
        nama.setPreferredSize(new Dimension(240,40));
        nama.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        // nama.setForeground(new Color(0x00ff00)); // Mengatur warna text
        
        JLabel labelNim = new JLabel("NIM");
        nim = new JTextField();
        nama.setColumns(20);
        nim.setPreferredSize(new Dimension(240,40));
        nim.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        // nim.setForeground(new Color(0x00ff00)); // Mengatur warna text


        submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.setFont(new Font("Comic Sans MS", Font.ITALIC, 15));

        // Membungkus semua elemen diatas dengan panel
        panel.add(labelNama);
        panel.add(nama);
        panel.add(labelNim);
        panel.add(nim);
        panel.add(submit);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit) {
            System.out.println("\nNama : " + nama.getText());
            System.out.println("Nim  : " + nim.getText());
            System.out.println();

        }
    }
    
}
