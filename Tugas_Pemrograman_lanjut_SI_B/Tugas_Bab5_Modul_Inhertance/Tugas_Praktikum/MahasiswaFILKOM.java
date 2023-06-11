package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab5_Modul_Inhertance.Tugas_Praktikum;

public class MahasiswaFILKOM extends Manusia {
    public String nim, status;
    public double ipk, beasiswa;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String prodi = "null", angkatan;
        String cek1 = nim.substring(6, 7);
        String cek2 = (nim.substring(0, 2));
        if ("2".equals(cek1)) {
            prodi = "Teknik Informatika";
        }
        if ("3".equals(cek1)) {
            prodi = "Teknik Komputer";
        }
        if ("4".equals(cek1)) {
            prodi = "Sistem Informasi";
        }
        if ("6".equals(cek1)) {
            prodi = "Pendidikan Teknologi Informasi";
        }
        if ("7".equals(cek1)) {
            prodi = "Teknologi Informasi";
        }
        angkatan = ("20" + cek2);
        status = (prodi + ", " + angkatan);
        return status;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            beasiswa = +50;
        }
        if (ipk >= 3.5 && ipk <= 4) {
            beasiswa = +75;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        pendapatan = +getTunjangan() + getBeasiswa();
        return pendapatan;
    }

    public String toString() {
        super.toString();
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Status : " + getStatus());
        String dummy = "\n";
        return dummy;
    }
}