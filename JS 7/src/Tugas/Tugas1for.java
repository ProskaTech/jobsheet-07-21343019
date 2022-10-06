package Tugas;

/*
 * Created_by_21343019_Arafil Azmi
 */

import java.util.Scanner;

public class Tugas1for {
    public static void main(String[] args) {
        Scanner datamasuk = new Scanner(System.in);

        System.out.print("Masukan Nama Anda : ");
        String nama = datamasuk.nextLine();
        System.out.print("\n");

        int jml;
        for (jml = 1; jml<=10 ; jml++)
        System.out.println("Nama ke " +jml+ " : " +nama);
    }
}
