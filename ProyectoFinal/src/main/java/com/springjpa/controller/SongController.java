package com.springjpa.controller;

import com.springjpa.domain.Song;
import com.springjpa.repository.SongRepository;
import com.springjpa.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
