package DAYS_49;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("GUI/src/DAYS_49/pointbottom.png");
        ImageIcon icon2 = new ImageIcon("GUI/src/DAYS_49/icon2.png");



        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(215, 200, 200, 200);

        // mengatur agar icon diawal tidak kelihatan
        label.setVisible(false);


        button = new JButton();
        button.setBounds(150, 100, 200, 135);
        button.addActionListener(this);
        button.setText("Click Me!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.white);
        button.setBackground(Color.green);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false); // membuat tombol menjadi aktif atau tidak;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setResizable(false);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            // System.out.println("poo");

            // Ketika tombol di klik maka label ikon akan muncul 
            label.setVisible(true);
        }
    }
    
}
