package pieroni.lucas.javacore.Classesabstratas.domain;

import pieroni.lucas.javacore.Heranca.domain.Person;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void bonusSalary() {
        this.salary += this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
