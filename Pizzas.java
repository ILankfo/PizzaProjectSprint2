import java.util.ArrayList;

public class Pizzas {

    pizzaSize pizzaSize;
    //Small = S, Medium = M, Large = L, ExtraLarge = X
     double pizzaPrice=0.0;
    int pizzaNum;
    Crust crustType;
    static int maxPizzas = 0;

    static ArrayList <Topping> Toppings = new ArrayList<Topping>();

    Pizzas(){};
    Pizzas(  double newPizzaPrice) {
        pizzaPrice = newPizzaPrice;
        pizzaNum = maxPizzas++;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public ArrayList<Topping> getToppingsArray(){
        return Toppings;
    }
    //adds topping to topping array and updates price
    public void addToppings(Topping mytopping){
        Toppings.add(mytopping);
        pizzaPrice+=mytopping.getPrice();
    }
    //removes topping from array and topping cost from total price
    public void removeTopping(Topping myTopping){
        Toppings.remove(myTopping);
        pizzaPrice-=myTopping.getPrice();
    }
    //add or update crust and update price
    public void addCrust(Crust crustToAdd){
        if(crustType==null) {
            crustType = crustToAdd;
            if(crustToAdd.price!=0.0){
                pizzaPrice+= crustToAdd.price;
            }
        } else {
            pizzaPrice-=crustType.price;
            crustType=crustToAdd;
            if(crustToAdd.price!=0.0) {
                pizzaPrice += crustToAdd.price;
            }
        }
    }
    //adds or updates size and  adjusts price
    public void addSize(pizzaSize newSize){
        if (pizzaSize != null) {
            pizzaPrice -= pizzaSize.price;
        }
        pizzaSize = newSize;
        pizzaPrice+= newSize.price;

    }

    public String getName(){
        String pizzaName = " Pizza";
        if(crustType!=null){
            pizzaName= crustType.CrustName+" "+pizzaName;
        }
        if(pizzaSize!=null){
            pizzaName= pizzaSize.name+" "+pizzaName;
        }
        if(Toppings.size()!=0){
            pizzaName+=" with";
            for (int i = 0; i < Toppings.size(); i++) {
                if(i==0){
                pizzaName+= " "+Toppings.get(i).getName();
                }else {
                    pizzaName+= ", "+Toppings.get(i).getName();
                }
            }
        }
        return pizzaName+" $"+pizzaPrice;
    }
    public void removeAll(){
        Toppings.clear();
    }
}
