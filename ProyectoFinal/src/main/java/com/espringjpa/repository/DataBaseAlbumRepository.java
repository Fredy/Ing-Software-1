package com.espringjpa.repository;

import com.espringjpa.domain.Album;
import com.espringjpa.domain.Artist;

import java.util.Collection;

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
