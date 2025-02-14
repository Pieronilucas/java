package pieroni.lucas.javacore.Associacao.test;

import pieroni.lucas.javacore.Associacao.domain.Jogador;
import pieroni.lucas.javacore.Associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j = new Jogador("Messi");
        Time time = new Time("Inter Miami");
        j.setTime(time);
        j.print();
    }
}
