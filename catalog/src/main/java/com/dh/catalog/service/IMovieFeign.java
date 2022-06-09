package com.dh.catalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MOVIE")
public interface IMovieFeign {
    @RequestMapping(method = RequestMethod.GET, value = "movie/catalog/{genero}")
    List<Object> findByGenero(@PathVariable String genero);
}
