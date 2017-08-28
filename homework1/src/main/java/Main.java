import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Client;
import pojo.Event;
import util.Logger;

public class Main {
    public static void main(String[] args) {


        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        Event event = (Event) beanFactory.getBean("event");


        Client client = (Client) beanFactory.getBean("client");

        Logger logger =(Logger) beanFactory.getBean("logger");



    }
}
