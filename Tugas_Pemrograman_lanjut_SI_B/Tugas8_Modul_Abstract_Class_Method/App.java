package Abstract;

public class App {
    public static void main(String[] args) {

      // todo...
      Owner owner1 = new Owner("Arsyad");
      Car car1 = new Car(owner1, "Toyota GR Yaris", 2022, 6500);
      car1.printInfo();
  
      Owner owner2 = new Owner("Ardhan");
      Car car2 = new Car(owner2, "Jeep Wrangler", 1972, 6000);
      car2.printInfo();
  
      Owner owner3 = new Owner("Budhi");
      Car car3 = new Car(owner3, "Mazda RX 87", 1967, 10500);
      car3.printInfo();
  
      Owner owner4 = new Owner("Galuh");
      Car car4 = new Car(owner4, "Mercedes Benz 220", 1958, 5500);
      car4.printInfo();
    }
}