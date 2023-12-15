package DAYS_68;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App extends JFrame implements ActionListener {
    
    JButton button;
    JLabel label;
    App(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Pilih Warna");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("Ini cuman teks biasa kok :D");
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 35));


        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            JColorChooser pilihWarna = new JColorChooser();
            
            Color warna = JColorChooser.showDialog(null, "Coba atur warna", Color.BLACK);
            
            label.setForeground(warna); // Warna tulisan
            // label.setBackground(warna); // Warna Background
        }
    }
    public static void main(String[] args) {
        new App();   
    }
}
