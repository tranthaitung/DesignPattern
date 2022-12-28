package com.pattern.designpattern.pattern.behavioral.strategy.payment;

import java.util.ArrayList;
import java.util.List;

/**
 * Context: The context maintains a reference to one of the strategy objects.
 * The context doesn't know the concrete class of a strategy. It should work with all strategies via the strategy interface
 */
public class ShoppingCart {

    //List of items
    List<Item> items;

    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
