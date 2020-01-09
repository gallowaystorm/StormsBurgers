package app;

public class Burger{

    private String name;
    private String breadType;
    private String meat;
    private double price;
    private int numOfToppings;

    public Burger(String name, String breadType, String meat, double price){
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
        this.numOfToppings = 0;
    }

    public String getName(){
        return name;
    } 

    public String getBreadType(){
        return breadType;
    }

    public String getMeat(){
        return meat;
    }

    public double getPrice(){
        return price;
    }

    public void addTopping(String newIngredient){
        if ((name.equals("Hamburger") && numOfToppings < 4) || (name.equals("Healthy Burger") && numOfToppings < 6 )){
            switch (newIngredient){
                case "Lettuce":
                    Lettuce lettuce = new Lettuce();
                    price = price + lettuce.addIngredient();
                    break;
                case "Tomato":
                    Tomato tomato = new Tomato();
                    price = price + tomato.addIngredient();
                    break;
                case "Onion":
                    Onion onion = new Onion();
                    price = price + onion.addIngredient();
                    break;
                case "Pickle":
                    Pickle pickle = new Pickle();
                    price = price + pickle.addIngredient();
                    break;
            }
            System.out.println(newIngredient + " has been added  to " + name + "." + "\n" + "the price is now " + price);
            numOfToppings++;

        } else if (name.equals("Deluxe Burger")){
            System.out.println("Deluxe burgers can not have toppings added...");
        } else {
            System.out.println("You have added the max amount of toppings.");
        }
    }
}