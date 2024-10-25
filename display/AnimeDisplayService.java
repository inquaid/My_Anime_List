package display;

import model.Anime;

import java.util.List;

public class AnimeDisplayService implements Displayable {

    @Override
    public void display(List<Anime> animeList) {
        for (Anime anime : animeList) {
            System.out.println("Title: " + anime.getTitle() +
                    ", Genre: " + anime.getGenre() +
                    ", Episodes: " + anime.getEpisodes() +
                    ", Rating: " + anime.getRating());
        }
    }
}
