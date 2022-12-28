package com.pattern.designpattern.pattern.behavioral.strategy.payment;

import com.pattern.designpattern.pattern.behavioral.strategy.payment.impl.CreditCardStrategy;
import com.pattern.designpattern.pattern.behavioral.strategy.payment.impl.PaypalStrategy;

public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        /**
         * Strategy pattern is useful when we have multiple algorithms for specific task
         * and we want our application to be flexible to choose any of the algorithm at runtime for specific task.
         */
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }

}
