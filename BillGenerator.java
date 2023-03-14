import javax.swing.*;
import java.awt.*;

public class BillGenerator {

    public static void gui()
    {
        JFrame frame = new JFrame("Bill Generator");
        frame.setLayout(null);
        frame.setSize(600,500);
        ImageIcon image= new ImageIcon("C:\\Users\\91876\\Downloads\\bank.png");

        JLabel userimage = new JLabel(image);
        userimage.setBounds(10,30,140,300);
        frame.add(userimage);

        JPanel panel = new JPanel();
        panel.setBounds(180,30,400,400);
        panel.setLayout(null);
        panel.setBackground(Color.cyan);
        frame.add(panel);

        JLabel label = new JLabel(" New User :");
        label.setBounds(140,10,200,40);
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setForeground(Color.RED);
        panel.add(label);

        JLabel user = new JLabel("  UserName :");
        user.setBounds(35,50,130,40);
        user.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(user);

        JTextField usertf = new JTextField();
        usertf.setBounds(170,55,220,30);
        panel.add(usertf);

        JLabel email  = new JLabel("   Email_ID  :");
        email.setBounds(35,100,130,40);
        email.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(email);

        JTextField emailtf = new JTextField();
        emailtf.setBounds(170,104,220,30);
        panel.add(emailtf);

        JLabel pass  = new JLabel("Set Password:");
        pass.setBounds(10,145,140,40);
       pass.setFont(new Font("Arial",Font.BOLD,20));
        panel.add(pass);

        JTextField passtf = new JTextField();
        passtf.setBounds(170,149,220,30);
        panel.add(passtf);

        JButton submit = new JButton("Submit");
        submit.setBounds(190,210,100,40);
       submit.setBackground(new Color(10, 83, 90));
        panel.add(submit);

        JLabel label1 = new JLabel("If You Already have an Account ");
        label1.setBounds(100,270,370,20);
        label1.setForeground(Color.RED);
        label1.setFont(new Font("Arial",Font.BOLD,15));
        panel.add(label1);

        JLabel label2 = new JLabel("Please Click on LogIn Button");
        label2.setBounds(100,300,370,20);
        label2.setForeground(Color.RED);
        label2.setFont(new Font("Arial",Font.BOLD,15));
        panel.add(label2);

        JButton login = new JButton("LogIn");
        login.setBounds(190,340,100,40);
        login.setBackground(new Color(38, 56, 43));
        panel.add(login);

        login.addActionListener(e -> {
            frame.setVisible(false);

            Frame frame1 = new JFrame("TCG_Bank");
            frame1.setLayout(null);
            frame1.setSize(600,500);
            ImageIcon image1= new ImageIcon("C:\\Users\\91876\\Downloads\\bank.png");

            JLabel userimage1 = new JLabel(image1);
            userimage1.setBounds(10,30,140,300);
            frame1.add(userimage1);

            JPanel panel2 = new JPanel();
            panel2.setBounds(180,30,400,400);
            panel2.setLayout(null);
            panel2.setBackground(Color.lightGray);
            frame1.add(panel2);

            ImageIcon image2= new ImageIcon("C:\\Users\\91876\\Downloads\\loginlogo.png");
            JLabel label3 = new JLabel(image2);
            label3.setBounds(80,20,300,40);
            panel2.add(label3);

            JLabel user1 = new JLabel("  UserName :");
            user1.setBounds(35,80,130,40);
            user1.setFont(new Font("Arial",Font.BOLD,20));
            panel2.add(user1);

            JTextField usertf1 = new JTextField();
            usertf1.setBounds(170,85,220,30);
            panel2.add(usertf1);

            JLabel password  = new JLabel("   Password  :");
            password.setBounds(35,140,130,40);
            password.setFont(new Font("Arial",Font.BOLD,20));
            panel2.add(password);

            JTextField passwordtf = new JTextField();
            passwordtf.setBounds(170,144,220,30);
            panel2.add(passwordtf);

            JButton submit1 = new JButton("Submit");
            submit1.setBounds(190,210,100,40);
            panel2.add(submit);

            frame1.setVisible(true);

        });

        frame.setVisible(true);

    }

    public static void main(String[] args) {

        gui();
    }

}