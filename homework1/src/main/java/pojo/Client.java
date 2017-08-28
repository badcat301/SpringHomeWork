package pojo;

import util.impl.SomeLogger;

public class Client {


    private Event events;
    private SomeLogger someLogger;


    public Client(Event events, SomeLogger someLogger) {
        this.events = events;
        this.someLogger = someLogger;
    }


}

