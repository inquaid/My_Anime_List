package service;

import model.Anime;
import repository.AnimeRepository;
import filter.FilterStrategy;
import display.Displayable;

import java.util.List;

public class AnimeService {
    private AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public void addAnime(Anime anime) {
        animeRepository.addAnime(anime);
    }

    public void removeAnime(Anime anime) {
        animeRepository.removeAnime(anime);
    }

    public List<Anime> filterAnime(FilterStrategy filter) {
        return filter.filter(animeRepository.listAllAnime());
    }

    public void displayAnime(Displayable displayService) {
        displayService.display(animeRepository.listAllAnime());
    }

}
