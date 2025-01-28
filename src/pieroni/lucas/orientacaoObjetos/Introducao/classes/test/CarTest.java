package pieroni.lucas.orientacaoObjetos.Introducao.classes.test;

import pieroni.lucas.orientacaoObjetos.Introducao.classes.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Porsche";
        car.model = "911 GT3 RS";
        car.year = 2023;

        Car car2 = new Car();
        car2.name = "BMW";
        car2.model = "M5";
        car2.year = 2022;

        System.out.println(car.name + " " + car.model + " year " + car.year);
        System.out.println(car2.name + " " + car2.model + " year " + car2.year);
    }
}
