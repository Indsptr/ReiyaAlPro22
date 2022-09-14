import java.util.Scanner;

public class Kelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, keterangan ;
        int nilai;
        System.out.print("Masukan Nama : ");
        nama =input.nextLine();
        System.out.print("Masukan Nilai : ");
        nilai =input.nextInt();

        if(nilai >=60) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }
    
        System.out.println(nama + " " + keterangan);
    }

}