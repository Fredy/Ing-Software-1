package com.springjpa.repository;

import com.springjpa.domain.Played;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PlayedRepository extends CrudRepository<Played,Long>{

    @Query("SELECT a FROM Played a")
    Collection<Played> findAll();
}
