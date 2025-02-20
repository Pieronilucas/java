package pieroni.lucas.javacore.Metodos.test;

import pieroni.lucas.javacore.Metodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
//        p1.nome = "Pedro";
//        p1.idade = 20;
        p1.setNome("Lucas");
        p1.setIdade(23);
//        p1.imprimir();
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}
