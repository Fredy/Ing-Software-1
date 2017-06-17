package com.springjpa.controller;
import com.springjpa.domain.Timeline;
import com.springjpa.domain.Played;
import com.springjpa.service.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * Created by Maria on 16/06/2017.
 */
@Controller
public class TimelineController {

    @Autowired
    TimelineService timelineService;

    @RequestMapping(value ="/timelines", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Timeline> showTimelines(){
        return timelineService.showTimelines();
    }

    @RequestMapping(value ="/getTimeline", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Played> showTimeline(@RequestParam Long idT){
        return timelineService.getSongsPlayed(idT);
    }

}
