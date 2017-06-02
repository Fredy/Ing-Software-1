package com.springjpa.repository;

/**
 * Created by MathHellscream
 */

import com.springjpa.domain.Album;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.springjpa.domain.Artist;

import java.util.Collection;

public interface ArtistRepository extends CrudRepository<Artist,Long> {
    @Query("SELECT a from Artist a where a.id=?1")
    Artist findOne(Long id);

    @Query("SELECT a from Artist a")
    Collection<Artist> findAll();

    @Query("UPDATE Artist a set a.active=TRUE")
    void activate();

    @Query("UPDATE Artist a set a.active=FALSE")
    void deactivate();

    @Query("SELECT b from Artist a inner join a.albums b where  a.id= ?1")
    Collection<Album> getAlbums(Long artistId);

}
