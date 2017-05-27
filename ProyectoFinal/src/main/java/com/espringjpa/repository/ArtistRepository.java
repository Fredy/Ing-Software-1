package com.espringjpa.repository;

import com.espringjpa.domain.Artist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MathHellscream
 */
public class ArtistRepository implements IArtistRepository {

    private Map<Long,Artist> artists = new HashMap<>();

    @Override
    public void save(Artist artist) {
        artists.put(artist.getId(),artist);
    }

    @Override
    public Artist get(long idNumber) {
        return artists.get(idNumber);
    }

    @Override
    public Collection<Artist> getAll() {
        return artists.values();
    }

    @Override
    public void remove(long idNumber) {
        artists.remove(idNumber);
    }
}
