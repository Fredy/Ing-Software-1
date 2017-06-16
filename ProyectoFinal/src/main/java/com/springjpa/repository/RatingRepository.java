package com.springjpa.repository;

import com.springjpa.domain.Rating;
import com.springjpa.domain.Song;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface RatingRepository extends CrudRepository<Rating,Long> {
    //@Query("SELECT a FROM Song a ORDER BY ")
    //Collection<Song> top100();
    @Query("select a from Rating a")
    Collection<Rating> findAll();
}
