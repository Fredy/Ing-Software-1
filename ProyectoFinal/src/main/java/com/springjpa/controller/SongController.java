package com.springjpa.controller;

import com.springjpa.domain.Song;
import com.springjpa.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created by jhoelccari on 15/06/17.
 */

@Controller
public class SongController {

    @Autowired
    SongService songService;

    @RequestMapping("/songs")
    Collection<Song> showSongs(){
        return songService.showSongs();
    }

    @RequestMapping("top10BestRated")
    Collection<Song> top10BestRated(){
        return songService.top10BestRating();
    }

    @RequestMapping("top100MostPlayed")
    Collection<Song> top100MostPlayed(){
        return songService.top100MostPlayed();
    }

    @RequestMapping("findByName")
    Song findByName(String song){
        return songService.findByName(song);
    }

}
