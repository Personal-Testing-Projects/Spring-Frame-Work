package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.Customer;
import lk.ijse.spring.pojo.PojoOne;
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

        System.out.println("\n==================Bean ID==================");
        //catch spring bean using bean id
        //convert bean class name's first letter to lower case (Customer -> customer)
        Customer customerThree = (Customer) ctx.getBean("customer");
        System.out.println(customerThree);

        //catch unowned class spring bean using bean id
        //not converting class name to bean id
        //taking bean method name as bean id(basicDataSource)
        BasicDataSource basicDataSource = (BasicDataSource) ctx.getBean("basicDataSource");
        System.out.println(basicDataSource);

        //changing spring bean id
        //change PojoOne.java @Component -> @Component("ijse")
        PojoOne pojoOne = (PojoOne) ctx.getBean("ijse");
        System.out.println(pojoOne);

        ctx.close();
    }
}
