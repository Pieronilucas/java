package pieroni.lucas.javacore.Modificadorfinal.test;

import pieroni.lucas.javacore.Modificadorfinal.domain.Car;
import pieroni.lucas.javacore.Modificadorfinal.domain.Ferrari;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.MAX_SPEED);
        System.out.println(car.BUYER);
        car.BUYER.setNameBuyer("Goku");
        System.out.println(car.BUYER);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo Ferrari");
        ferrari.print();
    }
}
