package pojo;

import service.impl.Seat;

import java.time.LocalDateTime;

public class Booking {

    private Event event;
    private User user;
    private Auditorium auditorium;
    private Seat seat;
    private LocalDateTime dt;

    public Booking() {

    }

    public Booking(Event event, User user, Auditorium auditorium) {
        this.event = event;
        this.user = user;
        this.auditorium = auditorium;
    }

    public Booking(Event event, User user, Auditorium auditorium, Seat seat, LocalDateTime dt) {
        this.event = event;
        this.user = user;
        this.auditorium = auditorium;
        this.seat = seat;
        this.dt = dt;
    }

    public Event getEvent() {
        return event;
    }

    public User getUser() {
        return user;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public Seat getSeat() {
        return seat;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }
}
