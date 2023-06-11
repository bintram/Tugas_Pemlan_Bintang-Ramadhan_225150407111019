package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab2_Hackerrank_Dan_Modul_Bab2.Modul_Bab2_Constructor;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        // jawaban no 1
        // Student anna = new Student();
        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
        // anna.displayMessage();
        // anna.jumlahObjek(); //jawaban no 5

        // menggunakan constructor lain
        // System.out.println("===================");
        // Student chris = new Student("Chris", "Kediri", 21);
        // chris.setMath(70);
        // chris.setScience(60);
        // chris.setEnglish(90);
        // chris.displayMessage();
        // chris.jumlahObjek(); //jawaban no 5

        // siswa dengan nama anna dirubah informasi alamat dan
        // umurnya melalui constructor
        // System.out.println("===================");
        // anna = new Student("anna", "Batu", 18); //jawaban no 1
        // anna.displayMessage();
        // anna.jumlahObjek(); //jawaban no 5

        // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        // System.out.println("===================");
        // chris.setAddress("Surabaya");
        // chris.setAge(22);
        // chris.displayMessage();
        // chris.jumlahObjek(); //jawaban no 5

        // jawaban no 2
        // anna new Student(100, 80, 89);

        // jawaban no 4
        Scanner input = new Scanner(System.in);

        System.out.print("Input banyaknya siswa: ");
        int jml_siswa = input.nextInt();

        input.nextLine();

        Student[] siswa = new Student[jml_siswa];

        for (int i = 0; i < jml_siswa; i++) {
            System.out.println("Data siswa ke-" + (i + 1));
            System.out.print("Input nama siswa : ");
            String name = input.nextLine();
            System.out.print("Input alamat siswa : ");
            String address = input.nextLine();
            System.out.print("Input umur siswa : ");
            int age = input.nextInt();
            System.out.print("Input nilai matematika : ");
            int math = input.nextInt();
            System.out.print("Input nilai bahasa inggris : ");
            int english = input.nextInt();
            System.out.print("Input nilai ipa : ");
            int science = input.nextInt();

            siswa[i] = new Student();
            siswa[i].setName(name);
            siswa[i].setAddress(address);
            siswa[i].setAge(age);
            siswa[i].setMath(math);
            siswa[i].setEnglish(english);
            siswa[i].setScience(science);

            input.nextLine();

        }
        input.close();

        System.out.println("\n");
        System.out.println("Data siswa : ");
        for (int i = 0; i < jml_siswa; i++) {
            System.out.println("Siswa ke-" + (i + 1));
            siswa[i].displayMessage();
        }

    }
}
