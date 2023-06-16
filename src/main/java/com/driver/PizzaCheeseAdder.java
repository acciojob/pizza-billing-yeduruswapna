package com.driver;

public class PizzaCheeseAdder implements CheeseAdder{
    static int mozarellaPrice=100;
    static int cheddarPrice=120;
    static int cheesePrice=80;
    public int addCheese(Boolean isCheeseAdded, String cheeseType){
        if(!isCheeseAdded) {
            return 0;
        }
        return cheesePrice;
    }
}
