package pieroni.lucas.javacore.construtores.test;

import pieroni.lucas.javacore.construtores.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Devil May Cry", "TV", 12, "Action");
        Anime anime2 = new Anime("One Piece", "TV", 1122, "Action", "Tomorrow Studios");
        Anime anime3 = new Anime()  ;
//        anime.init("Devil May Cry", "TV", 12);
//        anime.init("Devil May Cry", "TV", 12, "Action");
//        anime.setName("Devil May Cry");
//        anime.setType("TV");
//        anime.setEpisode(12);
        anime.print();
        System.out.println("--------------");
        anime3.print();
    }
}
