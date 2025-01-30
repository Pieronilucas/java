package pieroni.lucas.orientacaoObjetos.Introducao.metodos.domain;

public class Impressora {
    public void imprime (Estudante estudante) {
        System.out.println("---------------");
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }

}
