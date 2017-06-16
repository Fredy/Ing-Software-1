package com.springjpa.controller;

import com.springjpa.service.PlayedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jhoelccari on 16/06/17.
 */

@Controller
public class PlayedController {
    @Autowired
    PlayedService playedService;

}
