package com.dh.movie.controller;

import com.dh.movie.entity.Movie;
import com.dh.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")

public class MovieController {

    @Autowired
    private IMovieService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Movie movie){
        service.save(movie);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/catalog/{genero}")
    public List<Movie> findByGenero(@PathVariable String genero){
        return service.findByGenero(genero);
    }
}
