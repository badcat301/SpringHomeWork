package util.impl;

import pojo1.Event;
import util.Logger;

public class SomeLogger implements Logger {



    public void doEvent(Event event) {

        System.out.println(event);
    }
}
