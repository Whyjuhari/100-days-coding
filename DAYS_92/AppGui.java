package DAYS_92;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AppGui extends JFrame {
    
    JLabel imageLabel;

    public AppGui() {
        setTitle("Contoh Upload Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        JButton tombolUpload = new JButton("Upload Image");
        tombolUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uploadImage();
            }
        });
        add(tombolUpload, BorderLayout.SOUTH);
    }

    private void uploadImage() {
        JFileChooser pilihFile = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        pilihFile.setFileFilter(filter);

        int hasil = pilihFile.showOpenDialog(this);

        if (hasil == JFileChooser.APPROVE_OPTION) {
            File pilihanFile = pilihFile.getSelectedFile();
            displayImage(pilihanFile);
        }
    }

    private void displayImage(File imageFile) {
        ImageIcon imageIcon = new ImageIcon(imageFile.getAbsolutePath());
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
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
