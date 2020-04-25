package tugas;

public class tugasarray {
    public static void main(String[] args) {

        String[][] kontak = {{"Arif,18630333"}, {"dony,1863987"}, {"bibi,1863234"}};

        for (int x = 0; x < kontak.length; x++) {
            System.out.println("Nama: " + kontak[x][0]);
            System.out.println("NPM: " + kontak[x][1]);
            System.out.println("-----------------------------");
        }

        }
    }

