import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private static Persons myPeople = new Persons();
    private JButton login;
    private JButton cancelButton;
    private JPasswordField passwordField1;


    public Login() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        myPeople.load();


    }

    public boolean checkPassword(String email, String password){
        int id= myPeople.findID(email);
        if(id==-1){
            return false;
        }else if (myPeople.getPassword(id)!=password){
            return false;
        }
        return true;
    }


}
