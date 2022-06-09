package com.dh.catalog.controller;

import com.dh.catalog.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private ICatalogService service;

    @GetMapping("/{genero}")
    public List<Object> findByGenero(@PathVariable String genero){
        return service.getByGenero(genero);
    }
}
