package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoOne() {
        System.out.println("\n==================================");
        System.out.println("PojoOne : Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("PojoOne : " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne : " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne : " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne : Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne : Destroyed");
    }
}
