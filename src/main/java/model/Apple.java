package model;

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
            return Discount.Discount_for_red;
        }
        return Discount.Discount_not;
    }
}
