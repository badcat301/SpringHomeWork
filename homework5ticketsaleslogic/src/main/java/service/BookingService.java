package service;

import pojo.Booking;
import pojo.Event;
import pojo.User;
import service.impl.Seat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface BookingService {

    int getTicketsPrice(Event event, LocalDate date, User user,int seats);

    Booking bookTicket(Event event, LocalDateTime date, User user, Seat seats);

    List<Booking> getPurchasedTicketsForEvent(Event event, LocalDate date);
}
