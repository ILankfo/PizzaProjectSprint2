import java.util.ArrayList;


public class pizzaType {
    ArrayList <pizzas> pizzas;

    pizzaType() {

    }
    public void addPizza (pizzas myPizza) {
        pizzas.add(myPizza);
    }
    public String getPizzaName(int pizzaID) {
        return pizzas.get(pizzaID).pizzaName;
    }
    public char getPizzaSize(int pizzaID) {
        return pizzas.get(pizzaID).pizzaSize;
    }
    public double getPizzaPrice(int pizzaID) {
        return pizzas.get(pizzaID).pizzaPrice;
    }
    public int getPizzaNum(int pizzaID) {
        return pizzas.get(pizzaID).pizzaNum;
    }
    public String getPizzaCrust(int pizzaID) {
        return pizzas.get(pizzaID).crustType;
    }
}
