package com.springjpa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.domain.PlayList;
import com.springjpa.domain.Song;
import com.springjpa.domain.User;
import com.springjpa.repository.PlayListRepository;

@Service
public class PlaylistService {
	@Autowired
    PlayListRepository playlistRepository;
	
	public void save(PlayList playlist){
        playlistRepository.save(playlist);
    }
	
	public Collection<PlayList> showPlaylists(){
        return playlistRepository.findAll();
    }

    //TODO: recuerdar que hace
	public PlayList findById(long id){
        return playlistRepository.findOne(id);
    }
	
	public Collection<Song> getSongList(long playlistId){
		return playlistRepository.getSongList(playlistId);
	}
	
	public Collection<User> getFollowers(long playlistId){
		return playlistRepository.getFollowers(playlistId);
	}
	
	public Collection<PlayList> getPlaylistOfUser(long UserId){
		return playlistRepository.findByUser(UserId);
	}
	
}
