package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        //to hear pojoone and pojotwo spring beans initializing without even calling them

        //then add @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) annotation to PojoOne class
        //now pojoone spring bean is not creating but pojotwo spring bean is creating

        //check pojotwo's singleton behavior
        PojoTwo pojoTwo1 = ctx.getBean(PojoTwo.class);
        PojoTwo pojoTwo2 = ctx.getBean(PojoTwo.class);
        //same reference is printing from below lines
        System.out.println(pojoTwo1);
        System.out.println(pojoTwo2);

        //check pojoone's behavior with scope annotation
        //now pojoone is instatntiated from above line
        //it mean it needs to ask to make a object from pojoone now
        ctx.getBean(PojoOne.class);

        //check references
        PojoOne pojoOne1 = ctx.getBean(PojoOne.class);
        PojoOne pojoOne2 = ctx.getBean(PojoOne.class);
        //different references are printing from above lines
        //it means more object are creating using pojoone class
        //prototype based objects are creating
        System.out.println(pojoOne1);
        System.out.println(pojoOne2);

    }
}
