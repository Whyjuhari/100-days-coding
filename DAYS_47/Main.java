package DAYS_47;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) {
        
        // JLabel 
        ImageIcon image = new ImageIcon("GUI/src/DAYS_47/code.png");
        Border border = BorderFactory.createLineBorder(Color.yellow,3);


        JLabel label = new JLabel(); // membuat label
        label.setText("Hello World"); //mengatur text pada label
        label.setIcon(image); //mengatur icon
        label.setHorizontalTextPosition(JLabel.CENTER); // mengatur posisi teks : LEFT, CENTER, RIGHT, pada imageicon
        label.setVerticalTextPosition(JLabel.BOTTOM); // mengatur posisi teks : TOP, CENTER, BOTTOM, pada imageicon
        label.setForeground(Color.yellow); // untuk memberi warna pada label teks
        label.setFont(new Font("Comic Sans MS",Font.ITALIC,20)); // mengatur font pada teks : ITALIC (merubah gaya font menjadi cetak miring)
        label.setIconTextGap(-15); // mengatur jarak antara teks dengan imageicon
        label.setBackground(Color.black); // mengatur warna background color
        label.setOpaque(true); // menampilkan background color
        label.setBorder(border); // mengatur border
        label.setVerticalAlignment(JLabel.CENTER); // ini akan mengatur posisi icon+text berada di tengah secara vertical(TOP, BOTTOM)
        label.setHorizontalAlignment(JLabel.CENTER); // ini akan mengatur posisi icon+text berada di tengah secara vertical(LEFT, RIGHT)
        // label.setBounds(100, 100, 300, 300); // mengatur posisi x, y didalam frame serta dimensinya



        // Membuat Jframe
        // frame(binkai)
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setTitle("Belajar LABEL pada GUI");
        // frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(label);
        // frame.pack(); // untuk menyesuaikan ukuran frame berdasarkan komponen didalamnya
        

    }
    
}
