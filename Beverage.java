public class Beverage {

    String bevName;
    char bevSize;
    double bevPrice;
    int bevNum;
    static int bevMax = 0;

    Beverage(String newBevName, char newBevSize, double newBevPrice) {
        bevName = newBevName;
        bevSize = newBevSize;
        bevPrice = newBevPrice;
        bevNum = bevMax++;
    }

    public double getBevPrice() {
        return bevPrice;
    }
}
