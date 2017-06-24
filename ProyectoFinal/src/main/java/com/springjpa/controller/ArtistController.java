package com.springjpa.controller;

import com.springjpa.domain.Album;
import com.springjpa.domain.Artist;
import com.springjpa.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by alfred on 6/16/17.
 */

@Controller
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @RequestMapping("/Artist")
    @ResponseBody
    String getArtistName(@RequestParam Long id) {
        return artistService.findArtistNameById(id);
    }

    @RequestMapping("/AlbumsOfArtist")
    @ResponseBody
    Collection<Album> getAlbumsOfArtist(@RequestParam Long id) {
        return artistService.getAlbumsOfArtist(id);
    }

    @RequestMapping("/ObjArtist")
    @ResponseBody
    Artist getArtist(@RequestParam Long id){
        return artistService.findArtistById(id);
    }
}
