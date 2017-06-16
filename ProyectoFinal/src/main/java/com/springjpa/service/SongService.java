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

    public Boolean findSong(String nameSong){
        if (songRepository.findByName(nameSong) != null)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }

    public void save(Song song){
        songRepository.save(song);
    }

    public Collection<Song> showSongs(){
        return songRepository.findAll();
    }

}
