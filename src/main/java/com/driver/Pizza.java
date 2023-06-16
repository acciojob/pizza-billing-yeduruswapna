package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public static int vegBasePrice=300;
    public static int nonvegBasePrice=400;
    public static int myCheesePrice=0;
    public static int vegToppingPrice=70;
    public static int nonvegToppingPrice=120;
    public static int takeAwayPrice=20;
    private int basePrice=0;
    private  int myToppingPrice=0;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    private BillGenerator billGenerator;
    private CheeseAdder cheeseAdder;
    private String cheeseType;


    public Pizza(Boolean isVeg) {
        // your code goes here
        this.isVeg= isVeg;
        this.basePrice= isVeg? vegBasePrice: nonvegBasePrice;
        this.price=0;
        this.bill=" ";
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.billGenerator =new PizzaBillGenerator();
        this.cheeseAdder= new PizzaCheeseAdder();
    }
    public Pizza(Boolean isVeg, BillGenerator billGenerator, CheeseAdder cheeseAdder) {
        // your code goes here
        this.isVeg= isVeg;
        this.basePrice= isVeg? vegBasePrice: nonvegBasePrice;
        this.price=0;
        this.bill=" ";
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.billGenerator= billGenerator;
        this.cheeseAdder=cheeseAdder;
    }
    public int getPrice() {
       this.price=basePrice;
       if(isCheeseAdded)
           this.price+=myCheesePrice;
       if(isToppingAdded)
           this.price+=myToppingPrice;
       if(isTakeAwayAdded)
           this.price+=takeAwayPrice;

       return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        this.myCheesePrice+=cheeseAdder.addCheese(isCheeseAdded, cheeseType);
        isCheeseAdded=true;
    }

    public void addExtraToppings() {
        // your code goes here
        if(!isToppingAdded)
            this.myToppingPrice=isVeg? vegToppingPrice:nonvegToppingPrice;
            isToppingAdded=true;

    }
    public void addTakeaway() {
        // your code goes here
        if (!isTakeAwayAdded)
            isTakeAwayAdded = true;
    }

    public String getBill(){
        return billGenerator.getBill(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public static int getVegBasePrice() {
        return vegBasePrice;
    }

    public static void setVegBasePrice(int vegBasePrice) {
        Pizza.vegBasePrice = vegBasePrice;
    }

    public static int getNonvegBasePrice() {
        return nonvegBasePrice;
    }

    public static void setNonvegBasePrice(int nonvegBasePrice) {
        Pizza.nonvegBasePrice = nonvegBasePrice;
    }

    public static int getmyCheesePrice() {
        return myCheesePrice;
    }

    public static void setmyCheesePrice(int myCheesePrice) {
        Pizza.myCheesePrice = myCheesePrice;
    }

    public static int getVegToppingPrice() {
        return vegToppingPrice;
    }

    public static void setVegToppingPrice(int vegToppingPrice) {
        Pizza.vegToppingPrice = vegToppingPrice;
    }

    public static int getNonvegToppingPrice() {
        return nonvegToppingPrice;
    }

    public static void setNonvegToppingPrice(int nonvegToppingPrice) {
        Pizza.nonvegToppingPrice = nonvegToppingPrice;
    }

    public static int gettakeAwayPrice() {
        return takeAwayPrice;
    }

    public static void settakeAwayPrice(int takeAwayPrice) {
        Pizza.takeAwayPrice = takeAwayPrice;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getMyToppingPrice() {
        return myToppingPrice;
    }

    public void setMyToppingPrice(int myToppingPrice) {
        this.myToppingPrice = myToppingPrice;
    }

    public boolean isCheeseAdded() {
        return isCheeseAdded;
    }

    public void setCheeseAdded(boolean cheeseAdded) {
        isCheeseAdded = cheeseAdded;
    }

    public boolean isToppingAdded() {
        return isToppingAdded;
    }

    public void setToppingAdded(boolean toppingAdded) {
        isToppingAdded = toppingAdded;
    }

    public boolean isTakeAwayAdded() {
        return isTakeAwayAdded;
    }

    public void setTakeAwayAdded(boolean takeAwayAdded) {
        isTakeAwayAdded = takeAwayAdded;
    }

    public BillGenerator getBillGenerator() {
        return billGenerator;
    }

    public void setBillGenerator(BillGenerator billGenerator) {
        this.billGenerator = billGenerator;
    }


}


