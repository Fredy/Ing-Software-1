package com.springjpa.repository;

/**
 * Created by MathHellscream
 */

import com.springjpa.domain.Artist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.springjpa.domain.Album;

import java.util.Collection;

public interface AlbumRepository extends CrudRepository<Album,Long>{

    @Query("select a from Album a where a.id = ?1")
    Album findOne(Long id);

    @Query("select a.id from Album a where a.name = ?1")
    Collection<Long> findByName(String name);

    @Query("select a.name from Album a where a.id = ?1")
    String findNamebyId(Long id);

    @Query("select a from Album a")
    Collection<Album> findAll();

    @Query("select a.name from Album a")
    Collection<String> findAllName();

    @Query("select a.id from Album a")
    Collection<Long> findAllId();

    @Query("update Album a set a.active=TRUE")
    void active();

    @Query("update Album a set a.active=FALSE")
    void deactive();

    @Query("select b from Album a INNER join a.artists b where a.id=?1")
    Collection<Artist> getArtists(Long AlbumId);

    @Query("select b.name from Album a INNER join a.artists b where a.id=?1")
    Collection<String> getArtistsName(Long AlbumId);

    @Query("select b.id from Album a INNER join a.artists b where a.id=?1")
    Collection<Long> getArtistsId(Long AlbumId);
}
