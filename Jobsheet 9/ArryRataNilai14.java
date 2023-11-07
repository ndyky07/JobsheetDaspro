import java.util.Scanner;

public class ArryRataNilai14{
 public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int jumlahMahasiswa;
    double totalLulus= 0;
    double totalTidakLulus=0;
    double rata2Lulus;
    double rata2TidakLulus;
    int jmlLulus= 0;
    int jmlTidakLulus= 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        int [] nilaiMhs = new int [jumlahMahasiswa];

    for (int i =0; i< nilaiMhs.length; i++){
        System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++){
        if (nilaiMhs[i] > 70){
            jmlLulus++;
            totalLulus += nilaiMhs[i];
        } else {
            jmlTidakLulus++;
            totalTidakLulus += nilaiMhs[i];
        }
    }

    rata2Lulus = totalLulus / jmlLulus;
    rata2TidakLulus= totalTidakLulus / jmlTidakLulus;
    System.out.println("Rata-rata nilai Lulus ="+rata2Lulus);
    System.out.println("Rata-rata nilai Tidak Lulus="+rata2TidakLulus);
    }
}