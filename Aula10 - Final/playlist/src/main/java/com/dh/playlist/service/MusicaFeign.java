package com.dh.playlist.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "MUSICA")
public interface MusicaFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/musica/{genero}")
    String findMusica(@PathVariable String genero);
}
