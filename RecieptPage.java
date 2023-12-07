import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RecieptPage extends JFrame{
    public static Person myPerson= new Person();
    private JPanel Receipt;
    private JLabel Name;
    private JLabel Address;
    private JPanel PizzaArea;
    private JLabel Total;
    private JButton confirmOrderButton;
    private JPanel BevrageArea;
    private JLabel CardNumber;


    static Receipt myReceipt= new Receipt();
    private static ArrayList<Pizzas> myPizzas= new ArrayList<Pizzas>();
    private static ArrayList<Beverage> myBeverages=new ArrayList<Beverage>();
    RecieptPage(){
        PizzaOptions();
        setContentPane(Receipt);
        setTitle("Receipt");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        PizzaArea.setLayout(new GridLayout(myPizzas.size(),1));
        BevrageArea.setLayout(new GridLayout(myBeverages.size(),1));
        //creates a label populated with the pizza name and price for each object in the array
        for (int i = 0; i < myPizzas.size(); i++) {
            JLabel label   =  new JLabel("Pizza" +i);
            label.setText(myPizzas.get(i).getName());
            PizzaArea.add(label);
        }
        for (int i = 0; i < myBeverages.size(); i++) {
            JLabel label   =  new JLabel("Pizza" +i);
            label.setText(myBeverages.get(i).bevName+" "+myBeverages.get(i).getBevPrice());
            BevrageArea.add(label);
        }
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        //sets receipt text to display
        Name.setText(myPerson.name+" "+myPerson.Email);
        Address.setText(myPerson.Address);
        Total.setText("Total: $"+myReceipt.Total);
        CardNumber.setText(myPerson.cardNum);
        //closes the Reciept page
        confirmOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    //allows for page to access the Arrays stored in the receipt object
    public static void PizzaOptions() {
     myPizzas=myReceipt.getMyPizzas();


        myBeverages=myReceipt.getMyBeverages();

    }



}
