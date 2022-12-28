package com.pattern.designpattern.pattern.structual.decorator.car;

/**
 * Component Implementation
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}
