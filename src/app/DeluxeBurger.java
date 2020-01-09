package app;

public class DeluxeBurger extends Burger{

    Chips chips = new Chips();
    Drink drink = new Drink();

    public DeluxeBurger(){
        super("Deluxe Burger", "Pretzel Roll", "Wagyu", 8);

        chips.addIngredient();
        drink.addIngredient();
    }
}