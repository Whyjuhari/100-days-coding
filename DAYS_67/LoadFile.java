package DAYS_67;

import javax.swing.*;
import java.io.File;

public class LoadFile {
    

    JFileChooser pilihFile;
    LoadFile() {
            pilihFile = new JFileChooser();
            pilihFile.setDialogTitle("Pilih File");

            
            pilihFile.setCurrentDirectory(new File("home")); // Mengatur direktori ke home

            int nilai = pilihFile.showSaveDialog(null);


            if (nilai == JFileChooser.APPROVE_OPTION) {
                File file = new File(pilihFile.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
    }
}
