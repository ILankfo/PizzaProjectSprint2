import java.util.ArrayList;

public class Pizzas {
    String pizzaName;
    char pizzaSize;
    //Small = S, Medium = M, Large = L, ExtraLarge = X
     static double pizzaPrice;
    int pizzaNum;
    String crustType;
    static int maxPizzas = 0;

    static ArrayList <Topping> Toppings = new ArrayList<Topping>();

    Pizzas(){};
    Pizzas(String newPizzaName, char newPizzaSize, double newPizzaPrice, int newPizzaNum, String newCrustType) {
        pizzaName = newPizzaName;
        pizzaSize = newPizzaSize;
        pizzaPrice = newPizzaPrice;
        crustType = newCrustType;
        pizzaNum = maxPizzas++;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void addToppings(Topping mytopping){
        Toppings.add(mytopping);
        pizzaPrice+=mytopping.getPrice();
    }
}
