package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout() {
        //Sanitize data
        System.out.println("Checkout method called");
    }

    public void dummy() {}
}
