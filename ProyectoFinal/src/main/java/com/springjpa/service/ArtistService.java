package com.springjpa.service;

import com.springjpa.domain.Album;
import com.springjpa.domain.Artist;
import com.springjpa.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by alfred on 6/16/17.
 */
@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public void save(Artist artist){
        artistRepository.save(artist);
    }

    public Collection<Artist> showAllArtist(){
        return artistRepository.findAll();
    }
    public Collection<String> showAllArtistName(){
        return artistRepository.findAllNames();
    }
    public Collection<Long> showAllArtistId(){
        return artistRepository.findAllId();
    }

    public Artist findArtistById(Long id){
        return artistRepository.findOne(id);
    }
    public String findArtistNameById(Long id){
        return artistRepository.findNameById(id);
    }
    public Collection<Long> findArtistIdByName(String name){
        return artistRepository.findbyName(name);
    }

    public Collection<Album> getAlbumsOfArtist(Long id){
        return artistRepository.getAlbums(id);
    }
    public Collection<Long> getAlbumsIdOfArtist(Long id){
        return artistRepository.getAlbumsId(id);
    }
    public Collection<String> getAlbumsNameofArtist(Long id){
        return artistRepository.getAlbumsName(id);
    }
}
