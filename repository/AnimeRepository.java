package repository;

import model.Anime;

import java.util.ArrayList;
import java.util.List;

public class AnimeRepository {
    private List<Anime> animeList = new ArrayList<>();

    public void addAnime(Anime anime) {
        animeList.add(anime);
    }

    public void removeAnime(Anime anime) {
        animeList.remove(anime);
    }

    public Anime findAnimeByTitle(String title) {
        return animeList.stream()
                .filter(anime -> anime.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }

    public List<Anime> listAllAnime(){
        return new ArrayList<>(animeList);
    }

}
