package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab4_Modul_Enscapsulation.Encapsulation1;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Enkapsulasi");
        s1.setMark(90);
        System.out.println("s1Name is " + s1.getName());
        System.out.println("s1Mark is " + s1.getMark());
        System.out.println("name dan mark " + s1.getName() + " " + s1.getMark());
    }
}