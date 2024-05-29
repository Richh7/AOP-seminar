package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("execution(* demo.ShoppingCart.checkout())")
    public void authenticationPointcut () {}

    @Pointcut("execution(* demo.ShoppingCart.dummy())")
    public void authorizationPointcut () {}

    @Before("authenticationPointcut() || authorizationPointcut()")
    public void authenticate() {
        System.out.println("Authenticating the request...");
    }
}
