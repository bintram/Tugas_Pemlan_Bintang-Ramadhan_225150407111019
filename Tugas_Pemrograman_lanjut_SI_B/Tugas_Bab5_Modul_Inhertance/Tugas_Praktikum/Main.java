package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab5_Modul_Inhertance.Tugas_Praktikum;

public class Main {
    public static void main(String[] args) {
        Manusia human1 = new Manusia("siti", "1111", true, true);
        System.out.println(human1);
        Manusia human2 = new Manusia("tono", "2222", false, true);
        System.out.println(human2);
        Manusia human3 = new Manusia("supri", "3333", false, false);
        System.out.println(human3);
        MahasiswaFILKOM m1 = new MahasiswaFILKOM("225150407111019", 2.5, "adi", "4444", false, false);
        System.out.println(m1);
        MahasiswaFILKOM m2 = new MahasiswaFILKOM("225150407111021", 2.5, "adu", "5555", false, false);
        System.out.println(m2);
        MahasiswaFILKOM m3 = new MahasiswaFILKOM("225150407111022", 2.5, "ida", "6666", false, false);
        System.out.println(m3);
        Pekerja p1 = new Pekerja(1000, 2021, 4, 2, 2, "hendik", "1233", true, true);
        System.out.println(p1);
        Pekerja p2 = new Pekerja(1000, 2014, 6, 11, 0, "ruri", "2132", true, true);
        System.out.println(p2);
        Pekerja p3 = new Pekerja(1000, 2003, 5, 8, 10, "putri", "3431", false, true);
        Manager mng1 = new Manager("HRD", 7500, 2008, 5, 9, 3, "dudi", "0231", true, true);
        System.out.println(mng1);
    }
}