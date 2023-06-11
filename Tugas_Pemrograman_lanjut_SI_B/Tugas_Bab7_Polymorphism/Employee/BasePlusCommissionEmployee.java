package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab7_Polymorphism;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;// gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary, int tanggal,
            int bulan, int tahun) { // tambahkan int tanggal, int bulan, int tahun //jawaban no 4
        super(name, noKTP, sales, rate, tanggal, bulan, tahun); // tambahkan tanggal, bulan, tahun //jawaban no 4
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public String toString() {
        return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary());
    }
}
