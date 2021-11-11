package ru.netology.domain;

public class MovieRepo {
    private MovieItem[] items = new MovieItem[0];

    public void save(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }

    public void removeById(int id) {
        MovieItem[] tmp = new MovieItem[items.length - 1];
        int index = 0;
        for (MovieItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public MovieItem findById(int id) {
        MovieItem[] tmp = new MovieItem[1];
        for (MovieItem item : items) {
            if (item.getId() == id) {
                tmp[0] = item;
            }
        }
        return tmp[0];
    }

    public MovieItem[] removeAll() {
        MovieItem[] tmp = new MovieItem[items.length];
        return tmp;
    }
}
