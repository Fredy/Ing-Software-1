package com.springjpa.repository;

import com.springjpa.domain.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface SongRepository extends CrudRepository<Song,Long>{

    @Query("SELECT a FROM Song a WHERE a.id = ?1")
    Song findById(long id);

    @Query("SELECT a FROM Song a WHERE a.name like ?1")
    Song findByName(String name);

    // select a.* from account a
    @Query("SELECT a FROM Song a where a.active=true")
    Collection<Song> findAll();

    /*
    * JPA dont suport operation LIMIT, for this reason when U try to call next funtions do:
    * Collection<Song> resultList= top100MostPlayed.setMaxResults(100).getResultList();
    * */
    @Query("SELECT a from Song a ORDER BY a.timesPlayed ")
    Collection<Song> top100MostPlayed();

    /*
    * Collection<Song> resultList= top10BestRating.setMaxResults(10).getResultList();
    * */
    @Query("SELECT a from Song a ORDER BY a.avgRating")
    Collection<Song> top10BestRating();

}
