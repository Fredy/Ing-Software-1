package com.espringjpa.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;
import com.espringjpa.domain.Timeline;
import com.espringjpa.domain.User;

@Component
public class DataBaseTimelineRepository implements ITimelineRepository {
    // abrir connection a BD


    @Override
    public void save(Timeline timeline) {
        // INSERT o UPDATE
    }

    @Override
    public Timeline get(User owner) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Timeline> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove(User owner) {
        // TODO Auto-generated method stub
    }
}
