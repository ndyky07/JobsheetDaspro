import java.util.Scanner;

public class UTSDASPRO14 {
    public static void main (String [] args){

        Scanner input14 = new Scanner ( System.in );

        System.out.print("Nilai tes potensi akademik :");
        float potensi akademik = input14.nextFloat ();
        System.out.print("Nilai tes bahasa inggris :");
        float bahasa inggris = input14.nextFloat ();
        System.out.print("Nilai tes wawancara");
        float wawancara= input14.nextFloat ();
    
    float total = (potensiakademik * 0.5F) + (bahasainggris * 0.3F) + (wawancara * 0.2F);
    System.out.println(Nilai akhir = "+ total +");

    if (total > 80){
        System.out.println("Kualifikasi nilai dia lolos disemua jurusan ");
    } else if (total >= 70){
        System.out.println("Kualifikasi nilai dia lolos bahasa inggris untuk jurusan informasi ");
    } else if (total >= 80){
        System.out.println("Kualifikasi nilai dia lolos wawancara untuk jurusan informasi ");
    } else if (total >= 70){
        System.out.println("Kualifikasi nilai dia lolos di jurusan ilmu komputer ");
    } else if (total >= 75){
        System.out.println("Kualifikasi nilai dia lolos jurusan bisnis manajemen ");
    } else if (total >= 60){
        System.out.println("Kualifikasi nilai dia lolos jurusan teknik informatika ");
    
    }




    }
}


