public class Person {
    String Address;
    String name;
    String Email;
    String Password;
    String cardnum;
    static int maxID =0;
    int id;
           //creates empty person
            Person(){

            }
            Person(String newName,String newAddress,String newEmail,String newPassword,String newCard){
                id=maxID++;
                name=newName;
                Address=newAddress;
                Email =newEmail;
                Password=newPassword;
                cardnum=newCard;
            }
}
