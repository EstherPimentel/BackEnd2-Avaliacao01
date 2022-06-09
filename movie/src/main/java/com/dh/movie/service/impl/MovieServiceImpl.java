package com.dh.movie.service.impl;


import com.dh.movie.entity.Movie;
import com.dh.movie.repository.IMovieRepository;
import com.dh.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private IMovieRepository repository;

    @Override
    public void save(Movie movie) {
        repository.save(movie);

    }

    @Override
    public List<Movie> findByGenero(String genero) {
        return repository.findByGenero(genero);
    }
}
