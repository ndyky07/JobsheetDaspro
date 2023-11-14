import java.util.Scanner;

public class SegitigaBintang { // untuk mendeklarasikan kelas 

    public static void main(String[] args) {  // mendeklarasikan metode main()
        Scanner sc = new Scanner(System.in); // membuat objek Scanner baru


        System.out.print("Masukkan nilai N: "); // untuk memasukkan nilai N dan menyimpannya dalam variabel n
        int n = sc.nextInt(); 

        if (n < 5) { 
            System.out.println("Nilai N harus >= 5");
        } else { // memeriksa apakah nilai N kurang dari 5 Jika iya, maka program akan mencetak pesan kesalahan dan berhenti. Jika tidak, maka program tidak melanjutkan ke berikutnya
            for (int i = n; i >= 1; i--) { // memulai loop for yang akan diulang sebanyak nilai N
                for (int j = 1; j <= i; j++) { 
                    System.out.print("*"); // memulai loop for lain yang akan diulang sebanyak nilai i, loop ini akan mencetak tanda bintang (*) untuk membuat segitiga bintang
                }
                System.out.println(); //  mencetak baris baru untuk mengakhiri segitiga bintang
            }
        }
    }
}
