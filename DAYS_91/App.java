package DAYS_91;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Teks");
        JTextArea textArea = new JTextArea(10, 20);
        JButton tombolSubmit = new JButton("Submit");
        tombolSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teks = textArea.getText();

                JOptionPane.showMessageDialog(frame, "Teks yang diinputkan:\n" + teks);
            }
        });

        JPanel panel = new JPanel();

        panel.add(new JLabel("Masukkan Teks : "));
        panel.add(new JScrollPane(textArea));
        panel.add(tombolSubmit);

        frame.getContentPane().add(panel);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
