package com.springjpa.repository;

import com.springjpa.domain.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.domain.Pageable;
import java.util.Collection;

public interface SongRepository extends CrudRepository<Song,Long>{

    @Query("SELECT a FROM Song a WHERE a.id = ?1")
    Song findById(long id);

    @Query("select a.avgRating from Song a ")
    float findAverageRating(long id);

    @Query("SELECT a FROM Song a WHERE a.name like ?1")
    Song findByName(String name);

    // select a.* from account a
    @Query("SELECT a FROM Song a where a.active=true")
    Collection<Song> findAll();

    @Query(value="SELECT a from Song a ORDER BY a.timesPlayed DESC")
    Page<Song> top100MostPlayed(Pageable pageable);


    @Query("SELECT a from Song a ORDER BY a.avgRating")
    Page<Song> top10BestRating(Pageable pageable);


}
