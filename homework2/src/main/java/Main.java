import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo1.Client;
import service.ClientService;

public class Main {
    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");

        ClientService service = beanFactory.getBean("service", ClientService.class);

        service.createUsers(beanFactory.getBean("client",Client.class));
        //System.out.println(service);


    }
}
