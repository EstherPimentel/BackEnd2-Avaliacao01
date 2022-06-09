package com.dh.catalog.service;

import org.springframework.stereotype.Service;

import java.util.List;

public interface ICatalogService {
    List<Object> getByGenero(String genero);


}
