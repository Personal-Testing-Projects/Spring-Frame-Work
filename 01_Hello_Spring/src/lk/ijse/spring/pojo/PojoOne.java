package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component("ijse")
public class PojoOne {
    public PojoOne() {
        System.out.println("PojoOne : Instantiated");
    }
}
