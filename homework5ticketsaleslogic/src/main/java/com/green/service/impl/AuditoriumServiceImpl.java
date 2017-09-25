package com.green.service.impl;

import com.green.dao.InMemmoryDataBaseSimulator;
import org.springframework.stereotype.Service;
import com.green.pojo.Auditorium;
import com.green.service.AuditoriumService;

import java.util.List;
import java.util.Optional;

@Service
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
