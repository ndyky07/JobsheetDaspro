import java.util.Scanner;

public class Gaji15 {
public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    //Deklarasi
    int jmlMasuk, JmlTdkMasuk, TotGaji;
    int gaji, potGaji;

    //Input
    System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
    JmlTdkMasuk=input.nextInt();
    System.out.println("Masukkan Gaji Anda");
    gaji=input.nextInt();
    System.out.println("Masukkan Potongan Gaji Anda");
    potGaji=input.nextInt();
    
    //Output
    TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
    System.out.println("Gaji yang anda terima adalah" +TotGaji);

}
}