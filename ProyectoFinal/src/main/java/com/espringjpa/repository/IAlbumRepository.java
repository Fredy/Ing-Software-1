package com.espringjpa.repository;

import com.espringjpa.domain.Album;

import java.util.Collection;

/**
 * Created by MathHellscream
 */
public interface IAlbumRepository {
    void save(Album album);
    Album get(long idNumber);
    Collection<Album> getAll();
    void remove(long idNumber);
    // TODO: add id's and db connection in Album Class

}
