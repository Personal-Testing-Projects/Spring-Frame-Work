package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class DbConnection {
    public DbConnection() {
        System.out.println("DbConnection : Instantiated");
    }
}
