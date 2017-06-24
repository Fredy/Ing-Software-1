package com.springjpa.service;

import com.springjpa.domain.Song;
import com.springjpa.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
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
        Collection<Song> result = songRepository.top10BestRating();//.setMaxResults(10).getResultList;
        return result;

    }

    public Collection<Song> top100MostPlayed() {
        songRepository.top100MostPlayed();//.setMaxResults(100).getResultList;
        return null;
    }
}
