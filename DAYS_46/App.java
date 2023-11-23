package DAYS_46;

public class App {
    public static void main(String[] args) {
        
        // CARA KE 1
        // JFrame frame = new JFrame(); // Membuat object jframe
        // frame.setTitle("Belajar GUI dengan JAVA"); // memberi judul
        // frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        // frame.setResizable(false); // agar frame tidak bisa di resize
        // frame.setSize(420, 420); // mengatur ukuran x dan y
        // frame.setVisible(true);

        // ImageIcon image = new ImageIcon("user.png"); // Membuat image icon
        // frame.setIconImage(image.getImage()); // mengubah icon pada frame
        // // frame.getContentPane().setBackground(Color.green); // mengubah warna background pada frame
        // frame.getContentPane().setBackground(new Color(0,255,0)); // mengubah warna background pada frame dengan rgb

        // CARA KE 2
        // Memanggil object MyFrame
        MyFrame myFrame = new MyFrame();
    }
}
