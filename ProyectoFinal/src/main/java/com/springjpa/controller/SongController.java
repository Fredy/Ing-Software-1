package com.springjpa.controller;

import com.springjpa.domain.Song;
import com.springjpa.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by jhoelccari on 15/06/17.
 */

@Controller
public class SongController {

    @Autowired
    SongService songService;

    @RequestMapping(value ="/insertSong", method = RequestMethod.POST)
    @ResponseBody
    public void addSong(Song song){
        songService.save(song);
    }

    @RequestMapping(value = "/songs", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Song> showSongs(){
        return songService.showSongs();
    }

    @RequestMapping(value = "/top10BestRated", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Song> top10BestRated(){
        return songService.top10BestRating();
    }

    @RequestMapping(value = "/top100MostPlayed", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Song> top100MostPlayed(){
        return songService.top100MostPlayed();
    }

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    @ResponseBody
    public Song findByName(String song){
        return songService.findByName(song);
    }
}
