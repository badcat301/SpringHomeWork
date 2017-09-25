package com.green.dao;

import com.green.pojo.Auditorium;
import com.green.pojo.Event;
import com.green.pojo.User;

import java.util.*;

public class InMemmoryDataBaseSimulator {
    private static List<User> users = new ArrayList<User>();
    private static List<Event> events = new ArrayList<Event>();
    private static List<Auditorium> auditoriums = new ArrayList<>();

    public static List<User> getUsers() {
        return users;
    }

    public static List<Event> getEvents() {
        return events;
    }

    public static List<Auditorium> getAuditoriums() {
        return auditoriums;
    }
}
