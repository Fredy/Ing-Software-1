package com.springjpa.service;

import com.springjpa.domain.Album;
import com.springjpa.domain.Artist;
import com.springjpa.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by alfred on 6/16/17.
 */
@Service
public class AlbumService {
    @Autowired
    AlbumRepository albumRepository;

    public void save(Album album){
        albumRepository.save(album);
    }

    public Collection<Album> showAllAlbum(){
        return albumRepository.findAll();
    }
    public Collection<String> showAllAlbumName(){
        return albumRepository.findAllName();
    }
    public Collection<Long> showAllAlbumId(){
        return albumRepository.findAllId();
    }

    public Album findAlbumById(Long id){
        return albumRepository.findOne(id);
    }
    public String findAlbumNameById(Long id){
        return albumRepository.findNamebyId(id);
    }
    public Collection<Long> findAlbumIdByName(String name){
        return albumRepository.findByName(name);
    }

    public Collection<Artist> getArtistsOfAlbum(Long id){
        return albumRepository.getArtists(id);
    }
    public Collection<Long> getArtistsIdOfAlbum(Long id){
        return albumRepository.getArtistsId(id);
    }
    public Collection<String> getArtistsNameofAlbum(Long id){
        return albumRepository.getArtistsName(id);
    }
}
