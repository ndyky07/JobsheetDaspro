import java.util.Scanner;

public class PemilihanPercobaan115 {
    public static void main (String [] args){

        Scanner input15 = new Scanner(System.in);

        int angka ;
        System.out.print("Masukkan angka :");
        angka = input15.nextInt();

        int nomor = 17;

        String hasil = (angka % 2 == 0 ) ? "Genap" : "Ganjil";
        System.out.println("Angka ini adalah " + hasil);
    }
}
