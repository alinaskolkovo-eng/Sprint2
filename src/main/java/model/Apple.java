package model;

import model.constants.Discount;

public class Apple extends Food {
protected String colour;

public Apple (int amount, double price,String colour){
    super(amount,price);
    this.colour = colour;
    this.isVegetarian = true;
}

    @java.lang.Override
    public double getDiscount() {
        if (Colour.Red.equals(colour)) {
            return Discount.DISCOUNT_FOR_RED;
        }
        return Discount.DISCOUNT_NOT;
    }
}
