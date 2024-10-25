package model;

public class Anime {
    private String title;
    private String genre;
    private int episodes;
    private double rating;

    public Anime(String title, String genre, int episodes, double rating) {
        this.title = title;
        this.genre = genre;
        this.episodes = episodes;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getEpisodes() {
        return episodes;
    }

    public double getRating() {
        return rating;
    }
}
