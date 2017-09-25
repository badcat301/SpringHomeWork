package com.green.pojo;

import com.green.enums.TypeSeats;

public class Seat {

    private Auditorium auditorium;
    private TypeSeats type;
    private int number;
    private int row;
    private long id;

    public Seat(Auditorium auditorium, TypeSeats type, int number, int row, long id) {
        this.auditorium = auditorium;
        this.type = type;
        this.number = number;
        this.row = row;
        this.id = id;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public void setType(TypeSeats type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "auditorium=" + auditorium +
                ", type=" + type +
                ", number=" + number +
                ", row=" + row +
                ", id=" + id +
                '}';
    }
}
