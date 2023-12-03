import java.util.ArrayList;


public class pizzaType {
    ArrayList <pizzas> pizzas;
    ArrayList <Toppings> toppings;
    pizzaType() {

    }
    public void addPizza (pizzas myPizza) {
        pizzas.add(myPizza);
    }
    public void addTopping(toppings myToppings) {
        pizzas.add(myToppings);
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
    public void PizzaOptions() {
        Pizzas pizza1 = new Pizzas("Cheesy Deluxe", 'L', 12.99, 1, "Cheesy Crust");
        Pizzas.add(pizza1);
        Pizzas pizza2 = new Pizzas("Meat Lovers", 'M', 13.99, 2, "Normal Crust");
        Pizzas.add(pizza2);
        Pizzas pizza3 = new Pizzas("Vegan Pizza", 'S', 8.99, 3, "Thin Crust");
        Pizzas.add(pizza1);
        Pizzas pizza4 = new Pizzas("Pineapple Party Pizza", 'X', 15.99, 4, "Normal Crust");
        Pizzas.add(pizza4);
    }
}
