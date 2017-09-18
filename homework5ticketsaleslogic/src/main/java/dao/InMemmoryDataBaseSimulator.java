package dao;

import pojo.Auditorium;
import pojo.Event;
import pojo.User;

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
