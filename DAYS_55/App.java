package DAYS_55;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        // JOptionPane = memunculkan kotak dialog standar 
        //               yang menanyakan nilai kepada pengguna,
        //               atau memberi tahu tentang sesuatu 

        // PLAN MESSAGE
        // INFORMATION MESSAGE
        // QUESTION MESSAGE 
        // WARNING MESSAGE
        // ERROR MESSAGE

        int answer = JOptionPane.showConfirmDialog(null, "Broo, do you even code?", "Coba coba", JOptionPane.YES_NO_CANCEL_OPTION);

        String[] respon = {"No, you,re awesome!", "thank you!", "blush"};
        ImageIcon icon = new ImageIcon("GUI/src/DAYS_55/icon.png");

        if (answer == 0) {
            String nama = JOptionPane.showInputDialog("Siapa nama mu? : ");
            if (nama != null && !nama.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Hi.." + nama + " Selamat datang!! ", "Name", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong", "Info", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showOptionDialog(
                null, 
                "You are the awesome",
                "pesan rahasia", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                icon, 
                respon,
                0);
        }


    }
}
