package com.springjpa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.springjpa.domain.PlayList;
import com.springjpa.domain.Song;
import com.springjpa.domain.User;
import com.springjpa.repository.PlayListRepository;

public class PlaylistService {
	@Autowired
    PlayListRepository playlistRepository;
	
	public void save(PlayList playlist){
        playlistRepository.save(playlist);
    }
	
	public Collection<PlayList> showPlaylists(){
        return playlistRepository.findAll();
    }
	
	public PlayList findById(long id){
        return playlistRepository.findOne(id);
    }
	
	public Collection<Song> getSongList(long playlistId){
		return playlistRepository.getSongList(playlistId);
	}
	
	public Collection<User> getFollowers(long playlistId){
		return playlistRepository.getFollowers(playlistId);
	}
}
