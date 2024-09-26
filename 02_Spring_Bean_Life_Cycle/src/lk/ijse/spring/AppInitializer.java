package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        //spring beans will not destroy when ctx.registerShutdownHook() commented
        ctx.registerShutdownHook();

        //to check in which state spring bean is ready to use
        //below sout will execute after PojoOne : Initializing
        PojoOne pojoOne = ctx.getBean(PojoOne.class);
        System.out.println(pojoOne);
    }
}
