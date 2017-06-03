package com.springjpa.repository;

import java.util.Collection;

import com.springjpa.domain.Album;
import com.springjpa.domain.Artist;

/**
 * Created by MathHellscream
 */
public class DataBaseAlbumRepository implements IAlbumRepository {
    @Override
    public void save(Album album) {
        //INSERT OR UPDATE
    }

    @Override
    public Album get(long idNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Album> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove(long idNumber) {
        // TODO Auto-generated method stub
    }
}
