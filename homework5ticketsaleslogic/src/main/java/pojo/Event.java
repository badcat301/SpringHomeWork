package pojo;

import java.time.LocalDate;

public class Event {

    private String name;
    private int priceTickets;
    private LocalDate localDate;
    private int id;

    public Event() {

    }

    public Event(String name, int priceTickets, LocalDate localDate) {
        this.name = name;
        this.priceTickets = priceTickets;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        return name != null ? name.equals(event.name) : event.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
