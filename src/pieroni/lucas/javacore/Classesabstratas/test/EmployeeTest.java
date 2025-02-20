package pieroni.lucas.javacore.Classesabstratas.test;

import pieroni.lucas.javacore.Classesabstratas.domain.Developer;
import pieroni.lucas.javacore.Classesabstratas.domain.Employee;
import pieroni.lucas.javacore.Classesabstratas.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 6500);
        Developer developer = new Developer("Peter Parker", 10500);
        System.out.println(developer);
        System.out.println(manager);
    }
}
