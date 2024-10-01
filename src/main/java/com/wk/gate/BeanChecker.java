package com.wk.gate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanChecker implements CommandLineRunner {

    private final ApplicationContext ctx;

    public BeanChecker(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) throws Exception {
        String[] beanNames = ctx.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            if (beanName.toLowerCase().contains("netty")) {
                System.out.println("Netty Bean: " + beanName);
            }
        }
    }
}
