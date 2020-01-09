package app;

public class Main {

    public static void main(final String[] args) {
        Hamburger hamburger = new Hamburger();

        System.out.println(hamburger.getName());

        hamburger.addTopping("Lettuce");
        hamburger.addTopping("Pickle");
        hamburger.addTopping("Onion");
        hamburger.addTopping("Tomato");
        hamburger.addTopping("Onion");

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger();

        System.out.println(healthyBurger.getName());

        healthyBurger.addTopping("Lettuce");
        healthyBurger.addTopping("Pickle");
        healthyBurger.addTopping("Onion");
        healthyBurger.addTopping("Tomato");
        healthyBurger.addTopping("Onion");

        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        System.out.println(deluxeBurger.getName());

        deluxeBurger.addTopping("Lettuce");
        deluxeBurger.addTopping("Pickle");
        deluxeBurger.addTopping("Onion");
        deluxeBurger.addTopping("Tomato");
        deluxeBurger.addTopping("Onion");
    }
}








