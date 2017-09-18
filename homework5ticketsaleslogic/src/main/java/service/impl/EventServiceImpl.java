package service.impl;

import dao.InMemmoryDataBaseSimulator;
import pojo.Event;
import service.EventService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
        return null;
    }

    @Override
    public List<Event> getNextEvents(LocalDateTime to) {
        return null;
    }

}
