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

    //Muestra todos los timeline de la bd
    @RequestMapping(value ="/timelines", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Timeline> showTimelines(){
        return timelineService.showTimelines();
    }

    //Muestra el conjunto de canciones que componen al Timeline
    @RequestMapping(value ="/getSongs", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Played> getIdTimeline(@RequestParam Long userId){
        Long idTimeline = timelineService.getIdTimeline(userId);
        return timelineService.getSongsPlayed(idTimeline);}
}
