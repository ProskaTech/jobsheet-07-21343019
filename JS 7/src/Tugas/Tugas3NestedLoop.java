package Tugas;

/*
 * Created_by_21343019_Arafil Azmi
 */

 import java.util.Scanner;

public class Tugas3NestedLoop {
    public static void main(String[] args) {
        int i;
        int j;
        int jml_baris;

        System.out.print("TAMPILAN PERULANGAN BERSARANG (NESTED LOOP) \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Baris : ");
        jml_baris = input.nextInt();

        for (i=1; i<=jml_baris; i++)
        {
            for (j=1; j<=i; j++)
                {
                    System.out.print(i);
                }
                    System.out.println();
        }
    }
}
