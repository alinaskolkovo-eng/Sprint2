package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (Food item : items) {
            double discountPercent = item.getDiscount(); // например 60
            double multiplier = 1 - discountPercent / 100.0;
            total += item.getPrice() * item.getAmount() * multiplier;
        }
        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getPrice() * item.getAmount();
            }
        }
        return total;
    }
}
