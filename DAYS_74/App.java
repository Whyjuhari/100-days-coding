package DAYS_74;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;


public class App implements ActionListener {
    
    // binkai
    JFrame frame = new JFrame("DATA MAHASISWA");

    // pembunkus
    JPanel panel = new JPanel();

    JLabel judul = new JLabel("FORM DATA MAHASISWA");

    // inputan data
    JTextField namaMahasiswa = new JTextField();
    JTextField nim = new JTextField();
    JTextField kelas = new JTextField();
    JTextField ipk = new JTextField();
    JTextField noTelepon = new JTextField();

    // judul dari masing-masing inputan
    JLabel namaLabel = new JLabel("Nama");
    JLabel nimLabel = new JLabel("NIM");
    JLabel kelasLabel = new JLabel("Kelas");
    JLabel ipkLabel = new JLabel("IPK");
    JLabel notelp = new JLabel("No Hp");

    // pilihan gender
    JComboBox<String> jenisKelamin;
    JLabel jenisKelaminLabel = new JLabel("Jenis Kelamin");

    // tombol submit & reset 
    JButton submit = new JButton("Submit");
    JButton reset = new JButton("Reset");

    JButton edit = new JButton("Edit");
    JButton delete = new JButton("Delete");


    // membuat tabel dalam bentuk default
    DefaultTableModel model;
    JTable dataTable;

    App() {
        judul.setBounds(120, 50, 300, 25);
        judul.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        namaLabel.setBounds(50, 100, 200, 25);
        nimLabel.setBounds(50, 150, 200, 25);
        kelasLabel.setBounds(50, 200, 200, 25);
        ipkLabel.setBounds(50, 250, 200, 25);
        notelp.setBounds(50, 300, 200, 25);

        namaMahasiswa.setBounds(150, 100, 200, 35);
        nim.setBounds(150, 150, 200, 35);
        kelas.setBounds(150, 200, 200, 35);
        ipk.setBounds(150, 250, 200, 35);
        noTelepon.setBounds(150, 300, 200, 35);

        // Inputan untuk pilihan
        String[] pilihanKelamin = {"Laki-Laki", "Perempuan"};
        jenisKelaminLabel.setBounds(50, 350, 200, 25);
        jenisKelamin = new JComboBox<>(pilihanKelamin);
        jenisKelamin.setBounds(150, 350, 200, 25);

        // Tombol submit dan reset
        submit.setBounds(150, 400, 100, 25);
        submit.addActionListener(this);

        reset.setBounds(250, 400, 100, 25);
        reset.addActionListener(this);

        // Tombol edit dan delete
        edit.setBounds(450, 300, 100, 25);
        edit.addActionListener(this);

        delete.setBounds(560, 300, 100, 25);
        delete.addActionListener(this);

        // Ini kolom pada tabel
        String[] kolom = {"NAMA", "NIM", "KELAS", "IPK", "NO HP", "GENDER"};

        model = new DefaultTableModel(kolom, 0);

        JLabel judulTabel = new JLabel("DAFTAR MAHASISWA");
        judulTabel.setBounds(750, 50, 400, 50);
        judulTabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        // Membuat tabel
        dataTable = new JTable(model);
        dataTable.setRowHeight(20);

        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < dataTable.getColumnCount(); i++) {
            dataTable.getColumnModel().getColumn(i).setCellRenderer(center);
        }

        // Scroll jika data lebih banyak
        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setBounds(450, 100, 850, 150);
        
        
        // menambah semuah elemen kedalam frame
        frame.add(scrollPane);
        frame.add(judul);
        frame.add(judulTabel);
        frame.add(namaLabel);
        frame.add(nimLabel);
        frame.add(kelasLabel);
        frame.add(ipkLabel);
        frame.add(notelp);

        frame.add(namaMahasiswa);
        frame.add(nim);
        frame.add(kelas);
        frame.add(ipk);
        frame.add(noTelepon);

        frame.add(jenisKelaminLabel);
        frame.add(jenisKelamin);

        frame.add(submit);
        frame.add(reset);
        frame.add(edit);
        frame.add(delete);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1350, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ketika tombol submit di klik
        if (e.getSource() == submit) {
            String jenisKelaminValue = jenisKelamin.getSelectedItem().toString();

            model.addRow(new Object[]{namaMahasiswa.getText(), nim.getText(), kelas.getText(), ipk.getText(),
                    noTelepon.getText(), jenisKelaminValue});

            // pesan dialog
            JOptionPane.showMessageDialog(null, "Data sudah ditambahkan!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        // ketika tombol reset di klik
        } else if (e.getSource() == reset) {
            namaMahasiswa.setText("");
            nim.setText("");
            kelas.setText("");
            ipk.setText("");
            noTelepon.setText("");

        } else if (e.getSource() == delete) {
            int selectedRow = dataTable.getSelectedRow();
            if (selectedRow != -1) {
                int option = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data ini?", "Komfirmasi", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    model.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
