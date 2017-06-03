package com.espringjpa.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.espringjpa.domain.PlayList;

//@Component
public interface PlayListRepository extends CrudRepository<PlayList, Long>{
	
    @Query("SELECT a FROM PlayList a WHERE a.id = ?1")
    PlayList findOne(long id);

    // select a.* from account a
    @Query("SELECT a FROM PlayList a")
    Collection<PlayList> findAll();
}