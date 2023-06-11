package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab5_Modul_Inhertance.Tugas_Praktikum;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    public double gaji, bonus;
    public int jumlahAnak;
    public LocalDate tahunMasuk, tahunNow = LocalDate.now();

    public Pekerja(double gaji, int tahun, int bulan, int hari, int anak, String nama, String nik, boolean jenisKelamin,
            boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = anak;
    }

    public double getBonus() {
        long years = tahunMasuk.until(tahunNow, ChronoUnit.YEARS);
        if (years > 0 && years <= 5) {
            bonus = +(gaji * 0.05);
        }
        if (years > 5 && years < 10) {
            bonus = +(gaji * 0.1);
        }
        if (years >= 10) {
            bonus = +(gaji * 0.15);
        }
        return bonus;
    }

    public double getGaji() {
        gaji = gaji + getBonus();
        return gaji;
    }

    public double getTunjangan() {
        super.getTunjangan();
        tunjangan = +20 * jumlahAnak;
        return tunjangan;
    }

    @Override
    public double getPendapatan() {
        pendapatan = +getGaji() + getTunjangan();
        return pendapatan;
    }

    public String toString() {
        super.toString();
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Jumlah Anak : " + jumlahAnak);
        System.out.println("Gaji : " + getGaji());
        String dummy = "\n";
        return dummy;
    }
}
