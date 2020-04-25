package tugas;

public class tugasperulangan {
    public static void main(String[] args) {
        int isikotak = 0;
        int perkotak = 50;

        System.out.println("isi gelas sekarang : " + isikotak+ "ml");
        System.out.println("isi gelas ketika penuh : " + perkotak+ "ml");

        do {

            isikotak.println("sedang mengisi gelas..");
            System.out.println("isi gelas sekarang : " + isikotak + "ml");

        } while (isikotak != perkotak);

        System.out.println("finale: isi gelas sekarang : " + isikotak + "ml");
    }
}
