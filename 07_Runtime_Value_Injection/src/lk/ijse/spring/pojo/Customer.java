package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
   /* public Customer() {
    }
*/
    @Autowired(required = false)//Here spring runs the greedious constructor
    public Customer(@Value("Pathum") String name, @Value("22") int age) {
        System.out.println("Customer : Instantiated " + name);
        System.out.println(age);
    }

    @Autowired(required = false)
    public Customer(@Value("Pathum, Lahiru, Chandana") String names[]) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    //what you can assign with @Value
    //Primitive data types
    //String data
    //Arrays
}
