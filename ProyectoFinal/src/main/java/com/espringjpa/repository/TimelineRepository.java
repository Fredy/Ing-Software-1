package com.espringjpa.repository;

import java.util.Collection;

import com.espringjpa.domain.Timeline;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface TimelineRepository extends CrudRepository<Timeline, Long>{
    @Query("SELECT a FROM Timeline a WHERE a.id = ?1")
    Timeline findOne(long id);

    // select a.* from account a
    @Query("SELECT a FROM Timeline a")
    Collection<Timeline> findAll();

}