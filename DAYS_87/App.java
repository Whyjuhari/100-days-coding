package DAYS_87;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private JTextField hariField;
    private JComboBox<String> satuanComboBox;
    private JComboBox<String> satuanKonversiComboBox;
    private JTextArea resultTextArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    public App() {
        setTitle("Konversi Hari");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel hariLabel = new JLabel("Masukkan Hari : ");
        hariField = new JTextField();

        JLabel satuanLabel = new JLabel("Jenis Hari:");
        String[] satuanOptions = {"hari", "minggu", "bulan", "tahun"};
        satuanComboBox = new JComboBox<>(satuanOptions);

        JLabel satuanKonversiLabel = new JLabel("Satuan Konversi:");
        satuanKonversiComboBox = new JComboBox<>(satuanOptions);

        JButton convertButton = new JButton("Konversi");
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convert();
            }
        });

        add(hariLabel);
        add(hariField);
        add(satuanLabel);
        add(satuanComboBox);
        add(satuanKonversiLabel);
        add(satuanKonversiComboBox);
        add(new JLabel()); 
        add(convertButton);
        add(new JLabel()); 
        add(resultTextArea);
    }
    private void convert() {
        try {
            double hari = Double.parseDouble(hariField.getText());
            String satuan = (String) satuanComboBox.getSelectedItem();
            String satuanKonversi = (String) satuanKonversiComboBox.getSelectedItem();
    
            if (satuan.equals(satuanKonversi)) {
                resultTextArea.setText("Satuan konversi tidak boleh sama. Coba lagi.");
                return;
            }
    
            double hasil = 0.0;
    
            if (satuan.equals("hari")) {
                if (satuanKonversi.equals("minggu")) {
                    hasil = hari / 7;
                } else if (satuanKonversi.equals("bulan")) {
                    hasil = hari / 30.4375; 
                } else if (satuanKonversi.equals("tahun")) {
                    hasil = hari / 365.25; 
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                }
            } else if (satuan.equals("minggu")) {
                if (satuanKonversi.equals("hari")) {
                    hasil = hari * 7;
                } else if (satuanKonversi.equals("bulan")) {
                    hasil = hari / 4.3482;
                } else if (satuanKonversi.equals("tahun")) {
                    hasil = hari / 52.1775; 
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                }
            } else if (satuan.equals("bulan")) {
                if (satuanKonversi.equals("hari")) {
                    hasil = hari * 30.4375;
                } else if (satuanKonversi.equals("minggu")) {
                    hasil = hari * 4.3482;
                } else if (satuanKonversi.equals("tahun")) {
                    hasil = hari / 12;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                }
            } else if (satuan.equals("tahun")) {
                if (satuanKonversi.equals("hari")) {
                    hasil = hari * 365.25;
                } else if (satuanKonversi.equals("minggu")) {
                    hasil = hari * 52.1775;
                } else if (satuanKonversi.equals("bulan")) {
                    hasil = hari * 12;
                } else {
                    System.out.println("Satuan konversi tidak valid. Coba lagi.");
                }
            } else {
                System.out.println("Satuan asal tidak valid. Silakan coba lagi.");
            }
    
            resultTextArea.setText("Hasil konversi: " + hasil + " " + satuanKonversi);
        } catch (NumberFormatException ex) {
            resultTextArea.setText("Masukkan angka yang valid.");
        }
    }
}