package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {
    @Value("${os.name}")//property placeholder
    private String myOSName;

    @Value("${USERNAME}")
    private String myUserName;

    @Value("${db.user.name}")
    private String dbUserName;
    @Value("${db.user.password}")
    private String dbPassword;

    public DBConnection() {
        System.out.println("DBConnection : Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OS Name : " + myOSName);
        System.out.println("User Name : " + myUserName);
        System.out.println("DB User Name : " + dbUserName);
        System.out.println("DB Password : " + dbPassword);
    }
}
