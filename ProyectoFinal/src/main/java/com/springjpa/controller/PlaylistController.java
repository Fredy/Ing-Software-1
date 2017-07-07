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
import com.springjpa.domain.User;
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

    //TODO: solo en el Service
	@RequestMapping(value ="/newPlaylist", method = RequestMethod.POST)
    @ResponseBody
    public void addPlaylist(PlayList playlist){
        playlistService.save(playlist);
    }

    //Muestra todas las playlist del usuario
	@RequestMapping(value="/playlistOf", method = RequestMethod.GET)
	@ResponseBody
	public Collection<PlayList> playlistOf(@RequestParam long id){
		return playlistService.getPlaylistOfUser(id);
	}
	
	//Muestra todas las canciones de la playlist
	@RequestMapping(value ="/getPlaylist", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Song> getPlaylist(@RequestParam long id){
        return playlistService.getSongList(id);
    }

	//Muestra todos los seguidores de la playlist	
	@RequestMapping(value ="/getFollowersPlaylist", method = RequestMethod.GET)
    @ResponseBody
	public Collection<User> getFollowers(long playlistId){
		return playlistService.getFollowers( playlistId );
	}
}
