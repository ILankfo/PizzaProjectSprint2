import java.util.ArrayList;

public class Receipt {
    static ArrayList <Pizzas> MyPizzas=new ArrayList<Pizzas>();
    static ArrayList<Beverage> MyBeverages=new ArrayList<Beverage>();

    Double Total=0.0;
    Receipt(){}
//adds pizza to array list than updates total with the added pizza's price
    public void addPizza(Pizzas myPizza){
        Total+=myPizza.getPizzaPrice();
        MyPizzas.add(myPizza);
    }
    //adds Beverage to array list than updates total with the added Beverage's price
    public void addBeverages(Beverage myBeverage){
        Total+=myBeverage.getBevPrice();
        MyBeverages.add(myBeverage);
    }
    //grabs the array list for use in Receipt page
    public static ArrayList<Beverage> getMyBeverages() {
        return MyBeverages;
    }
    //grabs the array list for use in Receipt page
    public static ArrayList<Pizzas> getMyPizzas() {
        return MyPizzas;
    }
}
