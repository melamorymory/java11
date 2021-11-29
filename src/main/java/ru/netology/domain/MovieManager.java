package ru.netology.domain;

public class MovieManager {
    private int length;
    private MovieItem[] items = new MovieItem[0];

    public MovieManager(int length) {
        this.length = length;
    }

    public MovieManager() {
    }

    public void add(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
        int resultLength;
        if (length == 0) {
            resultLength = 10;
        } else {
            resultLength = length;
        }
        if (resultLength > items.length) {
            MovieItem[] result = new MovieItem[items.length];
            for (int i = 0; i < items.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            MovieItem[] result = new MovieItem[resultLength];
            for (int i = 0; i < resultLength; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}
