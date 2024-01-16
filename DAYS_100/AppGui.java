package DAYS_100;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AppGui implements ActionListener{
    JFrame frame = new JFrame("NGODING AJA DULUU!!");

    JPanel panel = new JPanel();
    
    JTextField nimMhs= new JTextField();
    JTextField namaMhs = new JTextField();

    // Menu pilihan
    JComboBox agama;

    JRadioButton lakilaki;
    JRadioButton perempuan;

    JLabel judul = new JLabel("INPUT DATA MAHASISWA");
    
    JLabel nim = new JLabel("NIM");
    JLabel nama = new JLabel("Nama");

    JLabel nomorHp = new JLabel("Nomor Hp");
    JTextField noMhs = new JTextField();

    JLabel gender = new JLabel("Gender");

    JLabel jurusan = new JLabel("Jurusan"); 
    JTextField jurusanMhs = new JTextField();

    JLabel labelAgama = new JLabel("Agama"); 

    JButton submit = new JButton("submit");
    JButton reset = new JButton("reset");
    // Membuat DefaultTableModel untuk tabel
    DefaultTableModel model;

    AppGui() {
        judul.setBounds(120, 50, 300, 25);
        judul.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        nim.setBounds(50, 100, 200, 25);
        nama.setBounds(50, 150, 200, 25);
        nomorHp.setBounds(50, 200, 150, 25);
        nimMhs.setBounds(150, 100, 200, 35);
        noMhs.setBounds(150, 200, 200, 35);
        namaMhs.setBounds(150, 150, 200, 35);

        // Inputan untuk pilihan
    

        // Pilihan jenis pengiriman
        gender.setBounds(50, 240, 200, 25);
        lakilaki = new JRadioButton("PRIA");
        lakilaki.setBounds(150, 240, 100, 35);
        lakilaki.addActionListener(this);
        perempuan = new JRadioButton("WANITA");
        perempuan.setBounds(250, 240, 100, 35);
        perempuan.addActionListener(this);

        // agar radiobutton tidak bisa dipilih dua-duanya
        ButtonGroup group = new ButtonGroup();
        group.add(lakilaki);
        group.add(perempuan);

        // Inputan berat barang
        jurusan.setBounds(50, 290, 200, 25);
        jurusanMhs.setBounds(150, 290, 200, 35);

        // Pilihan agama
        labelAgama.setBounds(50, 340, 200, 25);
        String[] pilih = {"-=pilih=-","ISLAM", "HINDU", "BUDDHA", "KONGHUCHU", "KRISTEN", "PROTESTAN"};
        agama = new JComboBox<>(pilih);
        agama.setBounds(150, 340, 200, 25);



        // Tombol submit dan reset
        submit.setBounds(150, 400, 100, 25);
        submit.addActionListener(this);
        
        reset.setBounds(250, 400, 100, 25);
        reset.addActionListener(this);


        String[] kolom = {"NIM", "Nama", "Nomor Hp", "Gender", "Jurusan", "Agama"};

        model = new DefaultTableModel(kolom, 0);

        JLabel judulTabel = new JLabel("DAFTAR MAHASISWA");
        judulTabel.setBounds(750, 50, 400, 50);
        judulTabel.setFont(new Font("Comic Sans MS",Font.BOLD,15));

        // Membuat tabel 
        JTable dataTable = new JTable(model);
        // dataTable.setFont(new Font("Comic Sans MS", Font.BOLD, 13))
        dataTable.setRowHeight(20);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER); 

        // ini artinya mengambil item pada tabel berdasarkan posisi kolom.
        // dataTable.getColumnModel().getColumn(0).setCellRenderer(center);

        // untuk mengambil semua item pada tabel, berdasarkan jumlah kolom.
        for (int i = 0; i < dataTable.getColumnCount(); i++) {
            dataTable.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        // Menambahkan tabel ke dalam JScrollPane
        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setBounds(450, 100, 850, 150);
        frame.add(scrollPane);


        // Label 
        frame.add(judul);
        frame.add(judulTabel);
        frame.add(nim);
        frame.add(nama);

        // Text input
        frame.add(nimMhs);
        frame.add(namaMhs);

        frame.add(nomorHp);
        frame.add(noMhs);

        frame.add(gender);
        frame.add(lakilaki);
        frame.add(perempuan);

        frame.add(jurusan);
        frame.add(jurusanMhs);

        frame.add(labelAgama);
        frame.add(agama);

        frame.add(submit);
        frame.add(reset);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1350,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String nim = nimMhs.getText();
            String nama = namaMhs.getText();
            String noHp = noMhs.getText();
            String gender = lakilaki.isSelected() ? "PRIA" : (perempuan.isSelected() ? "WANITA" : "");
            String jurusan = jurusanMhs.getText();
            String agamaMh = agama.getSelectedItem().toString();
    
            // Periksa apakah salah satu field kosong
            if (nim.isEmpty() || nama.isEmpty() || noHp.isEmpty() || gender.isEmpty() || jurusan.isEmpty() || agamaMh.equals("-=pilih=-")) {
                JOptionPane.showMessageDialog(null, "Harap isi semua kolom!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            // Tambahkan Data ke Model Tabel
            Object[] rowData = {nim, nama, noHp, gender, jurusan, agamaMh};
            model.addRow(rowData);
            // Pesan
            JOptionPane.showMessageDialog(null, "Data sudah ditambahkan!", "Pesan", JOptionPane.INFORMATION_MESSAGE);


        } else if (e.getSource() == reset) {
            // Reset semua input
            nimMhs.setText("");
            namaMhs.setText("");
            noMhs.setText("");
            lakilaki.setSelected(false);
            perempuan.setSelected(false);
            jurusanMhs.setText("");
            agama.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new AppGui();
    }

}
