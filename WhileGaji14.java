import java.util.Scanner;

public class WhileGaji14 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int jumlahKaryawan;
        int jumlahJamLembur;
        double gajiLembur = 0;
        double totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan :");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ":");
            jabatan = sc.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = sc.nextInt();
            1++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan Invalid");
                1--;
                continue;
            }

            totalGajiLembur += gajiLembur;
        }
        
        System.out.println("Total gaji lembur :" + totalGajiLembur);
    }
}