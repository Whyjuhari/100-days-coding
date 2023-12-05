package DAYS_58;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    // JRadioButton 

    JRadioButton lakiLaki;
    JRadioButton perempuan;
    JLabel hasil;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JRadio Button");
        this.setLayout(new FlowLayout());
        
        JLabel judul = new JLabel("Jenis kelamin");
        judul.setFont(new Font("Comic Sans MS", Font.PLAIN,25));
        

        lakiLaki = new JRadioButton("Laki-laki");
        lakiLaki.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
        
        perempuan = new JRadioButton("Perempuan");
        perempuan.setFont(new Font("Comic Sans MS", Font.PLAIN,20));

        lakiLaki.addActionListener(this);
        perempuan.addActionListener(this);

        hasil = new JLabel();
        hasil.setBounds(100, 200, 250, 50);

        ButtonGroup group = new ButtonGroup();
        group.add(lakiLaki);
        group.add(perempuan);

        this.add(judul);
        this.add(lakiLaki);
        this.add(perempuan);
        this.add(hasil);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==lakiLaki) {
            hasil.setText("Kamu adalah laki-laki");
            hasil.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
            hasil.setForeground(Color.green);
        } else if (e.getSource()==perempuan){
            hasil.setText("Kamu adalah perempuan");
            hasil.setFont(new Font("Comic Sans MS", Font.PLAIN,20));
            hasil.setForeground(Color.green);
        }
    }    
}
