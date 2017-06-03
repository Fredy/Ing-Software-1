package com.springjpa.repository;

import java.util.Collection;

import com.springjpa.domain.Played;
import com.springjpa.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springjpa.domain.Timeline;


public interface TimelineRepository extends CrudRepository<Timeline, Long>{
    @Query("SELECT a FROM Timeline a WHERE a.id = ?1")
    Timeline findOne(long id);

    // select a.* from account a
    @Query("SELECT a FROM Timeline a")
    Collection<Timeline> findAll();

    @Query("SELECT b from Timeline a inner join a.songsPlayed b where  a.id= ?1")
    Collection<Played>  getSongsPlayed(Long timelineId);

}