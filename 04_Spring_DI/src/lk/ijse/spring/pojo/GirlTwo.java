package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class GirlTwo implements GoodGirl {
    public GirlTwo() {
        System.out.println("GirlTwo : Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Hi.. Hi.. I'm Girl two");
    }
}
