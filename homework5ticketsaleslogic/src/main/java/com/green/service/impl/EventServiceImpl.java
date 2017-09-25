package com.green.service.impl;

import com.green.dao.InMemmoryDataBaseSimulator;
import org.springframework.stereotype.Service;
import com.green.pojo.Event;
import com.green.service.EventService;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {


    @Override
    public void save(Event event) {
        InMemmoryDataBaseSimulator.getEvents().add(event);

    }

    @Override
    public void remove(Event event) {
        InMemmoryDataBaseSimulator.getEvents().remove(event);

    }

    @Override
    public Event getById(int id) {
        Optional<Event> eventOptional = InMemmoryDataBaseSimulator.getEvents().stream()
                .filter(e -> e.getId() == id)
                .findFirst();
        return eventOptional.orElse(new Event());
    }

    @Override
    public Event getUserByName(String name) {

        Optional<Event> eventOptional = InMemmoryDataBaseSimulator.getEvents().stream()
                .filter(n -> n.getName().equals(name))
                .findFirst();
        return eventOptional.orElse(new Event());

    }

    @Override
    public List<Event> getAll(Event event) {

        return InMemmoryDataBaseSimulator.getEvents();
    }

    @Override
    public List<Event> getForDateRange(LocalDateTime from, LocalDateTime to) {

        return InMemmoryDataBaseSimulator.getEvents().stream().filter(event ->
        {
            final long days = from.until(to, ChronoUnit.DAYS);
            long start = from.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long end = to.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

            long current = event.getLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
            return current >= start && current <= end;

        }).collect(Collectors.toList());

    }

    @Override
    public List<Event> getNextEvents(LocalDateTime to) {

        return InMemmoryDataBaseSimulator.getEvents().stream().filter(event -> {
            long now = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long end = to.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

            long current = event.getLocalDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
            return current >= now && current <= end;

        }).collect(Collectors.toList());

    }

}
