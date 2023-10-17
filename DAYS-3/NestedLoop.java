import java.util.Scanner;

public interface NestedLoop {
    public static void main(String[] args) {
        String title, namaD, namaB, jeniskelaming;
        int umur;

        try (Scanner inputUser = new Scanner(System.in)) {
            System.out.print("Nama Depan!    : ");
            namaD = inputUser.nextLine();

            System.out.print("Nama Belakang! : ");
            namaB = inputUser.next();

            System.out.print("Umur Anda!    : ");
            umur = inputUser.nextInt();

            System.out.print("Jenis Kelaming (pria/wanita) : ");
            jeniskelaming = inputUser.next();

            if (umur <= 20) {
                title = namaD;
            } else {
                if (jeniskelaming.equalsIgnoreCase("wanita")) {
                    System.out.print("Apakah anda sudah menikah [Ya/tidak]? : ");
                    String status = inputUser.next();

                    if (status.equalsIgnoreCase("Ya")) {
                        title = "Mrs. ";
                    } else {
                        title = "Ms. ";
                    }
                } else {
                    title = "Mr. ";
                }
                System.out.println("\nHello " + title + " " + namaB);
            }
        }

    }
}
