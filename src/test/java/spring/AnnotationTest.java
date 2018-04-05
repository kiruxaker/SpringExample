package spring;


import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;
import spring.model.User;


public class AnnotationTest {

    static ApplicationContext context = null;

    private User user = new User(1, "Kirill");

    @BeforeClass
    public static void setup() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testGetBean() {
        assertThat(context.getBean("user").toString(), Matchers.equalTo(user.toString()));

    }
}
