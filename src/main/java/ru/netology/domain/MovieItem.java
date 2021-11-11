package ru.netology.domain;

public class MovieItem {
    private int id;
    private String movieName;
    private String movieGenre;
    private int posterId;


    public MovieItem(int id, String movieName, String movieGenre, int posterId) {
        this.id = id;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.posterId = posterId;
    }
}
