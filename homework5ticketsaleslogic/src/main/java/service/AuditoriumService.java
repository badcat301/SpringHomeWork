package service;

import pojo.Auditorium;

import java.util.List;

public interface AuditoriumService {

    public List<Auditorium> getAll();

   public Auditorium getByName(String name);

}
