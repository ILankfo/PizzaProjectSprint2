import java.util.ArrayList;
import java.util.Objects;

public class Persons {
    static ArrayList <Person> myPeople=new ArrayList<Person>();


    Persons(){}

    //Adds person to Array list. the quick and dirty ID increments as a new person is added,
    // so the ID is the same as the index
    public static void AddPerson(Person myPerson){
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
    //takes the Email and returns the ID of that person. if it doesn't exist
    //returns -1
    public int findID(String Email){
        for (int i = 0; i < myPeople.size(); i++) {
            if(Objects.equals(myPeople.get(i).Email, Email)){
                return myPeople.get(i).id;
            }
        }
        return -1;
    }
    public int getSize(){
        return myPeople.size();
    }
    //returns Person object to pass to other GUI forms
    public Person getPerson(int id){
        return myPeople.get(id);
    }
    //initializes an arraylist of people to replicate a SQL table
    public void load(){
       Person person1= new Person("James Baxter","2345 Horse way, Marietta, GA", "JBax@gmail.com", "@nimationBoy1", "2345-1234-5674-2343");
       Persons.AddPerson(person1);
        Person person2= new Person("Mason Jarson","723 Glass way, Kennesaw GA", "MDixon@gmail.com", "Sh@tterSpree", "7425-1334-5364-3224");
        Persons.AddPerson(person2);
        Person person3= new Person("Henry Timms","5632 Bootstrap way, Kennesaw GA", "HTims@gmail.com", "B00tsB0y", "4275-1343-5643-0986");
        Persons.AddPerson(person3);
    }
}
