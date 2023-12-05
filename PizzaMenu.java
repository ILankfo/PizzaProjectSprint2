import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaMenu extends JFrame {
    private static Pizzas myPizza = new Pizzas();
    private JLabel JLPizzaSizeOption;
    private JButton Smallbutton;
    private JPanel MainPanel;
    private JButton XLButton;
    private JButton Largebutton;
    private JButton MediumButton;
    private JButton cheesyDeluxeButton;
    private JButton meatLoversButton;
    private JButton veganPizzaButton;
    private JButton pineapplePizzaButton;
    private JButton cheesyCrustButton;
    private JButton thinCrustButton;
    private JButton normalCrustButton;

    public PizzaMenu() {
        setContentPane(MainPanel);
        setTitle("Pizza Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1500, 900);
        setLocationRelativeTo(null);
        setVisible(true);
        Smallbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.getPizzaSize(1);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Small Pizza.");
            }
        });
        MediumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.getPizzaSize(2);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Medium Pizza.");
            }
        });
        Largebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.getPizzaSize(3);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Large Pizza.");
            }
        });
        XLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.getPizzaSize(4);
                JOptionPane.showMessageDialog(PizzaMenu.this,"XL Pizza.");
            }
        });
        cheesyCrustButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.getPizzaCrust(1);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Cheesy Crust Selected.");
            }
        });
        thinCrustButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.getPizzaCrust(2);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Thin Crust Selected.");
            }
        });
        normalCrustButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.getPizzaCrust(3);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Normal Crust Selected.");
            }
        });
        cheesyDeluxeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.PizzaOptions(1);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Cheesy Deluxe Selected");
            }
        });
        meatLoversButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.PizzaOptions(2);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Meat Lovers Selected.");
            }
        });
        veganPizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.PizzaOptions(3);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Vegan Pizza Selected.");
            }
        });
        pineapplePizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myPizza.PizzaOptions(4);
                JOptionPane.showMessageDialog(PizzaMenu.this,"Pineapple Pizza Selected.");
            }
        });
    }

    public static void main(String[] args) {
        new PizzaMenu();
    }
}
