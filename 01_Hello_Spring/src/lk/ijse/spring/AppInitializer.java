package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //catching the spring bean using two references to check it's singleton behavior
        Customer customerOne = ctx.getBean(Customer.class);
        Customer customerTwo = ctx.getBean(Customer.class);
        //Same reference is printing twice by above lines
        System.out.println(customerOne);
        System.out.println(customerTwo);

        ctx.close();
    }
}
