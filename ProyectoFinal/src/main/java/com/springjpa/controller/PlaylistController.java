package com.springjpa.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springjpa.domain.PlayList;
import com.springjpa.domain.Song;
import com.springjpa.service.PlaylistService;

@Controller
public class PlaylistController {
	
	@Autowired
	PlaylistService playlistService;
	
	@RequestMapping(value ="/playlists", method = RequestMethod.GET)
    @ResponseBody
    public Collection<PlayList> showPlaylists(){
        return playlistService.showPlaylists();
    }
	
	@RequestMapping(value ="/newPlaylist", method = RequestMethod.POST)
    @ResponseBody
    public void addPlaylist(PlayList playlist){
        playlistService.save(playlist);
    }
	
	@RequestMapping(value ="/getPlaylist", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Song> getPlaylist(@RequestParam Long id){
        return playlistService.getSongList(id);
    }

}
