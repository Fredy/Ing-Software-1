package com.springjpa.repository;

/**
 * Created by MathHellscream
 */

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.springjpa.domain.Artist;

import java.util.Collection;

public interface ArtistRepository extends CrudRepository<Artist,Long> {
    @Query("SELECT a from Artist a where a.id=?1")
    Artist findOne(Long id);

    @Query("SELECT a from Artist a")
    Collection<Artist> findAll();
}
