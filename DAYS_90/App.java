import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh Dialog");

        JTextField textField = new JTextField(20);

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                JOptionPane.showMessageDialog(frame, "Welcome to the world bro!! " + nama);
            }
        });

        JPanel panel = new JPanel();

        panel.add(new JLabel("Namamu dong! : "));
        panel.add(textField);
        panel.add(submitButton);
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
