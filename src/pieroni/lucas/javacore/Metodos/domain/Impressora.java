package pieroni.lucas.javacore.Metodos.domain;

public class Impressora {
    public void imprime(Estudante estudante) {
        System.out.println("---------------");
        estudante.name = "Gohan";
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.gender);
    }

}
