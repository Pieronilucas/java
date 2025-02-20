package pieroni.lucas.javacore.Classesabstratas.domain;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        bonusSalary();
    }

    public abstract void bonusSalary();
}

