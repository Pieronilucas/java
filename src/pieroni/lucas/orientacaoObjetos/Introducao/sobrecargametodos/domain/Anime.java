package pieroni.lucas.orientacaoObjetos.Introducao.sobrecargametodos.domain;

public class Anime {
    private String name;
    private String type;
    private int episode;
    private String genre;

    public void init(String name, String type, int episode) {
        this.name = name;
        this.type = type;
        this.episode = episode;
    }

    public void init(String name, String type, int episode, String genre) {
        this.init(name, type, episode);
        this.genre = genre;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episode);
        System.out.println(this.genre);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getEpisode() {
        return episode;
    }
}
