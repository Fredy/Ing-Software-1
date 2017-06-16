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

    @Query("SELECT a.name from Artist a where a.id=?1")
    Collection<String> findNameById(Long id1);

    @Query("SELECT a.id from Artist a where a.name=?1")
    Collection<Long> findbyName(String name);

    @Query("SELECT a from Artist a")
    Collection<Artist> findAll();

    @Query("SELECT a.id from Artist a")
    Collection<Long> findAllId();

    @Query("SELECT a.name from Artist a")
    Collection<String> findAllNames();

    @Query("UPDATE Artist a set a.active=TRUE")
    void activate();

    @Query("UPDATE Artist a set a.active=FALSE")
    void deactivate();

    @Query("SELECT b from Artist a inner join a.albums b where  a.id= ?1")
    Collection<Album> getAlbums(Long artistId);

    @Query("SELECT b.id from Artist a inner join a.albums b where  a.id= ?1")
    Collection<Long> getAlbumsId(Long artistId);

    @Query("SELECT b.name from Artist a inner join a.albums b where  a.id= ?1")
    Collection<String> getAlbumsName(Long artistId);
}
