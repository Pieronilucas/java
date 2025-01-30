package pieroni.lucas.orientacaoObjetos.Introducao.sobrecargametodos.test;

import pieroni.lucas.orientacaoObjetos.Introducao.sobrecargametodos.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.init("Devil May Cry", "TV", 12);
        anime.init("Devil May Cry", "TV", 12, "Action");
//        anime.setName("Devil May Cry");
//        anime.setType("TV");
//        anime.setEpisode(12);
        anime.print();
    }
}
