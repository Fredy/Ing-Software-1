package com.springjpa.repository;

import java.util.Collection;

import com.springjpa.domain.Artist;

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
