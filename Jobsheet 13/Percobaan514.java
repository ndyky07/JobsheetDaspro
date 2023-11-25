public class Percobaan514 {

    static void Tampil(String str, double... args) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + args.length);

        for (double arg : args) {
            System.out.println(arg + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Tampil("Daspro 2019", 100, 200);  
        Tampil("Teknologi Informasi", 1.6, 2.7, 3.8, 4.9, 5.4);
        Tampil("Polinema");
    }
}

