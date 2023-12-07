import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login extends JFrame{

    private static Persons myPeople = new Persons();
    private JButton login;
    private JButton cancelButton;
    private JTextField passwordField1;
    private JButton Login;
    private JButton Cancel;
    private JPasswordField passwordField2;
    private JPanel ContentPanel;


    public Login() {
        setContentPane(ContentPanel);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        //populates people with an array list of pre generated people
        myPeople.load();
        //login listener that sends message if input is invalid
        //or grabs the person object to transfer to menu
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!onOK()){
                    JOptionPane.showMessageDialog(Login.this,"not a valid Email or Password");
                }else {
                    new Menu();
                    int id=myPeople.findID(passwordField1.getText());
                    Menu.myPerson=myPeople.getPerson(id);
                }
            }
        });
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });



    }
    //checks and verifys password and email
    private boolean onOK() {
       if(checkPassword(passwordField1.getText(),passwordField2.getText())){

        return true;
       }else {

           return false;
       }
    }
    //closes page
    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
    public static void main(String[] args) {
        new Login();
    }
    //searches person array for the input email, then if exists checks password accuracy
    public boolean checkPassword(String email, String password){
        int id= myPeople.findID(email);
        if(id==-1){
            return false;
        }else if (!Objects.equals(myPeople.getPassword(id), password)){
            return false;
        }
        return true;
    }
}
