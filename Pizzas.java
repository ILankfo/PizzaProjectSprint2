public class Pizzas {
    String pizzaName;
    char pizzaSize;
    //Small = S, Medium = M, Large = L, ExtraLarge = X
    double pizzaPrice;
    int pizzaNum;
    String crustType;
    static int maxPizzas = 0;

    Pizzas(String newPizzaName, char newPizzaSize, double newPizzaPrice, int newPizzaNum, String newCrustType) {
        pizzaName = newPizzaName;
        pizzaSize = newPizzaSize;
        pizzaPrice = newPizzaPrice;
        crustType = newCrustType;
        pizzaNum = maxPizzas++;
    }
}
