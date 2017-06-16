package com.springjpa.service;

import com.springjpa.domain.Rating;
import com.springjpa.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by jhoelccari on 16/06/17.
 */

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;

    public Collection<Rating> showAllRatings(){
        return ratingRepository.findAll();
    }
}
