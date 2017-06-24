package com.springjpa.service;

import com.springjpa.domain.Rating;
import com.springjpa.domain.Song;
import com.springjpa.domain.User;
import com.springjpa.repository.RatingRepository;
import org.hibernate.service.spi.ServiceException;
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
    @Autowired
    SongService songService;

    public void doRating(User u, Song s, int rate){
        //if ( ! songService.existThisSong(s) ) throw new ServiceException("No existe la cancion");
        //if ( ! userService.existThisUser(u) ) throw new ServiceException("No existe el usuario");
        Rating rating = new Rating(u,s,rate);
        ratingRepository.save(rating);
    }

    public Collection<Rating> showAllRatings(){
        return ratingRepository.findAll();
    }
}
