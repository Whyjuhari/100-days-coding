package DAYS_52;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;


public class Grid {
    public static void main(String[] args) {
        
        // Grid Layout      = menempatkan komponen dalam grid sel. 
        //                    Setiap komponen mengambil ruang yang tersedia di dalam selnya, 
        //                    dan masing-masing berukuran sama.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Grid Layout");
        frame.setLayout(new GridLayout(3, 3, 10, 10)); // paramater dari GridLayout : row, baris, horizontal margin, vertical margin

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));



        frame.setVisible(true);

    }
}
