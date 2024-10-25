package filter;

import model.Anime;

import java.util.List;
import java.util.stream.Collectors;

public class GenreFilter implements FilterStrategy {
    private String genre;

    public GenreFilter(String genre) {
        this.genre = genre;
    }

    @Override
    public List<Anime> filter(List<Anime> animeList) {
        return animeList.stream()
                .filter(anime -> anime.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }
}
