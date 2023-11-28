package DAYS_51;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout {
    public static void main(String[] args) {
        
        // Layout Manager = Mendefinisikan tata letak komponen secara alami 
        //                  dalam sebuah container

        // FlowLayout     = Menempatkan komponen dalam satu baris,  
        //                  berukuran sesuai ukuran yang diinginkan.
        //                  Jika ruang horizontal dalam sebuah kontainer
        //                  terlalu kecil, Maka class FlowLayout menggunakan
        //                  baris berikutnya yang tersedia.

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Flow Layout");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        // Membuat kontainer untuk membukus button
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        frame.setLayout(new FlowLayout());

        
        // Membuat elemen-elemen button
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);


    }
}
