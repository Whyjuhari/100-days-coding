package DAYS_59;


import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ComboBox");
        this.setLayout(new FlowLayout());
    
        String[] makul = {"Pemrograman Game", "Pemrograman Web", "Basis Data"}; 

        comboBox = new JComboBox(makul);
        comboBox.addActionListener(this);

        // Modifikasi comboBox        
        comboBox.setEditable(true); // untuk mengedit item dari comboBox
        comboBox.addItem("Cyber Security"); // menambahkan item ke dalam comboBox
        comboBox.insertItemAt("Object Oriented", 0); // menambahkan item berdasarkan index tertentu
        comboBox.setSelectedIndex(0); // 
        // comboBox.removeItem("Pemrograman Game"); // menghapus dengan nama item
        // comboBox.removeItemAt(1); // menghapus berdasarkan index
        // comboBox.removeAllItems(); // menghapus semua item
        
        System.out.println("Jumlah data : " + comboBox.getItemCount()); // mengetahui jumlah data pada comboBox

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox) {
            // comboBox.getSelectedItem() : untuk memilih item pada comboBox
            // comboBox.getSelectedIndex() : untuk memilih index pada comboBox

            System.out.println("Item yang dipilih : " + comboBox.getSelectedItem());                
        }        
    }        
}
