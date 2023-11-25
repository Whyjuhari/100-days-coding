package DAYS_48;

// import java.awt.BorderLayout; 
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App{
    public static void main(String[] args) {
        
        // JPanel = adalah sebuah fungsi untuk membuat komponen didalam gui sebagai kontainer

        ImageIcon icon1 = new ImageIcon("GUI/src/DAYS_48/icon2.png");
        ImageIcon icon2 = new ImageIcon("GUI/src/DAYS_48/icon.png");
        ImageIcon icon3 = new ImageIcon("GUI/src/DAYS_48/icon3.png");
        ImageIcon icon4 = new ImageIcon("GUI/src/DAYS_48/icon4.png");

        JLabel label1 = new JLabel();
        label1.setIcon(icon1);
        label1.setBounds(50, 100, 75, 75);
        
        JLabel label2 = new JLabel();
        label2.setIcon(icon2);
        label2.setBounds(150, 100, 75, 75);
        
        JLabel label3 = new JLabel();
        label3.setIcon(icon3);
        label3.setBounds(250, 100, 75, 75);

        JLabel label4 = new JLabel();
        label4.setIcon(icon4);
        label4.setBounds(350, 100, 75, 75);


        // CARA KE 2 : Mengatur posisi label (harus mengimport BorderLayout)
        // label4.setVerticalAlignment(JLabel.BOTTOM);
        // label4.setHorizontalAlignment(JLabel.RIGHT);
        
        // Panel berwarna merah
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        // Panel berwarna biru
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);
    
        // Panel berwarna kunin
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(500, 0, 250, 500);
        yellowPanel.setLayout(null);
        
        // Panel berwarna hijau
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);


 
        

        // Membuat binkai
        JFrame binkai = new JFrame();
        binkai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        binkai.setTitle("JPanel");
        // binkai.setLayout(null);
        binkai.setSize(750,500);
        binkai.setResizable(false);
        binkai.setVisible(true);

        // Menambah label icon ke dalam panel hijau
        greenPanel.add(label1);
        greenPanel.add(label2);
        greenPanel.add(label3);
        greenPanel.add(label4);

        // Menambah beberapa panel kedalam frame(binkai)
        binkai.add(redPanel);
        binkai.add(bluePanel);
        binkai.add(greenPanel);
        binkai.add(yellowPanel);

    }
}