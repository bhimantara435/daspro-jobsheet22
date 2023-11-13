import java.util.Scanner;
public class Pemiliha2Percobaan122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int tahun ;

        System.out.println("Tahun kabisat");
        int angka = input22.nextInt();
        
        if ((angka % 4) == 0) {
            if ((angka % 100)== 0) {
                if ((angka % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                }else{System.out.println("Bukan tahun kabisat");}
            }
        } else 
            System.out.println("bukan Tahun kabisat") ;
    }
}