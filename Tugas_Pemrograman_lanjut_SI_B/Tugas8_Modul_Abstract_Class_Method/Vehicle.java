package Abstract;

public abstract class Vehicle {
    // buat variabel nama, tahun, dan rpm
    protected String name;
    protected int year;
    protected double rpm;

    // buat sebuah method abstrak yang nantinya akan di override oleh class Car
    public abstract void printInfo();
}
