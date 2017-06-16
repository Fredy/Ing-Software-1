package com.springjpa.controller;

import com.springjpa.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by alfred on 6/16/17.
 */

@Controller
public class ArtistController {
    @Autowired
    private ArtistService artistService;
}
