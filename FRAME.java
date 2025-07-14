package LOOPS.GUI;
import javax.swing.*;


public class FRAME {
    public static void main(String[] args) {
        JFrame frame=new JFrame();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setResizable(true);
        frame.setLayout(null);

        //adding an icon to the frame
        ImageIcon icon=new ImageIcon("tabo.jpg");
        frame.setIconImage(icon.getImage());

        //adding a username label to the frame
        JLabel username= new JLabel("USERNAME");
        username.setBounds(30,30,100,25);
        frame.add(username);
        //addimg a textfield to the username label
        JTextField inputUser=new JTextField();
        inputUser.setBounds(150,30,150,25);
        frame.add(inputUser);

        //adding a password label to the frame
        JLabel password=new JLabel("PASSW0RD");
        password.setBounds(30,70,70,25);
        frame.add(password);

        //addding a password textfield to the the frame
        JPasswordField inoutPassword=new JPasswordField();
        inoutPassword.setBounds(150,70,150,25);
        frame.add(inoutPassword);

        //adding a button to the frame  
        JButton button =new JButton("login");
        button.setBounds(120,110,100,30);

        //adding a button t0 the frame
        frame.add(button);
        frame.setVisible(true);


    }
}
