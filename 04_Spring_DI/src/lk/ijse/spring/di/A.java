package lk.ijse.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    /*@Autowired*/
    SuperB superB;//Property Injection

    /*@Autowired*///contructor injection also works without this annotation
    public A(SuperB superB) {
        /*this.superB = superB;*///Constructor Injection
        System.out.println("A : Instantiated");
    }

    public void test() {
        superB.methodUseByA();
    }

    @Autowired
    public void setSuperB(SuperB superB) { //Setter Method Injection
        this.superB = superB;
    }
}
