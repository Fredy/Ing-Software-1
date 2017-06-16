package com.springjpa.controller;

import com.springjpa.domain.Played;
import com.springjpa.service.PlayedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by jhoelccari on 16/06/17.
 */

@Controller
public class PlayedController {
    @Autowired
    PlayedService playedService;

    @RequestMapping(value = "/playeds", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Played> showAllPlayed(){
        return playedService.findAll();
    }

}
