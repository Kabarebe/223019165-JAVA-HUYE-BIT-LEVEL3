package waterbillingsystem;

import javax.swing.JFrame;

import java.awt.*;

import javax.swing.*;

public class waterbillingoption extends JFrame{
	JTabbedPane tabs = new JTabbedPane();
    public waterbillingoption(String role, int userId){
        setTitle("water billing supply System");
        setSize(900,600);
        setLayout(new BorderLayout());

        if (role.equalsIgnoreCase("admin")){
            tabs.add("users", new supplypanel(userId));

        }
        else {
            tabs.add("customer", new supplypanel(userId));
        }
        setVisible(true);
        add(tabs,BorderLayout.CENTER);
    }


}
