import java.util.ArrayList;

public class Crusts {
    static ArrayList <Crust> CrustArrayList= new ArrayList<Crust>();

    Crusts(){}

    //initializes an arraylist of Crusts to replicate a SQL table
    public void Load(){
        Crust Crust1= new Crust("Cheesy Crust",2.00);
        CrustArrayList.add(Crust1);
        Crust Crust2= new Crust("Thin Crust",0.0);
        CrustArrayList.add(Crust2);
        Crust Crust3= new Crust("Thick Crust", 0.0);
        CrustArrayList.add(Crust3);
        Crust Crust4= new Crust("Sicilian Crust", 1.55);
        CrustArrayList.add(Crust4);
    }

   public Crust getCrust(int Index){
      return CrustArrayList.get(Index);
   }
}
