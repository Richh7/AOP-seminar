package demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout())")
    public void beforeLog() {
        System.out.println("Before log");
    }

    @After("execution(* *.*.check*())")
    public void afterLog() {
        System.out.println("After log");
    }
}
