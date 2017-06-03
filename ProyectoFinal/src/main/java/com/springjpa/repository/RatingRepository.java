package com.springjpa.repository;

import com.springjpa.domain.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating,Long> {

}
