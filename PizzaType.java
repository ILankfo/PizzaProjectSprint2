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
    public void PizzaOptions(int choice) {
        if (choice == 1) {
            Pizzas pizza1 = new Pizzas("Cheesy Deluxe", 'L', 12.99, 1, "Cheesy Crust");
            Pizzas.add(pizza1);
        }
        if (choice == 2) {
            Pizzas pizza2 = new Pizzas("Meat Lovers", 'M', 13.99, 2, "Normal Crust");
            Pizzas.add(pizza2);
        }
        if (choice == 3) {
            Pizzas pizza3 = new Pizzas("Vegan Pizza", 'S', 8.99, 3, "Thin Crust");
            Pizzas.add(pizza3);
        }
        if (choice == 4) {
            Pizzas pizza4 = new Pizzas("Pineapple Party Pizza", 'X', 15.99, 4, "Normal Crust");
            Pizzas.add(pizza4);
        }
    }
}