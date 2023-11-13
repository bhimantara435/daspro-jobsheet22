import java.util.Scanner;
public class PemilihanPercobaan122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int angka = input22.nextInt();
        
        // if (angka % 2 == 0) {
        //     System.out.println("angka" + angka + "bilangan genap");
        // } else {
        //     System.out.println("angka" + angka + "bilangan ganjil");            
        // }

            String hasil ;
            hasil = (angka % 2 == 0) ?  "Bilangan genap" : "Bilangan Ganjil" ;
            System.out.println("angka " + angka + " adalah " + hasil);

    }
}