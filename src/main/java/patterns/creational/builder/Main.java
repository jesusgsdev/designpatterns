package patterns.creational.builder;

import patterns.creational.builder.entities.Meal;

/**
 * Created by jesgarsal on 11/02/17.
 */
public class Main {

    public static void main(String args[]){
        Meal takeAwayMeal = Meal.newMeal()
                .burger("Cheeseburger")
                .drink("Large Coke Zero")
                .dessert("Brownie")
                .fries("Large fries")
                .takeAway(Boolean.TRUE)
                .build();

        System.out.println(takeAwayMeal);

        Meal normalMeal = Meal.newMeal()
                .burger("Double cheeseburger")
                .drink("Small Coke Zero")
                .dessert("Muffin")
                .fries("Small fries")
                .takeAway(Boolean.TRUE)
                .build();

        System.out.println(normalMeal);
    }

}
