package DAYS_70;

import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements MouseListener {

    private JLabel imageLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }

    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        ImageIcon imageIcon = new ImageIcon("GUI/src/DAYS_70/icon1.png");

        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(100, 100, imageIcon.getIconWidth(), imageIcon.getIconHeight());

        imageLabel.addMouseListener(this);

        this.add(imageLabel);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ImageIcon newImageIcon = new ImageIcon("GUI/src/DAYS_70/icon2.png");
        imageLabel.setIcon(newImageIcon);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Implementasi mouseEntered
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Implementasi mouseExited
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Implementasi mousePressed
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Implementasi mouseReleased
    }
}
