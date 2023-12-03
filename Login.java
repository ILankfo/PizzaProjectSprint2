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

        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
        Cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });



    }
    private void onOK() {
       if(checkPassword(passwordField1.getText(),passwordField2.getText())){
        dispose();
       }else {

           return;
       }
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
    public static void main(String[] args) {
        myPeople.load();
        new Login();



    }

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
