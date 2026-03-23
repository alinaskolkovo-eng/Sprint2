package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
protected String colour;

public Apple (int amount, double price,String colour){
    super(amount,price,true);
    this.colour = colour;
}

    @java.lang.Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.DISCOUNT_FOR_RED;
        }
        return Discount.DISCOUNT_NOT;
    }
}
