import java.util.ArrayList;

public class Toppings {
    static ArrayList <Topping> toppingArrayList=new ArrayList<Topping>();

    Toppings(){}

        // Creating instances of Topping
        //loads topping object and adds them to array list to simulate table
        public void Load(){
            Topping pepperoni = new Topping("Pepperoni", 2.52);
            Topping mushrooms = new Topping("Mushrooms", 1.75);
            Topping onions = new Topping("Onions", 1.55);
            Topping extraCheese = new Topping("Extra Cheese", 1.55);
            Topping chicken = new Topping("Chicken", 2.55);
            Topping italianSausage = new Topping("Italian Sausage", 2.15);
            Topping olives = new Topping("Olives", 1.55);
            Topping pineapples = new Topping("Pineapples", 1.55);
            Toppings.AddTopping(pepperoni);
            Toppings.AddTopping(pineapples);
            Toppings.AddTopping(mushrooms);
            Toppings.AddTopping(onions);
            Toppings.AddTopping(extraCheese);
            Toppings.AddTopping(chicken);
            Toppings.AddTopping(italianSausage);
            Toppings.AddTopping(olives);

        }

    //Adds Topping to Array list. the quick and dirty ID increments as a new Topping is added,
    // so the ID is the same as the index
    public static void AddTopping(Topping myTopping){
        toppingArrayList.add(myTopping);
    }

    public String getName(int Id){
        return toppingArrayList.get(Id).getName();
    }
    public double getPrice(int Id){
        return toppingArrayList.get(Id).getPrice();
    }
    public Topping getTopping(int index){
        return toppingArrayList.get(index);
    }
    }

