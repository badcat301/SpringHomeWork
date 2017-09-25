package com.green.service;

import com.green.pojo.Auditorium;

import java.util.List;

public interface AuditoriumService {

    public List<Auditorium> getAll();

   public Auditorium getByName(String name);

}
