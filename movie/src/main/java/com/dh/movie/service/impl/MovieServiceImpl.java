package com.dh.movie.service;

import com.dh.movie.entity.Movie;
import com.dh.movie.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService{

    @Autowired
    private IMovieRepository repository;

    @Override
    public void save(Movie movie) {
        repository.save(movie);
    }

    @Override
    public List<Movie> findMovie(String genero) {
        return repository.findMovie(genero);
    }

}
