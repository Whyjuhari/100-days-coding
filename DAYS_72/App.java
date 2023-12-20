package DAYS_72;

import javax.swing.*;
public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI");
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Ini ada aja duluu!! Nanti pi itu", "PESANKU", JOptionPane.INFORMATION_MESSAGE));

        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
