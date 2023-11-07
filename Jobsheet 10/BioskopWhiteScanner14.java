import java.util.Scanner;

public class BioskopWhiteScanner14 {
    public static void main (String []args ){
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom, umur;
        
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Input data penonton ");
            System.out.println("2. Tampilkan daftar penonton ");
            System.out.println("3. Exit ");
            System.out.print("Pilih menu :");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukan nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukan umur : ");
                    umur = sc.nextInt();
                    System.out.print("Masukan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris/kolom tidak tersedia");
                        continue;
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi di baris " + (baris) + ", kolom " + (kolom) + " sudah terisi");
                        System.out.println("Silahkan masukkan baris dan kolom kembali");
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    break;

                case 2:
                    for (int i = 0; i < penonton.length; i++){
                        for (int a = 0; a < 2; a++){
                            if (penonton[i][a] == null) {
                                penonton[i][a] = "*";
                            }
                            System.out.println("Penonton pada baris ke-" + (i+1) + ", kolom " + (a+1) + ":" + penonton[i][a]);
                        }
                    }
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid, silahkan coba lagi");
            }
        }
    }
}