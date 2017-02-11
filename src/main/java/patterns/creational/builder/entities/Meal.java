package patterns.creational.builder.entities;

import java.util.Objects;

/**
 * Created by jesgarsal on 11/02/17.
 */
public class Meal {

    private String burger;
    private String drink;
    private String dessert;
    private String fries;
    private Boolean takeAway;

    private Meal(Builder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.fries = builder.fries;
        this.takeAway = builder.takeAway;
    }

    public static Builder newMeal() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Meal)) return false;
        Meal meal = (Meal) o;
        return Objects.equals(burger, meal.burger) &&
                Objects.equals(drink, meal.drink) &&
                Objects.equals(dessert, meal.dessert) &&
                Objects.equals(fries, meal.fries) &&
                Objects.equals(takeAway, meal.takeAway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(burger, drink, dessert, fries, takeAway);
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger='" + burger + '\'' +
                ", drink='" + drink + '\'' +
                ", dessert='" + dessert + '\'' +
                ", fries='" + fries + '\'' +
                ", takeAway=" + takeAway +
                '}';
    }


    public static final class Builder {
        private String burger;
        private String drink;
        private String dessert;
        private String fries;
        private Boolean takeAway;

        private Builder() {
        }

        public Meal build() {
            return new Meal(this);
        }

        public Builder burger(String burger) {
            this.burger = burger;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder fries(String fries) {
            this.fries = fries;
            return this;
        }

        public Builder takeAway(Boolean takeAway) {
            this.takeAway = takeAway;
            return this;
        }
    }
}
