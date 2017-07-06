package com.springjpa.controller;
import com.springjpa.domain.Timeline;
import com.springjpa.domain.Played;
import com.springjpa.domain.User;
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


    //TODO: solo en el Service
    @RequestMapping(value ="/insertTimeline", method = RequestMethod.POST)
    @ResponseBody
    public void addTimeline(Timeline timeline){
        timelineService.save(timeline);
    }


    @RequestMapping(value ="/timelines", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Timeline> showTimelines(){
        return timelineService.showTimelines();
    }

    /*@RequestMapping(value ="/showTimeline", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Played> showTimeline(@RequestParam Long idT){
        return timelineService.getSongsPlayed(idT);
    }
    */
    @RequestMapping(value ="/getSongs", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Played> getIdTimeline(@RequestParam Long userId){
        Long idTimeline = timelineService.getIdTimeline(userId);
        return timelineService.getSongsPlayed(idTimeline);}

}
