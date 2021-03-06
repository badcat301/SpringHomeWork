package com.green.service.impl;

import org.springframework.stereotype.Service;
import com.green.pojo.Booking;
import com.green.pojo.Event;
import com.green.pojo.Seat;
import com.green.pojo.User;
import com.green.service.BookingService;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingServiceImlp implements BookingService {

    private List<Booking> tickets;

    @Override
    public int getTicketsPrice(Event event, LocalDate date, User user, int seats) {
        return (int) tickets.stream()
                .filter(ticket ->
                        ticket.getEvent().equals(event) &&
                                ticket.getDt().equals(date) &&
                                ticket.getUser().equals(user)&&
                                ticket.getSeat().equals(seats))
                .mapToLong(ticket -> event.getPriceTickets()).sum();

    }

    @Override
    public Booking bookTicket(Event event, LocalDateTime date, User user, Seat seats) {

        Booking ticket = new Booking();
      ticket.setUser(user);
      ticket.setDt(date);
      ticket.setEvent(event);
      ticket.setSeat(seats);

      tickets.add(ticket);



        return ticket;
    }

    @Override
    public List<Booking> getPurchasedTicketsForEvent(Event event, LocalDate date) {
        return tickets.stream().filter(ticket -> ticket.getDt().equals(date)
                && ticket.getEvent().equals(event)).collect(Collectors.toList());
    }
}
