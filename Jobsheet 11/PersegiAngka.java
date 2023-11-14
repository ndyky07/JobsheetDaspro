import java.util.Scanner; 

public class PersegiAngka { // untuk mendeklarasikan kelas

    public static void main(String[] args) { // untuk mendeklarasikan metode main()
        Scanner input = new Scanner(System.in); // membuat objek Scanner baru

        System.out.print("Masukkan nilai N : "); // untuk mencetak nilai N
        int N = input.nextInt(); // mendapatkan input dari pengguna dan menyimpannya ke variabel N

        if (N >= 3) { // memeriksa apakah nilai N lebih besar atau sama dengan 3
            for (int i = 1; i <= N; i++) { // melakukan loop dari 1 sampai N
                for (int j = 1; j <= N; j++) { // melakukan loop dari 1 sampai N
                    if (i == 1 || i == N || j == 1 || j == N) { // memeriksa apakah i atau j sama dengan 1 atau N
                        System.out.print(" " + N); 
                    } else { // jika tidak, maka cetak spasi
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else { // jika nilai N kurang dari 3, maka cetak pesan kesalahan
            System.out.println("Nilai N kurang dari 3");
        }
    }
}
