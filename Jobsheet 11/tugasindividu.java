import java.util.Scanner;

public class tugasindividu { // untuk mendeklarasikan kelas 

    public static void main(String[] args) { // mendeklarasikan metode main()
        Scanner sc = new Scanner(System.in); // membuat objek Scanner baru


        System.out.print("Masukkan nilai N: "); // untuk memasukkan nilai N dan menyimpannya dalam variabel n
        int n = sc.nextInt();

        if (n < 3) { 
            System.out.println("Nilai N harus >= 3"); 
        } else { // memeriksa apakah nilai N kurang dari 3 Jika iya, maka program akan mencetak pesan kesalahan dan berhenti. Jika tidak, maka program tidak melanjutkan ke berikutnya

            for (int i = 1; i <= n; i++) { /// memulai loop for yang akan diulang sebanyak nilai N
                for (int j = n - i; j >= 1; j--) {
                    System.out.print(" "); //  memulai loop for lain yang akan diulang sebanyak nilai N - i, loop ini akan mencetak spasi untuk membuat segitiga angka sama kaki
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j); // memulai loop for lain yang akan diulang sebanyak nilai i, loop ini akan mencetak angka dari 1 hingga i untuk membuat segitiga angka sama kaki.
               }
                System.out.println(); // mencetak baris baru untuk mengakhiri segitiga angka sama kaki.
            }
        }
    }
}

