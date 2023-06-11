package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab7_Polymorphism;

public abstract class Employee {
    private String name;
    private String noKTP;
    // jawaban no 4
    private String tanggalLahir;
    private int tanggal, bulan, tahun;

    public Employee(String name, String noKTP) {
        this.name = name;
        this.noKTP = noKTP;
        // jawaban no 4
        setTanggalLahir(tanggal, bulan, tahun);
        setBulan(bulan);
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return String.format("  " + getName() + "\nNo.  KTP  : " + getNoKTP());
    }

    // jawaban no 4
    public void setTanggalLahir(int tanggal, int bulan, int tahun) {
        tanggalLahir = tanggal + "-" + bulan + "-" + tahun;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public abstract double earnings();// pendapatan
}
