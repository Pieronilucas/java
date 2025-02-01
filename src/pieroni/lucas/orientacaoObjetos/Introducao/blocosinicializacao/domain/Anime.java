package pieroni.lucas.orientacaoObjetos.Introducao.blocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes ;

    {
        System.out.println("dentro do bloco de inicialização");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }
    public Anime(String name) {
        this.name = name;
        for (int ep : episodes) {
            System.out.print(ep + ", ");
    }
        System.out.println();

//    public Anime() {
//        episodes = new int[100];
//        for (int i = 0; i < episodes.length; i++) {
//            episodes[i] = i + 1;
//        }
//        for (int ep : episodes) {
//            System.out.print(ep + ", ");
//        }
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public String getName() {
        return name;
    }
}
