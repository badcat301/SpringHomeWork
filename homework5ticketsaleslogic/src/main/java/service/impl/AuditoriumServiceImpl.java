package service.impl;

import dao.InMemmoryDataBaseSimulator;
import pojo.Auditorium;
import service.AuditoriumService;

import java.util.List;
import java.util.Optional;

public class AuditoriumServiceImpl implements AuditoriumService {

    @Override
    public List<Auditorium> getAll() {
        return InMemmoryDataBaseSimulator.getAuditoriums();

    }

    @Override
    public Auditorium getByName(String name) {
        Optional<Auditorium> auditoriumOptional = InMemmoryDataBaseSimulator.getAuditoriums().stream().filter
                (n -> n.getName().equals(name)).findFirst();

        return auditoriumOptional.orElse(new Auditorium());
    }
}
