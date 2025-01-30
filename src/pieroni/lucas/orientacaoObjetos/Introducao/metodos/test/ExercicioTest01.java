package pieroni.lucas.orientacaoObjetos.Introducao.metodos.test;

import pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain.Exercicio;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Exercicio exercicio = new Exercicio();
        exercicio.setName("Lucas Pieroni");
        exercicio.setAge(23);
        exercicio.setSalary(new double[]{2500, 5000, 2500});

        exercicio.printData();

    }
}
