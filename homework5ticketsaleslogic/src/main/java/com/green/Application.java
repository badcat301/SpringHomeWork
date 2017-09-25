package com.green;

import com.green.service.impl.AuditoriumServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.green.pojo.Event;
import com.green.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class Application {



@Autowired
private AuditoriumServiceImpl auditoriumService;



    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("com.green");
        ctx.registerShutdownHook();
        ctx.start();

        Application bean = ctx.getBean(Application.class);

    }
}
