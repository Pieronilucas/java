package pieroni.lucas.orientacaoObjetos.Introducao.metodos.test;

import pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain.Estudante;
import pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain.Impressora;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        Impressora impressora = new Impressora();

        estudante.name = "Sasuke";
        estudante.age = 21;
        estudante.gender = 'M';

        estudante2.name = "Naruto";
        estudante2.age = 20;
        estudante2.gender = 'M';

        impressora.imprime(estudante);
        impressora.imprime(estudante2);


      /*
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
        System.out.println("------------");
        System.out.println(estudante2.name);
        System.out.println(estudante2.age);
        System.out.println(estudante2.gender);
       */
    }
}
