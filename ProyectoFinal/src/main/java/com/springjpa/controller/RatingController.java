package com.springjpa.controller;

import com.springjpa.domain.Rating;
import com.springjpa.domain.Song;
import com.springjpa.domain.User;
import com.springjpa.service.RatingService;
import com.springjpa.service.SongService;
import com.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by jhoelccari on 16/06/17.
 */

@Controller
public class RatingController {
    @Autowired
    RatingService ratingService;
    @Autowired
    UserService userService;
    @Autowired
    SongService songService;

    @RequestMapping(value = "/ratings", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Rating> showAllRatings(){
        return ratingService.showAllRatings();
    }

    @RequestMapping(value="/doRating")
    public void doRating(@RequestParam long userId, @RequestParam long songId, @RequestParam int rating){
        User user = userService.showUser(userId);
        Song song = songService.findById(songId);
        //if ( user == null || song == null ) throw new RuntimeException(); //
        ratingService.doRating(user,song,rating);
    }
}
