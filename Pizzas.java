public class Pizzas {
    String PizzaName;
    char PizzaSize;
    //Small = S, Medium = M, Large = L, ExtraLarge = X
    double PizzaPrice;
    int PizzaNum;
    String CrustType;
    static int MaxPizzas = 0;

    Pizzas(String NewPizzaName, char NewPizzaSize, double NewPizzaPrice, int NewPizzaNum, String NewCrustType) {
        PizzaName = NewPizzaName;
        PizzaSize = NewPizzaSize;
        PizzaPrice = NewPizzaPrice;
        CrustType = NewCrustType;
        PizzaNum = MaxPizzas++;
    }
}
