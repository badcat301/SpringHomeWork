package service;

import pojo1.Client;
import pojo1.Event;
import util.impl.SomeLogger;

import java.util.Date;

public class ClientService {

    private SomeLogger log;

    public ClientService(SomeLogger log) {
        this.log = log;
    }

    public void createUsers(Client client) {
        Event event = new Event(new Date());
        event.setMsg("USER ADD"+client );

        log.doEvent(event);
    }
}
