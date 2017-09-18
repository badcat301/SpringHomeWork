package service.impl;

import pojo.Event;
import pojo.User;
import service.BookingService;

import java.time.LocalDate;
import java.util.List;

public class BookingServiceImlp implements BookingService {

    @Override
    public int getTicketsPrice(Event event, LocalDate date, User user, int seats) {
        return 0;
    }

    @Override
    public String bookTicket(Event event, LocalDate date, User user, int seats) {
        return null;
    }

    @Override
    public List<String> getPurchasedTicketsForEvent(Event event, LocalDate date) {
        return null;
    }
}
