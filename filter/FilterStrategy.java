package filter;

import model.Anime;

import java.util.List;

public interface FilterStrategy {
    List<Anime> filter(List<Anime> animeList);
}
