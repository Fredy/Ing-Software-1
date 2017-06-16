package com.springjpa.service;

import com.springjpa.domain.Played;
import com.springjpa.repository.PlayedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by jhoelccari on 16/06/17.
 */

@Service
public class PlayedService {
    @Autowired
    PlayedRepository playedRepository;

    public Collection<Played> findAll(){
        return playedRepository.findAll();
    }

}
