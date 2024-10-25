import model.Anime;
import repository.AnimeRepository;
import service.AnimeService;
import filter.GenreFilter;
import filter.RatingFilter;
import display.AnimeDisplayService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimeRepository animeRepository = new AnimeRepository();
        AnimeService animeService = new AnimeService(animeRepository);
        AnimeDisplayService displayService = new AnimeDisplayService();

        Anime anime1 = new Anime("Attack on Titan", "Action", 75, 9.0);
        Anime anime2 = new Anime("One Piece", "Adventure", 1256, 8.5);
        Anime anime3 = new Anime("Naruto", "Action", 220, 8.3);
        Anime anime4 = new Anime("Death Note", "Thriller", 37, 9.5);

        animeService.addAnime(anime1);
        animeService.addAnime(anime2);
        animeService.addAnime(anime3);
        animeService.addAnime(anime4);

        System.out.println("All Anime:");
        animeService.displayAnime(displayService);

        System.out.println("\nFiltered by Genre (Action):");
        GenreFilter genreFilter = new GenreFilter("Action");
        List<Anime> actionAnime = animeService.filetAnime(genreFilter);
        displayService.display(actionAnime);

        System.out.println("\nFiltered by Rating (>= 9.0):");
        RatingFilter ratingFilter = new RatingFilter(9.0);
        List<Anime> highRatedAnime = animeService.filetAnime(ratingFilter);
        displayService.display(highRatedAnime);
    }
}
