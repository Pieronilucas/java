package pieroni.lucas.javacore.Heranca.test;

import pieroni.lucas.javacore.Heranca.domain.Adress;
import pieroni.lucas.javacore.Heranca.domain.Employee;
import pieroni.lucas.javacore.Heranca.domain.Person;

public class HerancaTest {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setStreet("Russia");
        adress.setZipCode("35500-010");

        Person p1 = new Person("Dante");
        p1.setAdress(adress);
//        p1.setName("Dante");
        p1.setCpf("11005265850");
        p1.print();

        System.out.println("------------------");

        Employee e1 = new Employee("Vergil");
        e1.setAdress(adress);
//        e1.setName("Vergil");
        e1.setCpf("11005278950");
        e1.print();

    }
}
