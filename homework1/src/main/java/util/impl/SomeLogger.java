package util.impl;

import util.Logger;

public class SomeLogger implements Logger {

String  someOneLog;

    public void doEvent() {

        System.out.println(someOneLog);
    }
}
