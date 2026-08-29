package org.aman.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements BeanNameAware, ApplicationContextAware
        /*implements InitializingBean, DisposableBean*/ {

    Map<Integer, String> mp;

    public CartService() {
        mp = new HashMap<>();
        System.out.println("CartService constructor called");
    }

    // Aware Interfaces start
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is" + " " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext is" + " " + applicationContext.getClass());
    }
    // Aware Interfaces end

    // Initialization Callbacks start
//    @Override // InitializingBean
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is ready");
//        mp.put(1, "Anshuman");
//        mp.put(2, "Aman");
//    }

//    public void start() { // initMethod
//        System.out.println("Bean is ready");
//        mp.put(1, "Anshuman");
//        mp.put(2, "Aman");
//    }

    @PostConstruct
    public void start2() {
        System.out.println("Bean is ready");
        mp.put(1, "Anshuman");
        mp.put(2, "Aman");
    }
    // Initialization Callbacks end

    public String getValue(int key) {
        return mp.get(key);
    }

    // Destruction callbacks start
//    @Override // DisposableBean
//    public void destroy() throws Exception {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

//    public void stop() {
//        mp.clear();
//        System.out.println("Bean is getting destroyed");
//    }

    @PreDestroy
    public void stop2() {
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }
    // Destruction callbacks end
}
