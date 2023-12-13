package DAYS_66;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class App extends JFrame implements ActionListener {

    JFileChooser pilihFile;
    JButton tombol;
    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("JFileChooser");

        tombol = new JButton("Pilih File");
        tombol.addActionListener(this);
        tombol.setFocusable(false);


    
        this.add(tombol);
        this.pack();
        this.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==tombol) {
            
            
            pilihFile = new JFileChooser();

            
            pilihFile.setCurrentDirectory(new File("home"));

            int nilai = pilihFile.showSaveDialog(null);


            if (nilai == JFileChooser.APPROVE_OPTION) {
                File file = new File(pilihFile.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }

    public static void main(String[] args) {

        // JFileChooser = sebuah gui yang digunakan untuk memilih sebuah file (berguna untuk membuka file atau menyimpan file)
        new App();
    }
}
