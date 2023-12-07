import java.util.ArrayList;

public class pizzaSizes {
    static ArrayList<pizzaSize> mySizes= new ArrayList<pizzaSize>();
    // Creating instances of PizzaSizes
    //loads Sizes object and adds them to array list to simulate table
    public void Load(){
        pizzaSize pizzaSize1= new pizzaSize("Small",6.55);
        mySizes.add(pizzaSize1);
        pizzaSize pizzaSize2= new pizzaSize("Medium",12.55);
        mySizes.add(pizzaSize2);
        pizzaSize pizzaSize3= new pizzaSize("Large", 20.55);
        mySizes.add(pizzaSize3);
        pizzaSize pizzaSize4= new pizzaSize("Extra Large", 25.55);
        mySizes.add(pizzaSize4);
    }

    public pizzaSize getpizzaSize(int Index){
        return mySizes.get(Index);
    }
}
