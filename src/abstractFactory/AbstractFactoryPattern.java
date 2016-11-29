package abstractFactory;

public class AbstractFactoryPattern {
  public static void main(String[] args) {
    System.out.println("Abstract Factory Pattern Demonstration.");
    System.out.println("---------------------------------------");
    // Create abstract factories
    System.out.println("Constructing abstract factories.");
    AbstractFactoryIF factoryOne = new FordFactory();
    AbstractFactoryIF factoryTwo = new GMFactory();
    // Create cars via abstract factories
    System.out.println("Constructing cars.");
    AbstractSportsCarIF  car1 = factoryOne.createSportsCar();
    AbstractEconomyCarIF car2 = factoryOne.createEconomyCar();
    AbstractSportsCarIF  car3 = factoryTwo.createSportsCar();
    AbstractEconomyCarIF car4 = factoryTwo.createEconomyCar();
    // Execute drive on the cars
    System.out.println("Calling drive on the cars.");
    car1.driveFast();
    car2.driveSlow();
    car3.driveFast();
    car4.driveSlow();
    System.out.println();
  }
}