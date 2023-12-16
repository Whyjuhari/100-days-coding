package DAYS_69;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App extends JFrame implements KeyListener {
    
    JLabel label;
    ImageIcon icon;

    App(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("GUI/src/DAYS_69/rocket.png");


        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
        this.setBackground(Color.BLACK);


    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keypressed = dipanggil ketika tombol fisik ditekan ke bawah. Menggunakan kode kunci, outputnya berupa angka(int)
        // Menggunakan keyCode
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10, label.getY());
                break;   
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;

            default:
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // keyreleased = dipanggil kapan pun tombol di tekan
        System.out.println("You released key char : " + e.getKeyChar());
        System.out.println("You released key code : " + e.getKeyCode());
    }
    @Override
    public void keyTyped(KeyEvent e) {
       // keytyped = dipanggil saat kunci diketik. Menggunakan keychar, outputnya berupa karakter(char)
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;   
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;

            default:
                break;
        }
    }



    // Fungsi main app
    public static void main(String[] args) {
        new App();
    }
}
