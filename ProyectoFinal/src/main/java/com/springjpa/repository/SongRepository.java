package com.springjpa.repository;

import com.springjpa.domain.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface SongRepository extends CrudRepository<Song,Long>{
    @Query("SELECT a FROM Song a WHERE a.name = ?1")
    Song findByName(String name);

    // select a.* from account a
    @Query("SELECT a FROM Song a")
    Collection<Song> findAll();
}
