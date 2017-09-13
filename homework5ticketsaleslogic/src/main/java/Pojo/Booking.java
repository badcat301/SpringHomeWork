package Pojo;

public class Booking {
    private Event event;
    private User user;
    Auditorium auditorium;

    public Booking(Event event, User user, Auditorium auditorium) {
        this.event = event;
        this.user = user;
        this.auditorium = auditorium;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "event=" + event +
                ", user=" + user +
                ", auditorium=" + auditorium +
                '}';
    }
}
