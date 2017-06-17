package com.springjpa.service;

import com.springjpa.domain.Played;
import com.springjpa.domain.Timeline;
import com.springjpa.domain.User;
import com.springjpa.repository.TimelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Maria on 16/06/2017.
 */
@Service
public class TimelineService {
    @Autowired
    TimelineRepository timelineRepository;

    public void save(Timeline timeline){
        timelineRepository.save(timeline);
    }

    public Collection<Timeline> showTimelines(){
        return timelineRepository.findAll();
    }

    public Timeline findById(long idT){
        return timelineRepository.findOne(idT);
    }

    public Collection<Played> getSongsPlayed(Long timelineId){return timelineRepository.getSongsPlayed(timelineId);}

    public Long getIdTimeline(Long userId){return timelineRepository.getIdTimeline(userId);}
}





