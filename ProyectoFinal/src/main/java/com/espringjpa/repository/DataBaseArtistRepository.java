package com.espringjpa.repository;

import com.espringjpa.domain.Artist;

import java.util.Collection;

/**
 * Created by MathHellscream
 */
public class DataBaseArtistRepository implements IArtistRepository {

    @Override
    public void save(Artist artist) {
        //INSERT OR UPDATE
    }

    @Override
    public Artist get(long idNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Artist> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove(long idNumber) {
        // TODO Auto-generated method stub
    }
}
