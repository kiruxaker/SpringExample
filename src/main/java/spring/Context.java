package spring;

import org.springframework.context.ApplicationContext;

public class Context {
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    private ApplicationContext applicationContext;

    public Context(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
