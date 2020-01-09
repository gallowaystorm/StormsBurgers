package app;

public class Ingredient{

    private String name;
    private double price;
    private int quantity;

    public Ingredient(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public double addIngredient(){
        price = price * quantity;
        System.out.println(quantity + " " + name +  " have been added for $" + price);
        return price;
    }

    public String getName(){
        return name;
    }
    
}