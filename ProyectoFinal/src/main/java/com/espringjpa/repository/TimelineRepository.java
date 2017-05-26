package com.espringjpa.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.espringjpa.domain.User;
import com.espringjpa.domain.Timeline;
import org.springframework.stereotype.Component;



//@Component
public class TimelineRepository implements ITimelineRepository{

    Map<String, Timeline > Timelines = new HashMap<>();


    @Override
    public void save(Timeline timeline){
        Timelines.put(timeline.getOwner(), timeline);
    }
    @Override
    public Timeline get(User owner) {
        return Timelines.get(owner);
    }

    @Override
    public Collection<Timeline> getAll() {
        return Timelines.values();
    }
    @Override
    public void remove(User owner) {
        Timelines.remove(owner);
    }

}