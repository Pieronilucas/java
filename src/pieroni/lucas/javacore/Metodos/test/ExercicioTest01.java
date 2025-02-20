package pieroni.lucas.javacore.Metodos.test;

import pieroni.lucas.javacore.Metodos.domain.Exercicio;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Exercicio exercicio = new Exercicio();
        exercicio.setName("Lucas Pieroni");
        exercicio.setAge(23);
        exercicio.setSalary(new double[]{2500, 5000, 2500});

        exercicio.printData();

    }
}
