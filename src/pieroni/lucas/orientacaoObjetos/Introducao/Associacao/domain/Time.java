package pieroni.lucas.orientacaoObjetos.Introducao.Associacao.domain;

public class Time {
    private String name;
    private Jogador[] jogadores;

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }
    public void print() {
        System.out.println(this.name);
        if (this.jogadores == null) {return;}
        for (Jogador jogador : this.jogadores) {
            System.out.println(jogador.getName());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
