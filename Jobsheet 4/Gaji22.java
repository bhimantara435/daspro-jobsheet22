import java.util.Scanner;
public class Gaji22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotalGaji;
        int gaji, potGaji;
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk=input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        JmlTdkMasuk=input.nextInt();
        System.out.print("Masukkan jumlah gaji : ");
        gaji=input.nextInt();
        System.out.print("Masukkan jumlah potongan gaji : ");
        potGaji=input.nextInt();

        TotalGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" + TotalGaji);
    }
}