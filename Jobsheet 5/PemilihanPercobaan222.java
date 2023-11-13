import java.util.Scanner;
public class PemilihanPercobaan222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        System.out.print("Nilai uas : ");
        float uas = input22.nextFloat () ; 
        System.out.print("Nilai uts : ");
        float uts = input22.nextFloat ();
        System.out.print("Nilai kuis : ");
        float kuis = input22.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input22.nextFloat ();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F) ;
        // String message = total < 65 ? "Remidi" : "tidak remidi";
        // System.out.println("Nilai akhir = " +  total + "Sehingga" + message );

        if (total > 80 && total <= 100) {
            System.out.print("A ");
            System.out.print("Nilai 4 ");
            System.out.print("Sangat baik");
        } else if (total > 73 && total <= 80){
            System.out.print("B+ ");
            System.out.print("Nilai 3,5 ");
            System.out.print("Lebih dari baik");
        } else if (total > 65 && total <= 73){
            System.out.print("B ");
            System.out.print("Nilai 3 ");
            System.out.print("Baik");
        } else if (total > 60 && total <= 65){
            System.out.print("C+ ");
            System.out.print("Nilai 2,5 ");
            System.out.print("Lebih dari cukup");
        } else if (total > 50 && total <= 60) {
            System.out.print("C ");
            System.out.print("Nilai 2 ");
            System.out.print("Cukup");
        } else if (total > 39 && total <= 50) {
            System.out.print("D ");
            System.out.print("Nilai 1 ");
            System.out.print("kurang");
        } else if (total <= 39 && total > 0) {
            System.out.print("E ");
            System.out.print("Nilai 0 ");
            System.out.print("Gagal");
        } else {
            System.out.print("Terjadi kesalaha");
        }

       }
}
    // if (angka % 2 == 0) {
    //     System.out.printf("Angka %d bilangan Genap",angka);
    // } else {
    //     System.out.printf("Angka %d bilangan Ganjil",angka);
    // }