package DAYS_76;

import javax.swing.*;
import java.awt.*;

public class ProgressBar {

    
    JFrame frame = new JFrame("Progress Bar");
    JProgressBar bar = new JProgressBar();
    JLabel welcome = new JLabel();

    ProgressBar() {
        bar.setString("Loading...");
        bar.setBounds(0,150,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        bar.setForeground(Color.GREEN);

        frame.add(bar);
        frame.add(welcome);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        fill();
    }

    public void fill() {

        int counter = 0;
        while(counter <= 100) {
            bar.setValue(counter); // mengambil value dari proses dalam persen
            time(100);
            counter += 1;
        }
        bar.setString("Done :)");
        time(1000);
        bar.setVisible(false);

        welcome.setText("Hi, selamat datang");
        welcome.setBounds(120,150,420,50);
        welcome.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    }

    public void time(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
