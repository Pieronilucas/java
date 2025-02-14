package pieroni.lucas.javacore.Associacao.domain;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        if (this.time != null) {
            System.out.println(time.getName());
        }

    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
