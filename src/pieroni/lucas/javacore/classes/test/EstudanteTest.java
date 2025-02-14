package pieroni.lucas.javacore.classes.test;

import pieroni.lucas.javacore.classes.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Lucas";
        estudante.age = 23;
        estudante.gender = 'M';


        System.out.println("Name: " + estudante.name + " | age: " + estudante.age + " | gender: " + estudante.gender);
        //System.out.println(estudante.age);
        //System.out.println(estudante.gender);

    }
}
