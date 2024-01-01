package DAYS_84;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private static JFrame frame;
    private static JTextField usernameField;
    private static JPasswordField passwordField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> tampilanLogin());
    }

    private static void tampilanLogin() {
        frame = new JFrame("LoginAjaDulu GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        panel.add(userLabel);
        panel.add(usernameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); 
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = usernameField.getText();
                char[] passChars = passwordField.getPassword();
                String pass = new String(passChars);

                if (loginValidas(user, pass)) {
                    JOptionPane.showMessageDialog(frame, "Selamat " + user + " Kamu berhasil login");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login failed. Username or password is incorrect.");
                }
            }
        });

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    private static boolean loginValidas(String user, String pass) {
        return user.equals("admin") && pass.equals("password");
    }
}

