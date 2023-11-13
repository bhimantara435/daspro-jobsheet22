import java.util.Scanner;
/**
 * utsBhimantara
 */
public class utsBhimantara {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        int nilaiMat, nilaiFisika, nilaiBing, nilaiBin;
        float nilaiRaport;

        System.out.println("Nilai Raport mahasiswa");
        nilaiRaport = input21.nextFloat();

        System.out.print("Nilai Matematika  : ");
        nilaiMat = input21.nextInt();
        System.out.print("Nilai Fisika  : ");
        nilaiFisika = input21.nextInt();
        System.out.print("Nilai Bahasa inggris  : ");
        nilaiBing = input21.nextInt();
        System.out.print("Nilai Bahasa Indonesia    : ");
        nilaiBin = input21.nextInt();

        float total =  (nilaiMat * 0.4F) + (nilaiFisika * 0.3F ) + (nilaiBing * 0.1F) + (nilaiBin * 0.20F);
        System.out.println("rata-rata nilai Mahasiswa " + nilaiRaport);

        if (TI.equals("Dari jurusan IPS atau IPA")) {
            if (nilaiMat > 80 && <=80) 
            System.out.print("Di terima di jurusan TI");
        else if (MI.equals("Dari Jurusan IPA")) {
            if (nilaiMat > 80 && <= 80 )
            System.out.println("Nilai Matematika");
            if else (nilaiFisika > 70 && <= 80)
            System.out.println("Nilai Fisika");
            if (nilaiBing > 70 && <= 80)
            System.out.println("Nilai Bahasa Inggris");
            if (nilaiBin > 70 && <= 80)
            System.out.println("nilai Bahasa Indonesia");
        }


        }
        
        

       

    





    }
}