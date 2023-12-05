public class Pizzas extends PizzaType {
    String PizzaName;
    char PizzaSize;
    //Small = S, Medium = M, Large = L, ExtraLarge = X
    double PizzaPrice;
    int PizzaNum;
    String CrustType;
    static int MaxPizzas = 0;
    Pizzas() {

    }
    Pizzas(String NewPizzaName, char NewPizzaSize, double NewPizzaPrice, int NewPizzaNum, String NewCrustType) {
        this.PizzaName = NewPizzaName;
        this.PizzaSize = NewPizzaSize;
        this.PizzaPrice = NewPizzaPrice;
        this.CrustType = NewCrustType;
        this.PizzaNum = MaxPizzas++;
    }
}
