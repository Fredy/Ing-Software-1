package com.espringjpa.repository;

import com.espringjpa.domain.Artist;

import java.util.Collection;

/**
 * Created by MathHellscream
 */
public interface IArtistRepository {
    void save(Artist artist);
    Artist get(long idNumber);
    Collection<Artist> getAll();
    void remove(long idNumber);
    //TODO: add id's and db connection in Artist Class
}
