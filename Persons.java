import java.util.ArrayList;

public class Persons {
    ArrayList <Person> myPeople;


    Persons(){}

    public void AddPerson(Person myPerson){
        myPeople.add(myPerson);
    }

    public String getName(int Id){
        return myPeople.get(Id).name;
    }

    public String getEmail(int Id){
        return myPeople.get(Id).name;
    }

    public String getPassword(int Id){
        return myPeople.get(Id).Password;
    }

    public int findID(String Email){
        for (int i = 0; i < myPeople.size(); i++) {
            if(myPeople.get(i).Email== Email){
                return myPeople.get(i).id;
            }
        }
        return -1;
    }
}
