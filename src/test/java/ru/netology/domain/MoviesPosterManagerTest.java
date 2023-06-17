package ru.netology.domain;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoviesPosterManagerTest {

    @Test
    public void shouldFindAllMovies() {
        MoviesPosterManager manager = new MoviesPosterManager();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, manager.findAll());
    }
    @Test
    public void shouldAddMovieName() {
        MoviesPosterManager manager = new MoviesPosterManager();
        manager.add("MovieName1");
        String[] expected = { "MovieName1" };
        Assertions.assertArrayEquals(expected, manager.findAll());
    }
    @Test
    public void shouldAddFourMovieName() {
        MoviesPosterManager manager = new MoviesPosterManager();
        manager.add("MovieName1");
        manager.add("MovieName2");
        manager.add("MovieName3");
        manager.add("MovieName4");
        String[] expected = { "MovieName1", "MovieName2", "MovieName3", "MovieName4" };
        Assertions.assertArrayEquals(expected, manager.findAll());
    }
    @Test
    public void shouldReverseName() {
        MoviesPosterManager manager = new MoviesPosterManager();
        manager.add("MovieName1");
        manager.add("MovieName2");
        manager.add("MovieName3");
        manager.add("MovieName4");
        manager.add("MovieName5");
        String[] expected = { "MovieName5", "MovieName4", "MovieName3", "MovieName2", "MovieName1" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldReverseNameLowerLimit() {
        MoviesPosterManager manager = new MoviesPosterManager(3);
        manager.add("MovieName1");
        manager.add("MovieName2");
        manager.add("MovieName3");
        manager.add("MovieName4");
        manager.add("MovieName5");
        String[] expected = { "MovieName5", "MovieName4", "MovieName3" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
    @Test
    public void shouldReverseNameHigherLimit() {
        MoviesPosterManager manager = new MoviesPosterManager(7);
        manager.add("MovieName1");
        manager.add("MovieName2");
        manager.add("MovieName3");
        manager.add("MovieName4");
        manager.add("MovieName5");
        manager.add("MovieName6");
        String[] expected = { "MovieName6", "MovieName5", "MovieName4", "MovieName3", "MovieName2", "MovieName1" };
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

}