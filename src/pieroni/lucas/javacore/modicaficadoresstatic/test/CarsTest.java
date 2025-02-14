package pieroni.lucas.javacore.modicaficadoresstatic.test;

import pieroni.lucas.javacore.modicaficadoresstatic.domain.Car;

public class CarsTest {
    public static void main(String[] args) {
        Car.setSpeedLimit(180);

                Car car = new Car("Porsche 911", 330);
        Car car2 = new Car("Mercedes g29", 270);
        Car car3 = new Car("BMW M5 Competition", 320);

        car.printInfo();
        car2.printInfo();
        car3.printInfo();

    }
}
