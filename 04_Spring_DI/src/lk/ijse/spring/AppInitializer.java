package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.di.A;
import lk.ijse.spring.pojo.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        /*Boy boy = ctx.getBean(Boy.class);
        boy.chatWithGirl();*/
        //initializing two girl objects
        //one by spring & otherone not from spring
        //but this is wrong
        //so we use @Autowired annotation to use that spring bean by dependency injection
        //now only one girl object will initialized & that is a spring bean

        A bean =ctx.getBean(A.class);
        bean.test();
    }
}
