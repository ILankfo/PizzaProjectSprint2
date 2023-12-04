import java.util.ArrayList;
public class Beverages {
        static ArrayList <Beverage> myBeverages;
        Beverages(){}

        public static void AddBeverage(Beverage myBeverage){
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
            public void load() {
        Beverage lCoke = new Beverage("Large Coke",'L',4.99);
        Beverage mCoke = new Beverage("Medium Coke",'M',2.99);
        Beverage sCoke = new Beverage("Small Coke",'S',0.99);

        Beverage lDietCoke = new Beverage("Large Diet Coke",'L',4.99);
        Beverage mDietCoke = new Beverage("Medium Diet Coke",'M',2.99);
        Beverage sDietCoke = new Beverage("Small Diet Coke",'L',0.99);

        Beverage lDrPepper = new Beverage("Large Dr.Pepper",'L',4.99);
        Beverage mDrPepper = new Beverage("Medium Dr.Pepper",'M',2.99);
        Beverage sDrPepper = new Beverage("Small Dr.Pepper",'S',0.99);

        Beverage lLemonade = new Beverage("Large Lemonade",'L',4.99);
        Beverage mLemonade = new Beverage("Medium Lemonade",'M',2.99);
        Beverage sLemonade = new Beverage("Small Lemonade",'S',0.99);

        Beverage lRootBeer = new Beverage("Large Root Beer",'L',4.99);
        Beverage mRootBeer = new Beverage("Medium Root Beer",'M',2.99);
        Beverage sRootBeer = new Beverage("Small Root Beer",'S',0.99);

        Beverage lSprite = new Beverage("Large Sprite",'L',4.99);
        Beverage mSprite = new Beverage("Medium Sprite",'M',2.99);
        Beverage sSprite = new Beverage("Small Sprite",'S',0.99);

        Beverages.AddBeverage(lCoke);
        Beverages.AddBeverage(mCoke);
        Beverages.AddBeverage(sCoke);

        Beverages.AddBeverage(lDietCoke);
        Beverages.AddBeverage(mDietCoke);
        Beverages.AddBeverage(sDietCoke);

        Beverages.AddBeverage(lDrPepper);
        Beverages.AddBeverage(mDrPepper);
        Beverages.AddBeverage(sDrPepper);

        Beverages.AddBeverage(lLemonade);
        Beverages.AddBeverage(mLemonade);
        Beverages.AddBeverage(sLemonade);

        Beverages.AddBeverage(lRootBeer);
        Beverages.AddBeverage(mRootBeer);
        Beverages.AddBeverage(sRootBeer);

        Beverages.AddBeverage(lSprite);
        Beverages.AddBeverage(mSprite);
        Beverages.AddBeverage(sSprite);
    }
    }
