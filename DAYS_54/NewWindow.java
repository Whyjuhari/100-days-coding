package DAYS_54;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

    JFrame frame = new JFrame("New Window");
    JLabel label = new JLabel("Welcome To The World!!(~__~)");

    NewWindow() {

        label.setBounds(20, 160, 420, 50);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN,25));

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
