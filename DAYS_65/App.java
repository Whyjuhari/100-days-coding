package DAYS_65;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class App extends JFrame implements ActionListener{
    

    JMenuBar menuBar;
    JMenu file, edit, help;
    JMenuItem loadItem, saveItem, exitItem;
    ImageIcon loadIcon, saveIcon, exitIcon;
    
    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menu Bar");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("GUI/src/DAYS_65/Load.png");
        saveIcon = new ImageIcon("GUI/src/DAYS_65/Save.png");
        exitIcon = new ImageIcon("GUI/src/DAYS_65/Exit.png");

        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);  
        exitItem.setIcon(exitIcon);  
        
        
        // kegunaan dari KeyEvent yaitu menambah fungsi key pada keyboard
        file.setMnemonic(KeyEvent.VK_F); // alt + f => file 
        edit.setMnemonic(KeyEvent.VK_E); // alt + e => edit
        help.setMnemonic(KeyEvent.VK_H); // alt + h => help

        loadItem.setMnemonic(KeyEvent.VK_L); // l => load
        saveItem.setMnemonic(KeyEvent.VK_S); // s => save
        exitItem.setMnemonic(KeyEvent.VK_E); // e => exit

        file.add(loadItem);
        file.add(saveItem);
        file.add(exitItem);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem) {
            System.out.println("*beep boop*, you loaded a file");
        } 
        if (e.getSource()==saveItem) {
            System.out.println("*beep boop*, you save a file");
        }    
        if (e.getSource()==exitItem) {
            System.exit(0);
        }    
    }
    public static void main(String[] args) {
        new App();
    }
}
