package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab5_Modul_Inhertance.Tugas_Praktikum;

public class Manager extends Pekerja {
    public String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int hari, int anak, String nama, String nik,
            boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, anak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public double getTunjangan() {
        super.getTunjangan();
        tunjangan = +(gaji * 0.1);
        return tunjangan;
    }

    public String toString() {
        super.toString();
        System.out.println("Departemen : " + departemen);
        String dummy = "";
        return dummy;
    }
}
