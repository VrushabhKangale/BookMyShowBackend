package com.bookmyshow.BookMyShow.service;

import com.bookmyshow.BookMyShow.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
}
