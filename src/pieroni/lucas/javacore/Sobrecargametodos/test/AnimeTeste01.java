package pieroni.lucas.javacore.Sobrecargametodos.test;

import pieroni.lucas.javacore.Sobrecargametodos.domain.Anime;

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
