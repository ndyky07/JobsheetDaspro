import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Porseni2024 {

    public static void main(String[] args) {

        // Buat array list untuk menyimpan data atlet
        ArrayList<Atlet> atletList = new ArrayList<>();

        // Tambahkan data atlet
        atletList.add(new Atlet("Adi", "Badminton", "Politeknik Negeri Malang"));
        atletList.add(new Atlet("Budi", "Tenis Meja", "Politeknik Negeri Bandung"));
        atletList.add(new Atlet("Cici", "Basket", "Politeknik Negeri Semarang"));
        atletList.add(new Atlet("Dodi", "Bola Voli", "Politeknik Negeri Yogyakarta"));
        atletList.add(new Atlet("Eka", "Badminton", "Politeknik Negeri Surabaya"));
        atletList.add(new Atlet("Fani", "Tenis Meja", "Politeknik Negeri Jakarta"));
        atletList.add(new Atlet("Gina", "Basket", "Politeknik Negeri Medan"));
        atletList.add(new Atlet("Hendi", "Bola Voli", "Politeknik Negeri Makassar"));

        // Urutkan data atlet berdasarkan nama
        Collections.sort(atletList, new Comparator<Atlet>() {
            @Override
            public int compare(Atlet a1, Atlet a2) {
                return a1.Nama.compareTo(a2.Nama);
            }
        });

        // Tampilkan data atlet
        for (Atlet atlet : atletList) {
            System.out.println(atlet.Nama + ", " + atlet.CabangOlahraga + ", " + atlet.Politeknik);
        }
    }

}

class Atlet {

    private String nama;
    private String cabangOlahraga;
    private String politeknik;

    public Atlet(String nama, String cabangOlahraga, String politeknik) {
        this.nama = nama;
        this.cabangOlahraga = cabangOlahraga;
        this.politeknik = politeknik;
    }

}
