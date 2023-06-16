package com.driver;

public class PizzaBillGenerator implements BillGenerator {
    public String getBill(Pizza pizza){
        String bill= "Base Price Of The Pizza: " + pizza.getBasePrice() + "\n";
        if(pizza.isCheeseAdded())
            bill= bill+ "Extra Cheese Added: " + pizza.getmyCheesePrice()+ "\n";
        if(pizza.isToppingAdded())
            bill= bill + "Extra Toppings Added: " + pizza.getMyToppingPrice() + "\n";
        if(pizza.isTakeAwayAdded())
            bill= bill + "Paperbag Added: " + pizza.gettakeAwayPrice() + "\n";

        bill= bill + "Total Price: " + pizza.getPrice() + "\n";
        return bill;
    }
}
