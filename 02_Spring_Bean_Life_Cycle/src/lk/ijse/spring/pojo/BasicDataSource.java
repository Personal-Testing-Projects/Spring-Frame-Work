package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BasicDataSource implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public BasicDataSource() {
        System.out.println("BasicDataSource : Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BasicDataSource : " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanDataSource" + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BasicDataSource : " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BasicDataSource : Initializing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BasicDataSource : Destroy");
    }
}
