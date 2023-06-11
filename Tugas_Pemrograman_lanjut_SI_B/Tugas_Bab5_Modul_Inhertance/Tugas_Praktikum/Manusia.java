package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab5_Modul_Inhertance.Tugas_Praktikum;

public class Manusia {
    public String nama, nik;
    public boolean jenisKelamin, menikah;
    public double pendapatan, tunjangan;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah == true && jenisKelamin == true) {
            tunjangan = +25;
        }
        if (menikah == true && jenisKelamin == false) {
            tunjangan = +20;
        }
        if (menikah == false) {
            tunjangan = +15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        pendapatan = +getTunjangan();
        return pendapatan;
    }

    @Override
    public String toString() {
        System.out.println("Nama : " + nama);
        System.out.println("NIK : " + nik);
        System.out.print("Jenis Kelamin : ");
        if (jenisKelamin == true) {
            System.out.println("Laki-laki");
        } else
            System.out.println("Perempuan");
        System.out.println("Pendapatan : " + getPendapatan());
        String dummy = "\n";
        return dummy;
    }
}