package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab3_Modul_Overload_Overloading.Overloading_Method;

import java.util.Scanner;

public class Overloading {
    public static void HitungLuas(int a, int b) {
        int nilai = a * b;
        System.out.println("maka hasil luas : " + nilai);
    }

    // jawaban no 2
    // public void HitungLuas(int value, int value2)
    public void HitungLuas(double value, double value2) {
        // jawaban no 3
        double nilai1 = value;
        double nilai2 = value2;
        double hasil = nilai1 * nilai2;
        System.out.println("maka hasil luas : " + hasil);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Overloading baru = new Overloading(); // jawaban no 3
        System.out.print("masukkan nilai integer 1 : ");
        int integer1 = in.nextInt();
        System.out.print("masukkan nilai integer 2 : ");
        int integer2 = in.nextInt();
        HitungLuas(integer1, integer2);
        System.out.print("masukkan nilai double 1 : ");
        double double1 = in.nextDouble();
        System.out.print("masukkan nilai double 2 : ");
        // jawaban no 1
        // HitungLuas(double1, double2);
        // System.out.println("Maka hasil luas : "HitungLuas(double1, double2));
        double double2 = in.nextDouble();
        baru.HitungLuas(double1, double2); // jawaban no 3
    }
}
