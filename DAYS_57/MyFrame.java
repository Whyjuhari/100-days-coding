package DAYS_57;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    

    // JCheckBox

    JCheckBox checkBox;
    JButton button;
    ImageIcon xIcon, checkIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("GUI/src/DAYS_57/X.png");
        checkIcon = new ImageIcon("GUI/src/DAYS_57/ceklis.png");

        button = new JButton("Submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkBox = new JCheckBox();
        checkBox.setText("saya bukan robot!!");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);



        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
