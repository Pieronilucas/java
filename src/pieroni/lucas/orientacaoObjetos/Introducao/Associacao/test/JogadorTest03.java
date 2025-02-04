package pieroni.lucas.orientacaoObjetos.Introducao.Associacao.test;

import pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain.Jogador;
import pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j = new Jogador("Messi");
        Jogador j2 = new Jogador("Suarez");
        Time time = new Time("Inter Miami");
        Jogador[] jogadores = {j, j2};

        j.setTime(time);
        j2.setTime(time);
        time.setJogadores(jogadores);

        j.print();
        System.out.println("------------");
        j2.print();
        System.out.println("------------");
        time.print();
    }
}
