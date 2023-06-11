package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab7_Polymorphism;

public class HourlyEmployee extends Employee {
    private double wage; // upah per jam
    private double hours; // jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked, int tanggal, int bulan,
            int tahun) { // tambahkan int tanggal, int bulan, int tahun //jawaban no 4
        super(name, noKTP); // tambahkan tanggal, bulan, tahun //jawaban no 4
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    public String toString() {
        return String.format("Hourly  employee: " + super.toString() + "\nhourly  wage: " + getWage()
                + "\nhours  worked: " + getHours());
    }
}
