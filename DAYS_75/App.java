package DAYS_75;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class App extends JFrame {

    JTextArea textArea;

    public App() {
        super("File Reader");

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton upload = new JButton("Pilih File Dong!!");
        upload.setBounds(20,20, 50,50);
        upload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();
                int result = file.showOpenDialog(App.this);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = file.getSelectedFile();
                    displayFileContents(selectedFile);
                }
            }
        });

        textArea = new JTextArea();
        textArea.setEditable(false);

        panel.add(upload, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        getContentPane().add(panel);
        setVisible(true);
    }

    private void displayFileContents(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder konten = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                konten.append(line).append("\n");
            }

            textArea.setText(konten.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan dalam membaca file.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
