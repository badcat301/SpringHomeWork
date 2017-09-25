package com.green.service;

import com.green.pojo.Event;

import java.time.LocalDateTime;
import java.util.List;

public interface EventService {

    void save(Event event);

    void remove(Event event);

    Event getById(int id);

    Event getUserByName(String name);

    List<Event> getAll(Event event);

    List<Event> getForDateRange(LocalDateTime from, LocalDateTime to);

    List<Event> getNextEvents(LocalDateTime to);

}
