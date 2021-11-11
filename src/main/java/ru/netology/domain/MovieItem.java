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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }
}
