package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestOne implements InitializingBean {
    @Autowired
    Environment environment;

    public TestOne() {
        System.out.println("TestOne : Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        String property =  environment.getProperty("user.email");//if the key is not available it returns null
        System.out.println("Test Bean : " + property);

        String requiredProperty = environment.getRequiredProperty("user.email");//if the key is not available it returns exception
        System.out.println("Test Bean : " + requiredProperty);
    }
}
