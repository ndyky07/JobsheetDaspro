import java.util.Scanner;

public class SearchLinear14 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int key;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array: ");
        int jmlelemen = input.nextInt();
        int[] arrayInt = new int[jmlelemen];
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print("Masukkan elemen array ke-" +(i)+" : ");
            arrayInt[i]= input.nextInt();
        }
        System.out.print("Masukkan key yang dicari: ");
        key= input.nextInt();
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i] == key){
                hasil = i;
            System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
            }else{
               System.out.print("Key tidak ditemukan");
               break;
            }
    
        }
    }
}