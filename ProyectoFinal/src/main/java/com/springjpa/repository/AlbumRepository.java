package com.springjpa.repository;

/**
 * Created by MathHellscream
 */

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.springjpa.domain.Album;

import java.util.Collection;

public interface AlbumRepository extends CrudRepository<Album,Long>{
    @Query("select a from Album a where a.id = ?1")
    Album findOne(Long id);

    @Query("select a from Album a")
    Collection<Album> findAll();
}
