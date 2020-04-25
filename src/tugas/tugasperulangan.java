package tugas;

public class tugasperulangan {
    public static void main(String[] args) {
        int isikotak = 0;
        int perkotak = 100;

        System.out.println("isi kotak sekarang : " + isikotak + "pcs");
        System.out.println("isi minuman perkotak penuh : " + perkotak + "pcs");

        do {

            isikotak++;
            System.out.println("sedang mengisi minuman di kotak..");
            System.out.println("isi minuman perkotak : " + isikotak + "pcs");

        } while (isikotak != perkotak);

        System.out.println("finale: isi perkotak sekarang : " + isikotak + "pcs");
    }
}
