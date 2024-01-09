package DAYS_93;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppGui extends JFrame {

    public AppGui() {
        gui();
    }

    private void gui() {
        JFrame frame = new JFrame("Form Registrasi");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Menggunakan null layout agar bisa menggunakan setBounds

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 30, 80, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(140, 30, 200, 25);
        frame.add(emailField);

        JLabel fullNameLabel = new JLabel("Nama");
        fullNameLabel.setBounds(50, 70, 80, 25);
        frame.add(fullNameLabel);

        JTextField fullNameField = new JTextField();
        fullNameField.setBounds(140, 70, 200, 25);
        frame.add(fullNameField);

        JLabel phoneNumberLabel = new JLabel("No HP");
        phoneNumberLabel.setBounds(50, 110, 80, 25);
        frame.add(phoneNumberLabel);

        JTextField phoneNumberField = new JTextField();
        phoneNumberField.setBounds(140, 110, 200, 25);
        frame.add(phoneNumberField);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 150, 80, 25);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(140, 150, 200, 25);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 190, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(140, 190, 200, 25);
        frame.add(passwordField);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 240, 100, 30);
        frame.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String fullName = fullNameField.getText();
                String phoneNumber = phoneNumberField.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                JOptionPane.showMessageDialog(frame, "Registrasi berhasil untuk : " + username);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AppGui();
            }
        });
    }
}
