package pieroni.lucas.javacore.blocosinicializacao.test;

import pieroni.lucas.javacore.blocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Devil May Cry");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
                    }


    }

}
