package com.springjpa.service;

import com.springjpa.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jhoelccari on 15/06/17.
 */
@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    Boolean findSong(String nameSong){
        if (songRepository.findByName(nameSong) == null)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
