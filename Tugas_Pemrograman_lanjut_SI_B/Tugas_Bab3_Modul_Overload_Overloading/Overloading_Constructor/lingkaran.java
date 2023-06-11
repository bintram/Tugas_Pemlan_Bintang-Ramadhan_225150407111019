package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab3_Modul_Overload_Overloading.Overloading_Constructor;

public class lingkaran { // jawaban no 1, tidak terjadi error tetapi harusnya nama bangun datar yaitu
                         // segitiga karena memiliki alas dan tinggi
    int alas, tinggi;

    public lingkaran(int alas) {
        this.alas = alas;
    }

    // jawaban no 2
    // public lingkaran(int tinggi){
    // this.tinggi = tinggi;
    // }
    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // jawaban no 3
    public lingkaran(String Alas, String Tinggi) {
        this.alas = Integer.parseInt(Alas);
        this.tinggi = Integer.parseInt(Tinggi);
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}
