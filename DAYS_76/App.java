package DAYS_76;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new App();
    }
    JButton startButton = new JButton("Mulai");
    ProgressBar progressBar;

    App() {
        this.setTitle("Halaman Utama");
        this.setSize(420, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        startButton.setBounds(150, 50, 120, 30);
        startButton.addActionListener(this);


        this.add(startButton);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==startButton) {
            new ProgressBar();
        }
    }
}
