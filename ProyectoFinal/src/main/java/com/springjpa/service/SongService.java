package com.springjpa.service;

import com.springjpa.domain.Song;
import com.springjpa.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by jhoelccari on 15/06/17.
 */
@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public boolean isANewSong(String songName){
        if (songRepository.findByName(songName) == null)
            return true;
        return false;
    }

    public boolean existThisSong(Song s){
        if( songRepository.findById(s.getId()) != null)
            return true;
        return false;
    }

    public Song findById(Long id){
        return songRepository.findById(id);
    }

    public void save(Song song){
        songRepository.save(song);
    }

    public float getAverageRating(Song s){
        return songRepository.findAverageRating(s.getId());
    }

    public Collection<Song> showSongs(){
        return songRepository.findAll();
    }

    public Song findByName(String songName){
        return songRepository.findByName(songName);
    }

    public Collection<Song> top10BestRating(){
        Pageable page = new PageRequest(0,10);
        Collection<Song> result = songRepository.top10BestRating(page).getContent();//.setMaxResults(10).getResultList;
        return result;

    }

    public Collection<Song> top100MostPlayed() {
        Pageable page = new PageRequest(0,100);
        Collection<Song> result = songRepository.top100MostPlayed(page).getContent();
        return result;
    }
}
