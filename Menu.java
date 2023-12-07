import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame{
    private JPanel MainBody;
    private JPanel crusts;
    private JPanel toppings;
    private JPanel beverages;
    private JPanel Size;
    private JLabel PizzaName;
    private JButton addPizzaButton;
    private JButton Checkout;
    private static Toppings myToppings = new Toppings();

    private static Beverages myBeverages = new Beverages();

    private static Receipt myReceipt = new Receipt();
    public static Person myPerson= new Person();
    private static Crusts myCrusts= new Crusts();

    private static Pizzas myPizza=new Pizzas();


    private static pizzaSizes mySizes=new pizzaSizes();
    private static int numtoppings=0;

    Menu(){
        setContentPane(MainBody);
        setTitle("Pizza Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 900);
        setLocationRelativeTo(null);
        setVisible(true);
        mySizes.Load();//populates array list with sizes
        myToppings.Load();//populates array list with toppings
        myCrusts.Load();//populates array list with crusts
        myBeverages.load();//populates array list with beverages
        Size.setLayout(new GridLayout(2,2));
        crusts.setLayout(new GridLayout(2,2));
        toppings.setLayout(new GridLayout(2,4));
        beverages.setLayout(new GridLayout(5,4));
        //creates buttons for each Size item,an event listener that changes the Size
        for (int i = 0; i <4 ; i++) {
            pizzaSize SizeVar=mySizes.getpizzaSize(i);
            JButton button = new JButton(SizeVar.name+" $"+SizeVar.price);
            button.setMaximumSize(new Dimension(15,15));
            Size.add(button);
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    myPizza.addSize(SizeVar);
                    JOptionPane.showMessageDialog(MainBody,"Size set to "+SizeVar.name);
                    PizzaName.setText(myPizza.getName());

                }
            });
        }
        //creates buttons for each crust item,an event listener that changes the crust type
        for (int i = 0; i <4 ; i++) {
            Crust CrustVar=myCrusts.getCrust(i);
            JButton button = new JButton(CrustVar.CrustName+" $"+CrustVar.price);
            button.setMaximumSize(new Dimension(15,15));
            crusts.add(button);
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    myPizza.addCrust(CrustVar);
                    JOptionPane.showMessageDialog(MainBody,"Crust set to "+CrustVar.CrustName);
                    PizzaName.setText(myPizza.getName());

                }
            });
        }
        //creates a button for each beverage and size combination, plus listener that adds it to receipt array
        for (int i = 0; i <myBeverages.getNumberOfOptions() ; i++) {
            Beverage BevVar=myBeverages.getBev(i);
            JButton button = new JButton(BevVar.bevName+" "+BevVar.bevSize+" $"+BevVar.bevPrice);
            button.setMaximumSize(new Dimension(15,15));
            beverages.add(button);
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    myReceipt.addBeverages(BevVar);
                    JOptionPane.showMessageDialog(MainBody,"Added "+BevVar.bevName+" to your cart");

                }
            });
        }
        //creates buttons for each topping item,an event listener that either removes toppings
        //or adds them based on if they are already on the pizza
        for (int i = 0; i <8 ; i++) {
            Topping ToppingVar=myToppings.getTopping(i);
            JButton button = new JButton(ToppingVar.toString());
            button.setMaximumSize(new Dimension(15,15));
            toppings.add(button);
            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    ArrayList<Topping> currentToppings=myPizza.getToppingsArray();
                    if(currentToppings.contains(ToppingVar)){
                        myPizza.removeTopping(ToppingVar);
                        JOptionPane.showMessageDialog(MainBody,"Removed "+ToppingVar.getName()+"from Pizza");
                        PizzaName.setText(myPizza.getName());
                        numtoppings--;
                    } else if (numtoppings>=4) {
                        JOptionPane.showMessageDialog(MainBody,"No more than four toppings! don't be greedy!");
                    }else {
                    myPizza.addToppings(ToppingVar);
                    PizzaName.setText(myPizza.getName());
                    numtoppings++;
                    }

                }
            });
        }
        //adds pizza to the array list in the Receipt
        addPizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(myPizza.crustType==null){
                    JOptionPane.showMessageDialog(MainBody,"Can't make a pizza with no Crust! maybe?");
                } else if (myPizza.pizzaSize==null) {
                    JOptionPane.showMessageDialog(MainBody,
                            "Please select a Size, toppings are tastier on bread");
                }else{
                myReceipt.addPizza(myPizza);
                JOptionPane.showMessageDialog(MainBody,"Adding "+myPizza.getName()+" to your cart");
                myPizza=new Pizzas();
                myPizza.removeAll();
                PizzaName.setText("");
                numtoppings=0;
                }
            }
        });
        //transfers reciept and person info to next page
        Checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RecieptPage.myReceipt= myReceipt;
                RecieptPage.myPerson=myPerson;
                new RecieptPage();

                dispose();
            }
        });
    }

}
