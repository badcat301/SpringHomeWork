package service;

import pojo.Event;
import pojo.User;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {

    int getTicketsPrice(Event event, LocalDate date, User user,int seats);

    String bookTicket(Event event, LocalDate date, User user,int seats);

    List<String> getPurchasedTicketsForEvent(Event event, LocalDate date);
}
