package com.springjpa.service;

import com.springjpa.domain.Song;
import com.springjpa.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by jhoelccari on 15/06/17.
 */
@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public Boolean isANewSong(String songName){
        if (songRepository.findByName(songName) == null)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }

    public void save(Song song){
        songRepository.save(song);
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
        Collection<Song> result = songRepository.top100MostPlayed();//.setMaxResults(100).getResultList;
        return result;
    }
}
