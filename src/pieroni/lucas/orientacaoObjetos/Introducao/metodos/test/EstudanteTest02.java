package pieroni.lucas.orientacaoObjetos.Introducao.metodos.test;

import pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain.Estudante;
import pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain.Estudante02;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante02 estudante01 = new Estudante02();
        Estudante02 estudante02 = new Estudante02();

        estudante01.name = "Sasuke";
        estudante01.age = 21;
        estudante01.gender = 'M';

        estudante02.name = "Naruto";
        estudante02.age = 20;
        estudante02.gender = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
