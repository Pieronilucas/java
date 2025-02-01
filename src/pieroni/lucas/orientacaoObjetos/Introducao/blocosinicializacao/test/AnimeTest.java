package pieroni.lucas.orientacaoObjetos.Introducao.blocosinicializacao.test;

import pieroni.lucas.orientacaoObjetos.Introducao.blocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Devil May Cry");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
                    }


    }

}
