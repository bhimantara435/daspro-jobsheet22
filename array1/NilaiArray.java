import java.util.Scanner;

public class NilaiArray {

    public static void main(String[] args) {
        // Deklarasi variabel
        int n; // Banyaknya elemen
        int[] data; // Array untuk menyimpan nilai
        int max = Integer.MIN_VALUE; // Nilai tertinggi
        int min = Integer.MAX_VALUE; // Nilai terendah
        int total = 0; // Total nilai

        // Membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        n = input.nextInt();
        data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // Mencari nilai tertinggi
        for (int i = 0; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        // Mencari nilai terendah
        for (int i = 0; i < n; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        // Mencari total nilai
        for (int i = 0; i < n; i++) {
            total += data[i];
        }

        // Menampilkan output
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Rata-rata: " + (total / n));
    }
}