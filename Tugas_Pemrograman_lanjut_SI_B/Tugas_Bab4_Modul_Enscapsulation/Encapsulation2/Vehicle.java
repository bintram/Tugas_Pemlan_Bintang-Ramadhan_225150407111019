package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab4_Modul_Enscapsulation.Encapsulation2;

public class Vehicle {

    // jawaban no 3
    // public double load, maxLoad;
    // jawaban no 4
    //// protected double load, maxLoad;
    double load, maxLoad; // jawaban no 5

    public Vehicle(double max) {
        this.maxLoad = max;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = 0.0D;
        temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}
