package com.pattern.designpattern.pattern.behavioral.templatemethod.buildHouse;

public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

}

/**
 * Pros
  - You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.
  -  You can pull the duplicate code into a superclass.
 */

/**
 * Cons
 - Some clients may be limited by the provided skeleton of an algorithm.
 - Template methods tend to be harder to maintain the more steps they have.
 */
