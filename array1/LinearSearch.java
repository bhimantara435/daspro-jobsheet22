import java.util.Scanner;
public class LinearSearch17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jml, hasil, key;

        System.out.print("Masukkan jumlah elemen array: ");
        jml = sc.nextInt();
        int[] array = new int[jml];
        for(int i = 0; i<array.length; i++){
            System.out.print("Masukkan elemen array ke-" +(i)+" : ");
            array[i] = sc.nextInt();
         }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                hasil = i;
                System.out.println("Key ada di posisi indeks ke-"+hasil);
                break;
            }
}
        System.out.println("Key tidak ditemukan");
    }}

