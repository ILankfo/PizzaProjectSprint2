public class Beverage {

    String bevName;
    char bevSize;
    double bevPrice;
    int bevNum;
    static int bevMax = 0;
    ///assignment of attributes to a beverage object
    Beverage(String newBevName, char newBevSize, double newBevPrice) {
        bevName = newBevName;
        bevSize = newBevSize;
        bevPrice = newBevPrice;
        bevNum = bevMax++;
    }
    ///getter for price of beverage
    public double getBevPrice() {
        return bevPrice;
    }
}
