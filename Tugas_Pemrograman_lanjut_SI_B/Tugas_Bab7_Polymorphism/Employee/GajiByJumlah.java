package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab7_Polymorphism;

public class GajiByJumlah extends Employee {
    private double jmlProd, upah = 25;

    public GajiByJumlah(String name, String noKTP, double jmlProd) {
        super(name, noKTP);
        this.jmlProd = jmlProd;
    }

    public double getJmlProd() {
        return jmlProd;
    }

    @Override
    public double earnings() {
        return getJmlProd() * upah * 4;
    }

    public String toString() {
        return String.format("pegawai borongan: " + super.toString() + "\nJumlah produksi/minggu : " + getJmlProd());
    }
}
