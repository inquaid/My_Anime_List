package filter;

import model.Anime;

import java.util.List;
import java.util.stream.Collectors;

public class RatingFilter implements FilterStrategy {
    private double minRating;

    public RatingFilter(double minRating) {
        this.minRating = minRating;
    }

    @Override
    public List<Anime> filter(List<Anime> animeList) {
        return animeList.stream()
                .filter(anime -> anime.getRating() >= minRating)
                .collect(Collectors.toList());
    }
}
