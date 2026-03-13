// Main class
public class FoodDeliveryApp {
    public static void main(String[] args) {

        VegRestaurant veg = new VegRestaurant("Green Garden");
        NonVegRestaurant nonveg = new NonVegRestaurant("Royal NonVeg");

        veg.showMenu();
        System.out.println();

        nonveg.showMenu();
    }
}
// Base class
class Restaurant {
    String restaurant;

    Restaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    void showMenu() {
        System.out.println("Welcome to " + restaurant);
        System.out.println("General Menu");
    }
}

// Veg Restaurant subclass
class VegRestaurant extends Restaurant {

    VegRestaurant(String restaurant) {
        super(restaurant);
    }

    void showMenu() {
        System.out.println("Welcome to Veg Restaurant: " + restaurant);
        System.out.println("Veg Special Menu:");
        System.out.println("1. Paneer Butter Masala");
        System.out.println("2. Veg Biryani");
        System.out.println("3. Dal Makhani");
    }
}

// Non-Veg Restaurant subclass
class NonVegRestaurant extends Restaurant {

    NonVegRestaurant(String restaurant) {
        super(restaurant);
    }

    void showMenu() {
        System.out.println("Welcome to Non-Veg Restaurant: " + restaurant);
        System.out.println("Non-Veg Special Menu:");
        System.out.println("1. Chicken Biryani");
        System.out.println("2. Butter Chicken");
        System.out.println("3. Fish Curry");
        System.out.println("4. Mutton Korma");
        System.out.println("5. Lamb Rogan Josh");
        

    }
}

