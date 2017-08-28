package pojo1;

import util.impl.SomeLogger;

import java.util.Random;
import java.util.UUID;

public class Client {

    private long id;
    private String name;

    public Client() {
        this.id = new Random(200).nextInt();
        this.name =  UUID.randomUUID().toString();
    }

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

