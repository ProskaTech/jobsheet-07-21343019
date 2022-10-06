package Tugas;

/*
 * Created_by_21343019_Arafil Azmi
 */

import java.util.Scanner;

public class Tugas1DoWhile {
    public static void main(String[] args) {
        Scanner datamasuk = new Scanner(System.in);

        System.out.print("Masukan Nama Anda : ");
        String nama = datamasuk.nextLine();
        System.out.print("\n");

        int jml = 1;
        
        do
        {
            System.out.println("Nama ke " +jml+ " : " +nama);
            jml++;
        }
        while (jml <= 10);
    }
}
