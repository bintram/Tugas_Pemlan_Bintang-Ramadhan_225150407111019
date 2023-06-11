package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab2_Hackerrank_Dan_Modul_Bab2.Modul_Bab2_Constructor;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    public static int jumlah;

    public Student() { // soal no 1
        name = "";
        address = "";
        age = 0;
    }

    public Student(String n, String a, int ag) {
        jumlah++;
        name = n;
        address = a;
        age = ag;
    }

    // jawaban no 2
    public Student(double math, double english, double science) {
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    // jawaban no 3
    // method statusAkhir
    public boolean statusAkhir() {
        if (average >= 61) {
            return true;
        } else {
            return false;
        }
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata" + getAverage());
        // menampilkan method statusAkhir
        if (statusAkhir() == false) {
            System.out.println("Siswa dinyatakan lolos");
        } else {
            System.out.println("Siswa diharuskan mengikuti remidi");
        }
    }

    // jawaban no 5
    public void jumlahObjek() {
        System.out.println("Banyaknya objek yang telah dibuat adalah " + jumlah);
    }
}
