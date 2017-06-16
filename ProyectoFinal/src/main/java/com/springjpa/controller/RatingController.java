package com.springjpa.controller;

import com.springjpa.domain.Rating;
import com.springjpa.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by jhoelccari on 16/06/17.
 */

@Controller
public class RatingController {
    @Autowired
    RatingService ratingService;

    @RequestMapping("/ratings")
    @ResponseBody
    public Collection<Rating> showAllRatings(){
        return ratingService.showAllRatings();
    }
}
