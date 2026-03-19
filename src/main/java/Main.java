import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
        public static void main (String[]args){
            Food meat = new Meat(5, 100);
            Food redApples = new Apple(10, 50, Colour.Red);
            Food greenApples = new Apple(8, 60, Colour.Green);

            Food[] items = {meat, redApples, greenApples};
            ShoppingCart cart = new ShoppingCart(items);

            System.out.println(cart.getTotalPriceWithoutDiscount());
            System.out.println(cart.getTotalPriceWithDiscount());
            System.out.println(cart.getTotalVegetarianPriceWithoutDiscount());
        }
    }
