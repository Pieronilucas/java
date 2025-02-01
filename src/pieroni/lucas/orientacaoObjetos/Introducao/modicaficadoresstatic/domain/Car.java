package pieroni.lucas.orientacaoObjetos.Introducao.modicaficadoresstatic.domain;

public class Car {
    private String name;
    private double maxSpeed;
    private static double speedLimit = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void printInfo() {
        System.out.println("-----------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Speed Limit: " + Car.speedLimit);
    }

    public static double getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
