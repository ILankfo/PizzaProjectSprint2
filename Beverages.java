import java.util.ArrayList;
public class Beverages {
        ArrayList <Beverage> myBeverages;
        Beverages(){}

        public void AddBeverage(Beverage myBeverage){
            myBeverages.add(myBeverage);
        }
        public String getBevName(int bevNum){
            return myBeverages.get(bevNum).bevName;
        }
        public char getBevSize(int bevNum){
            return myBeverages.get(bevNum).bevSize;
        }
        public double getBevPrice(int bevNum){
            return myBeverages.get(bevNum).bevPrice;
        }
        public int getBevNum(int bevNum){
            return myBeverages.get(bevNum).bevNum;
        }
    }
