import java.util.ArrayList;


public class PizzaType {
    ArrayList <Pizzas> Pizzas;

    PizzaType() {

    }
    public void AddPizza (Pizzas myPizza) {
        Pizzas.add(myPizza);
    }
    public String getPizzaName(int PizzaID) {
        return Pizzas.get(PizzaID).PizzaName;
    }
    public char getPizzaSize(int PizzaID) {
        return Pizzas.get(PizzaID).PizzaSize;
    }
    public double getPizzaPrice(int PizzaID) {
        return Pizzas.get(PizzaID).PizzaPrice;
    }
    public int getPizzaNum(int PizzaID) {
        return Pizzas.get(PizzaID).PizzaNum;
    }
    public String getPizzaCrust(int PizzaID) {
        return Pizzas.get(PizzaID).CrustType;
    }
}