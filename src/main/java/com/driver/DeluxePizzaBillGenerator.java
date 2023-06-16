package com.driver;

public class DeluxePizzaBillGenerator implements BillGenerator{
    public String getBill(Pizza pizza){
        int basePrice= pizza.getBasePrice()+ pizza.getMyToppingPrice() + pizza.getmyCheesePrice();
        String bill= "Base Price Of The Pizza: " + basePrice + "\n";
        if(pizza.isTakeAwayAdded())
            bill= bill + "Paperbag Added: " + pizza.takeAwayPrice + "\n";

        bill= bill + "Total Price: " + pizza.getPrice() + "\n";
        return bill;
    }
}
