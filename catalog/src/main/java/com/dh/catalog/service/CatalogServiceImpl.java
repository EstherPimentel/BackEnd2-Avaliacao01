package com.dh.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements ICatalogService{
    @Autowired
    private IMovieFeign movie;

    @Override
    public List<Object> getByGenero(String genero){
        return movie.findByGenero(genero);
    }
}
