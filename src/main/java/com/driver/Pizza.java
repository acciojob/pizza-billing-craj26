package com.driver;

public class Pizza {

    private int price;
    private final int toppingPrice;
    //private  int cheesePrice;
    private Boolean isVeg;
    private String bill;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isPaperBag;
    boolean isBillCreated;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price=300;
            this.toppingPrice=70;
        }else{
            this.price=400;
            this.toppingPrice=120;
        }
        //this.cheesePrice = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.price+=80;
            isExtraCheeseAdded=true;
        }

        // your code goes here
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price+=this.toppingPrice;
            isExtraToppingsAdded=true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(!isPaperBag){
            this.price+=20;
            isPaperBag=true;
        }
        // your code goes here
    }

    public String getBill(){
        if(!isBillCreated){
            if(isExtraCheeseAdded){
                this.bill+="Extra Cheese Added: 80"+"\n";
            }
            if(isExtraToppingsAdded){
                this.bill+="Extra Toppings Added:"+this.toppingPrice+"\n";
            }
            if(isPaperBag){
                this.bill+="Paperbag Added: 20"+"\n";
            }
            this.bill+="Total Price:"+this.price+"\n";
            this.isBillCreated=true;
            return this.bill;
            // your code goes here

        }
        return this.bill;

    }
}
