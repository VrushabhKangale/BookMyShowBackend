package com.bookmyshow.BookMyShow.serviceImpl;

import com.bookmyshow.BookMyShow.model.Movie;
import com.bookmyshow.BookMyShow.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Override
    public List<Movie> getAllMovies() {
        return List.of(
                new Movie(1L, "Interstellar", "Sci-Fi", "English", 169),
                new Movie(2L, "Inception", "Sci-Fi", "English", 148),
                new Movie(3L, "3 Idiots", "Comedy-Drama", "Hindi", 170)
        );
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {
        return getAllMovies().stream()
                .filter(movie -> movie.getId() == id)
                .findFirst();
    }
}
