import java.util.Scanner;
/**
 * ArrayNilai21
 */
public class ArrayNilai21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < 10; i++ ) {
            System.out.print("Masukkan nilai akhir ke -"+i+ " : ");
            nilaiAkhir[i] = sc.nextInt();

        
        }
        for (int i = 0; i < 10; i++)  {
            System.out.print("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
            if (nilaiAkhir[i] > 70) {
            System.out.println("Selamat mahasiswa ke-"+i+" lulus!");
            }
            else {
            System.out.println("Mohon maaf mahasiswa ke-"+i+" tidak lulus ");
            }
            
        }
    }
}
