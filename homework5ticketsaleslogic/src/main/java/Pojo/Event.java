package Pojo;

import java.time.LocalDate;

public class Event {

    private String name;
    private int priceTickets;
    private LocalDate localDate;

    public Event(String name, int priceTickets, LocalDate localDate) {
        this.name = name;
        this.priceTickets = priceTickets;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceTickets() {
        return priceTickets;
    }

    public void setPriceTickets(int priceTickets) {
        this.priceTickets = priceTickets;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", priceTickets=" + priceTickets +
                ", localDate=" + localDate +
                '}';
    }
}
