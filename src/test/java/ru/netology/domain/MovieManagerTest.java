package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieItem first = new MovieItem(1,"Дюна","фантастика",10);
    MovieItem second = new MovieItem(2,"Вечные","фантастика",20);
    MovieItem third = new MovieItem(3,"Не время умирать","боевик",30);
    MovieItem fourth = new MovieItem(4,"Веном 2","фантастика",40);
    MovieItem fifth = new MovieItem(5,"Неисправимый Рон","Мультфильм",50);
    MovieItem sixth = new MovieItem(6,"Ряд 19","триллер",60);
    MovieItem seventh = new MovieItem(7,"Друг на продажу","комедия",70);
    MovieItem eighth = new MovieItem(8,"Семейка Аддамс","мультфильм",80);
    MovieItem ninth = new MovieItem(9,"Ледяной демон","ужасы",90);
    MovieItem tenth = new MovieItem(10,"Вкус жизни","драма",100);
    MovieItem eleven = new MovieItem(11, "Последняя дуэль", "история", 110);


    @Test
    void shouldReturn10Movies() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual,expected);
    }

    @Test
    void shouldReturn5Movies() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(actual,expected);
    }

    @Test
    void shouldReturn10MoviesWith11Given() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleven);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(actual,expected);
    }

    @Test
    void shouldReturn5OMoviesWith5Limited() {
        MovieManager manager = new MovieManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(actual,expected);
    }

    @Test
    void shouldReturn5MoviesWith10Given() {
        MovieManager manager = new MovieManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fifth, fourth, third, second, first};
        assertArrayEquals(actual,expected);
    }

    @Test
    void shouldReturn2MoviesWhit5Limited() {
        MovieManager manager = new MovieManager(5);
        manager.add(first);
        manager.add(second);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{second, first};
        assertArrayEquals(actual,expected);
    }
}