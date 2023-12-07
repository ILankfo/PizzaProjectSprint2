import java.util.ArrayList;
public class Beverages {
        ArrayList <Beverage> myBeverages= new ArrayList<Beverage>();
        Beverages(){}

        //grabs beverage object based on id
        public Beverage getBev(int bevNum){return myBeverages.get(bevNum);}


    //initializes an arraylist of Crusts to replicate a SQL table
    public void load() {
        Beverage lCoke = new Beverage("Large Coke",'L',4.55);
        Beverage mCoke = new Beverage("Medium Coke",'M',2.55);
        Beverage sCoke = new Beverage("Small Coke",'S',0.55);

        Beverage lDietCoke = new Beverage("Large Diet Coke",'L',4.55);
        Beverage mDietCoke = new Beverage("Medium Diet Coke",'M',2.55);
        Beverage sDietCoke = new Beverage("Small Diet Coke",'L',0.55);

        Beverage lDrPepper = new Beverage("Large Dr.Pepper",'L',4.55);
        Beverage mDrPepper = new Beverage("Medium Dr.Pepper",'M',2.55);
        Beverage sDrPepper = new Beverage("Small Dr.Pepper",'S',0.55);

        Beverage lLemonade = new Beverage("Large Lemonade",'L',4.55);
        Beverage mLemonade = new Beverage("Medium Lemonade",'M',2.55);
        Beverage sLemonade = new Beverage("Small Lemonade",'S',0.55);

        Beverage lRootBeer = new Beverage("Large Root Beer",'L',4.55);
        Beverage mRootBeer = new Beverage("Medium Root Beer",'M',2.55);
        Beverage sRootBeer = new Beverage("Small Root Beer",'S',0.55);

        Beverage lSprite = new Beverage("Large Sprite",'L',4.55);
        Beverage mSprite = new Beverage("Medium Sprite",'M',2.55);
        Beverage sSprite = new Beverage("Small Sprite",'S',0.55);

       myBeverages.add(lCoke);
         myBeverages.add(mCoke);
         myBeverages.add(sCoke);

         myBeverages.add(lDietCoke);
         myBeverages.add(mDietCoke);
         myBeverages.add(sDietCoke);

         myBeverages.add(lDrPepper);
         myBeverages.add(mDrPepper);
         myBeverages.add(sDrPepper);

         myBeverages.add(lLemonade);
         myBeverages.add(mLemonade);
         myBeverages.add(sLemonade);

         myBeverages.add(lRootBeer);
         myBeverages.add(mRootBeer);
         myBeverages.add(sRootBeer);

         myBeverages.add(lSprite);
         myBeverages.add(mSprite);
         myBeverages.add(sSprite);
    }
    }
