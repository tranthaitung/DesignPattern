package com.pattern.designpattern.pattern.behavioral.templatemethod.buildHouse;

public abstract class HouseTemplate {

    //template method, final so subclasses can't override
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses

    /**
     * Most of the times, subclasses calls methods from super class but in template pattern,
     * superclass template method calls methods from subclasses,
     * this is known as Hollywood Principle - “don’t call us, we’ll call you.”.
     */
    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}
