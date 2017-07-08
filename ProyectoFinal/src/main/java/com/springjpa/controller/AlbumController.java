package com.springjpa.controller;

import com.springjpa.domain.Album;
import com.springjpa.domain.Artist;
import com.springjpa.domain.Song;
import com.springjpa.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by alfred on 6/16/17.
 */
@Controller
public class AlbumController {
    @Autowired
    private AlbumService albumService;

   @RequestMapping("/getArtistsOfAlbum")
   @ResponseBody
    Collection<String> getArtistofAlbum(@RequestParam Long id){
       return albumService.getArtistsNameofAlbum(id);
   }

   @RequestMapping("/getSongsOfAlbum")
   @ResponseBody
   Collection<Song> getSongsOfAlbum(@RequestParam Long id){
        return albumService.getSongsofAlbum(id);
   }

   @RequestMapping("/ObjAlbum")
   @ResponseBody
   Album albumes(@RequestParam Long id) {
       return albumService.findAlbumById(id);
   }
}
