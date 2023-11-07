import java.util.Scanner;

public class HargaBayar15 {
public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    //Deklarasi
    int harga, jumlah, jumlahhalaman;
    double dis, total, bayar, jmlDis;
    String merk;

    //Input
    System.out.println("Masukkan harga barang yang dibeli\t: ");
    harga = input.nextInt();
    System.out.println("Masukkan jumlah barang yang dibeli\t: ");
    jumlah = input.nextInt();
    input.nextLine();
    System.out.println("Masukkan merk buku yang dibeli\t: ");
    merk = input.nextLine();
    System.out.println("Masukkan jumlah halaman buku yang dibeli\t: ");
    jumlah = input.nextInt();
    System.out.println("Masukkan diskon buku yang dibeli\t: ");
    dis = input.nextInt();

    //Output
    total = harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;
    System.out.println("Diskon yang anda dapatkan adalah" +jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah" +bayar);
}



}