package ru.netology.domain;

public class MovieManager {
    private MovieRepo repository;

    public MovieManager(MovieRepo repository) {
        this.repository = repository;
    }

    public void add(MovieItem item) {
        repository.save(item);
    }

    public MovieItem[] getAll() {
        MovieItem[] items = repository.findAll();
        MovieItem[] result = new MovieItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }


}
