import java.util.Scanner;
public class Pemilihan2Percobaan222 {
    public static void main(String[] args){
        Scanner input22 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.print("Masukkan Sudut 1: ");
        sudut1 = input22.nextFloat();
        System.out.print("Masukkan Sudut 2: ");
        sudut2 = input22.nextFloat();
        System.out.print("Masukkan Sudut 3: ");
        sudut3 = input22.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60) ) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            }else if((sudut1 <90)==(sudut2 <90)==(sudut3 <90)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }else if((sudut1 <180)==(sudut2 <180)==(sudut3 <180) ) {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        }else{
            System.out.println("Bukan segitiga");
        }
    }
}