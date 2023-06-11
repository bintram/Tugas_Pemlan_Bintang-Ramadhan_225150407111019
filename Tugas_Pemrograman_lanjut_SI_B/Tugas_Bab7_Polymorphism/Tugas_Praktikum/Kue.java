package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab7_Polymorphism.Tugas_Praktikum;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        return "Nama Kue : " + nama + "\nHarga Kue : " + harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}
