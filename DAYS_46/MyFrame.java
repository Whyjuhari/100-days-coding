package DAYS_46;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Belajar GUI dengan JAVA"); // memberi judul
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false); // mengatur agar frame tidak bisa di resize
        this.setSize(420, 420); // mengatur ukuran x dan y
        this.setVisible(true);

        ImageIcon image = new ImageIcon("user.png"); // Membuat image icon
        this.setIconImage(image.getImage()); // mengubah icon pada this
        // this.getContentPane().setBackground(Color.green); // mengubah warna background pada frame
        this.getContentPane().setBackground(new Color(0,255,0)); // mengubah warna background pada frame dengan rgb

    }
}
