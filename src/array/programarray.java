package array;

public class programarray {
    public static void main(String[] args) {
        double[][] nilaimahasiswa = new double[5][30];

        nilaimahasiswa[0][0] = 80;
        nilaimahasiswa[1][0] = 90;
        nilaimahasiswa[2][0] = 75;
        nilaimahasiswa[3][0] = 70;

        nilaimahasiswa[4][0] = nilaimahasiswa[0][0] +
            nilaimahasiswa[1][0] +
            nilaimahasiswa[2][0] +
            nilaimahasiswa[3][0] ;

        System.out.println("nilai si mahasiswa 1 : " +nilaimahasiswa[4][0]);

        nilaimahasiswa[0][1]= 80;
        nilaimahasiswa[1][1]= 90;
        nilaimahasiswa[2][1]= 75;
        nilaimahasiswa[3][1]= 70;

        nilaimahasiswa[4][1] = 0;
        for (int i = 0 ; i<=3 ; i++) {
            nilaimahasiswa[4][1] += nilaimahasiswa[i][1] ;
        }


        System.out.println("nilai si mahasiswa 2 : " +nilaimahasiswa[4][1]);

        double jumlahNilaiAkir = 0;
        for (int i=0 ; i<=3 ; i++){
            jumlahNilaiAkir += nilaimahasiswa[4][1];
        }
        System.out.println(jumlahNilaiAkir);
}
}