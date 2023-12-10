package DAYS_63;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class ContohTabel {

    JFrame frame;
    JTable tabel;

    ContohTabel() {
        frame = new JFrame("Contoh Tabel");

        JLabel judul = new JLabel("DAFTAR MATAKULIAH");
        judul.setFont(new Font(
            "Comic Sans MS",
            Font.BOLD,
            20
        ));
        judul.setBounds(180, 20, 400, 50);
        frame.add(judul);

        String[] kolom = {"Kode MK", "Matakuliah", "Sks"}; // untuk nama field pada data
        
        // Data tabel : masih menggunakan array
        Object[][] daftar_makul = {
            {"INF264219", "Object Oriented Programming", "3"},
            {"INF204319", "Basis Data II", "3"},
            {"INF224319", "Pemrograman Web", "3"},
            {"INF194319", "Jaringan Komputer", "3"},
            {"INF194319", "Mechine Learning", "2"},
        };


        tabel = new JTable(daftar_makul, kolom);
        tabel.setRowHeight(30); // mengatur tinggi cell pada baris

        
        DefaultTableCellRenderer ratatengah = new DefaultTableCellRenderer();
        ratatengah.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < tabel.getColumnCount(); i++) {
            tabel.getColumnModel().getColumn(i).setCellRenderer(ratatengah); // mengatur agar smua item pada tabel berada di tengan
        }

        frame.setLayout(new BorderLayout());

        JScrollPane scrol = new JScrollPane(tabel); // agar tabel bisa di scroll ketika data banyak
        scrol.setBounds(50, 70, 500, 160);
        frame.add(scrol, BorderLayout.CENTER);

        
        frame.setSize(600,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new ContohTabel();
    }
}
