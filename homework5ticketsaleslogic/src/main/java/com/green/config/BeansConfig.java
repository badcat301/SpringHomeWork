package com.green.config;

import com.green.enums.TypeSeats;
import com.green.service.AuditoriumService;
import com.green.service.impl.AuditoriumServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.green.pojo.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class BeansConfig {

    @Bean(name = "client1")
    public User getUser() {
        User user = new User();
        user.setName("Ivan");
        user.setEmail("sdfsdf@ff.er");
        user.setId(89);
        return user;
    }
    @Bean(name = " auditorium1")
    public Auditorium getAuditoriun() {
        Auditorium auditorium = new Auditorium();
        auditorium.setName("Hall #1");
        auditorium.setNumberOfSeats(23);
        return auditorium;
    }
    @Bean(name = "event1")
    public Event getEvent() {
        Event event = new Event();
        event.setName("Rembo");
        event.setPriceTickets(700);
        event.setLocalDate(LocalDate.now());
        event.setId(12);
        return event;
    }
    @Bean(name = "ticket1")
    public Booking getTicket() {
        Booking ticket = new Booking();
        ticket.setEvent(getEvent());
        ticket.setAuditorium(getAuditoriun());
        ticket.setDt(LocalDateTime.now());
        ticket.setUser(getUser());
        return ticket;
    }
    @Bean(name = "seat1")
    public Seat seat() {
        return new Seat(getAuditoriun(), TypeSeats.STANDART, 1, 12, 1);

    }

    @Bean
    public AuditoriumService getAuditoriumServiceIml(){
        AuditoriumService auditoriumService = new AuditoriumServiceImpl();
        auditoriumService.getAll();
        return  auditoriumService;
    }

}
