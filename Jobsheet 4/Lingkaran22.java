import java.util.Scanner;
public class Lingkaran22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in) ;
        int r;
        double keliling, phi=3.14, luas;
        System.out.println("Masukkan jari-jari lingkaran:");
        r=input.nextInt();
        keliling=phi*r;
        luas=phi*r*r;
        System.out.println("keliling lingkaran adalah");
        System.out.println(keliling);
        System.out.println("luas lingkaran adalah");
        System.out.println(luas); 
        
        }
}