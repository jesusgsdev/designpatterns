package patterns.creational.builder;

import org.junit.Test;
import patterns.creational.builder.entities.Meal;

import static java.util.Objects.nonNull;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BuilderTest {

    @Test
    public void when_CreateMealWithBuilder_Then_AllDataIsSet(){
        Meal takeAwayMeal = Meal.newMeal()
                .burger("Cheeseburger")
                .drink("Large Coke Zero")
                .fries("Large fries")
                .dessert("Brownie")
                .takeAway(Boolean.TRUE)
                .build();

        nonNull(takeAwayMeal);

        assertThat(takeAwayMeal.getBurger(), is("Cheeseburger"));
        assertThat(takeAwayMeal.getDrink(), is("Large Coke Zero"));
        assertThat(takeAwayMeal.getFries(), is("Large fries"));
        assertThat(takeAwayMeal.getDessert(), is("Brownie"));
        assertThat(takeAwayMeal.getTakeAway(), is(Boolean.TRUE));
    }
}
