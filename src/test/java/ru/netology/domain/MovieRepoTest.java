package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieRepoTest {

    @Test
    void shouldSave() {
        MovieRepo repo = new MovieRepo();
        MovieItem first = new MovieItem(1, "Дюна", "фантастика", 10);
        repo.save(first);
        MovieItem[] actual = repo.findAll();
        MovieItem[] expected = new MovieItem[]{first};
        assertArrayEquals(actual, expected);
    }

    @Test
    void shouldRemoveById() {
        MovieRepo repo = new MovieRepo();
        MovieItem first = new MovieItem(1,"Дюна","фантастика",10);
        MovieItem second = new MovieItem(2,"Вечные","фантастика",20);
        repo.save(first);
        repo.save(second);
        repo.removeById(1);
        MovieItem[] actual = repo.findAll();
        MovieItem[] expected = new MovieItem[]{second};
        assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindById() {
        MovieRepo repo = new MovieRepo();
        MovieItem first = new MovieItem(1, "Дюна", "фантастика", 10);
        MovieItem second = new MovieItem(2, "Вечные", "фантастика", 20);
        repo.save(first);
        repo.save(second);
        MovieItem[] actual = new MovieItem[]{repo.findById(2)};
        MovieItem[] expected = new MovieItem[]{second};
        assertArrayEquals(actual, expected);

    }

    @Test
    void shouldRemoveAll() {
        MovieRepo repo = new MovieRepo();
        MovieItem first = new MovieItem(1, "Дюна", "фантастика", 10);
        MovieItem second = new MovieItem(2, "Вечные", "фантастика", 20);
        repo.save(first);
        repo.save(second);
        MovieItem[] actual = repo.removeAll();
        MovieItem[] expected = new MovieItem[actual.length];
        assertArrayEquals(actual, expected);
    }
}