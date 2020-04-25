package perulangan;

public class programdowhile {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("isi gelas sekarang : " + isiGelas + "ml");
        System.out.println("isi gelas ketika penuh : " + penuh + "ml");

        do {

            isiGelas++;
            System.out.println("sedang mengisi gelas..");
            System.out.println("isi gelas sekarang : " + isiGelas + "ml");

        }while (isiGelas != penuh);

        System.out.println("finale: isi gelas sekarang : " + isiGelas + "ml");

    }
}

