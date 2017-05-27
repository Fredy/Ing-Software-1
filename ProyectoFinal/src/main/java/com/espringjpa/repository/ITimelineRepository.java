package com.espringjpa.repository;
import java.util.Collection;

import com.espringjpa.domain.Timeline;
import com.espringjpa.domain.User;

public interface ITimelineRepository {

    void save(Timeline  timeline);

    Timeline get(User owner); // owner o id?

    Collection<Timeline> getAll();

    void remove(User owner);// owner o id?

}