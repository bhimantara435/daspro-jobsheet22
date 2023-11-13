import java.util.Scanner;

public class Pemilihan2Percobaan122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan tahun :");
        tahun = input22.nextInt();
        input22.close();

        if ((tahun % 4) == 0) {
            if ((tahun % 100 == 0)) {
                if ((tahun % 400 == 0))
                    System.out.println("Tahun kabisat");
            } else {
                System.out.println("Bukan tahun kabisat ");
            }
        }

    }
}