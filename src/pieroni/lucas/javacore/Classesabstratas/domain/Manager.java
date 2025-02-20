package pieroni.lucas.javacore.Classesabstratas.domain;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void bonusSalary() {
        this.salary += this.salary * .2;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
