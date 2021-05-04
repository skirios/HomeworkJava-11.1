package ru.netology.manager;


import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieMangerTest {
    private MovieManager manager = new MovieManager();
    private Movie first = new Movie(1, "фильм", "url", 11 * 12 * 2020, "фантастика");
    private Movie second = new Movie(2, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie third = new Movie(3, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie fourth = new Movie(4, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie fifth = new Movie(5, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie sixth = new Movie(6, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie seventh = new Movie(7, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie eighth = new Movie(8, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie ninth = new Movie(9, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie tenth = new Movie(10, "фильм", "url", 10 * 12 * 2020, "фантастика");
    private Movie eleventh = new Movie(11, "фильм", "url", 10 * 12 * 2020, "фантастика");


    @Test
    void shouldAddMovie() {
        Movie[] expected = new Movie[]{first};
        manager.add(first);

        assertArrayEquals(expected, manager.getAll());
    }

    @Test
    void shouldShowMoviesToTDefault() {
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
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

        assertArrayEquals(expected, manager.getAll());
    }

    @Test
    void shouldShowIfMoviesMoreThanDefault() {
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
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
        manager.add(eleventh);

        assertArrayEquals(expected, manager.getAll());
    }

    @Test
    void shouldReturnZeroMovies() {
        MovieManager manager = new MovieManager(0);
        Movie[] expected = new Movie[0];
        manager.add(first);
        manager.add(second);

        assertArrayEquals(expected, manager.getAll());
    }

    @Test
    void shouldShowMoviesInConstructor() {
        MovieManager manager = new MovieManager(4);
        Movie[] expected = new Movie[]{fourth, third, second, first};
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        assertArrayEquals(expected, manager.getAll());
    }


}