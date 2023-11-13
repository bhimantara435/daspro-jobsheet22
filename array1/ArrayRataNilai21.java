import java.util.Scanner;
public class ArrayRataNilai21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jmlMhs;
        int jmlLulus=0, jmlTidakLulus=0;
        double rata2lulus=0, rata2TidakLulus=0;
        
        //array
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        for(int i = 0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
         }
        
            for(int i = 0; i<jmlMhs; i++){
                if(nilaiMhs[i]>=70){
                    rata2lulus+=nilaiMhs[i];
                    jmlLulus++;
                }else{
                    rata2TidakLulus+=nilaiMhs[i];
                    jmlTidakLulus++;
                }
            }
            rata2lulus /= jmlLulus;
            rata2TidakLulus /= jmlTidakLulus;
            System.out.println("Rata-rata nilai lulus: "+rata2lulus);
            System.out.println("Rata-rata nilai tidak lulus: "+rata2TidakLulus);
    } 
}
