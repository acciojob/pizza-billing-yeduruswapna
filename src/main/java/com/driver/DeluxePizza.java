package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        //super(isVeg);
        // your code goes here
        super(isVeg, new DeluxePizzaBillGenerator(), new PizzaCheeseAdder());
        super.addExtraCheese();
        super.addExtraToppings();
        super.addTakeaway();

    }
}