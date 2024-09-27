package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Boy implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Autowired
    GoodGirl girl;

    public Boy() {
        System.out.println("Boy : Instantiated");
    }

    public void chatWithGirl() {
       /* Girl girl = new Girl();*/ // this is wrong. don't create objects
        girl.chat();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy : BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Boy : BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy : Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Boy : Initializing");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy : ApplicationContextAware");
    }
}
