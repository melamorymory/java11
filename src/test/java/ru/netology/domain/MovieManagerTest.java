package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class MovieManagerTest {
    @Mock
    private MovieRepo repository = Mockito.mock(MovieRepo.class);
    @InjectMocks
    private MovieManager manager;
    private MovieItem first = new MovieItem(1, "Дюна", "фантастика", 10);
    private MovieItem second = new MovieItem(2, "Вечные", "фантастика", 20);
    private MovieItem third = new MovieItem(3, "Не время умирать", "боевик", 30);

//    @Test
//    public void shouldAdd() {
//        MovieItem[] returned = {first};
//        doReturn(returned).when(repository).save(first);
//
//        manager.add(first);
//        MovieItem[] actual = manager.getAll();
//        MovieItem[] expected = new MovieItem[]{first};
//        assertArrayEquals(actual, expected);
//    }

    @Test
    public void shouldGetAll() {
        MovieItem[] returned = {first, second, third};
        doReturn(returned).when(repository).findAll();

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{third, second, first};
        assertArrayEquals(actual, expected);
    }

//    @Test
//    public void shouldRemoveById() {
//        MovieItem[] returned = {first, third};
//        doReturn(returned).when(repository).removeById(2);
//
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.removeById(2);
//        MovieItem[] actual = manager.getAll();
//        MovieItem[] expected = new MovieItem[]{third, first};
//    }
}