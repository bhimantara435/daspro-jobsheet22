import java.util.Scanner;
public class HargaBayar22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int harga, jumlah, jmlHalBuku;
        String merkBuku;
        double dis, total, bayar, jmlDis;

        System.out.print("Masukkan merk buku : ");
        merkBuku = input.nextLine();
        System.out.print("Jumlah halaman buku yang di beli : ");
        jmlHalBuku = input.nextInt();
        System.out.print("Masukkan harga barang yang di beli :");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang di beli :");
        jumlah = input.nextInt();
        System.out.print("Masukkan diskon yang di dapatkan : ");
        dis = input.nextDouble();

        total = jumlah*harga;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("-----------------------------");
        System.out.println("Total Harga : " + total);
        System.out.println("Diskon yang anda dapat : " + jmlDis);
        System.out.println("-----------------------------");
        System.out.println("Jumlah yang harus dibayar : " + bayar);
        
        

    }
}