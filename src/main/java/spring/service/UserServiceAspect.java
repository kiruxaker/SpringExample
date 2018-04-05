package spring.service;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {

    private Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

    @After("execution(* UserServiceImpl.*(..))")
    public void log(JoinPoint point) {
        LOGGER.info(point.getSignature().getName() + " called...");
    }

}
