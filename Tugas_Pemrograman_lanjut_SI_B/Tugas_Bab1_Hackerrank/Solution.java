package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab1_Hackerrank;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.nextLine();
        double atkPower = scanner.nextDouble();
        double darah = scanner.nextDouble();

        if (darah < 0) {
            System.out.println("Input tidak valid: kesehatan musuh tidak dapat negatif");
            return;
        }

        darah -= atkPower;
        if (darah < 0) {
            darah = 0;
        }

        System.out.println(nama + " attacking enemy with attack power " + atkPower + "0");
        System.out.printf("Health of Enemy = " + darah + "0");
    }
}
