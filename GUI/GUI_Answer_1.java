import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame
{
    static public JTextArea n1;
    static public JTextField  n4;
    gui()
    {
        addbuttonhandler a=new addbuttonhandler();
        clearbuttonhandler b=new clearbuttonhandler();
       
        n1=new JTextArea(20,20);
        JButton n2=new JButton("ADD");
        JButton n3=new JButton("CLEAR");
        n4=new JTextField(20);
        add(n1);
        add(n4);
        add(n2);
        add(n3);
        n2.addActionListener(a);
        n3.addActionListener(b);
        setTitle("GUI_Answer_1");
        setSize(300,450);
        setLocation(20,30);
        setVisible(true);
        setLayout(new FlowLayout());
        validate();
    }
    
    public class addbuttonhandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            n1.append(n4.getText());
            n1.append("\n");
            n4.setText("");
        }
    }
    
    public class clearbuttonhandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            n1.setText("");
        }
    }  
}

public class GUI_Answer_1
{
    public static void main(String[] args)
    {
        gui g=new gui();
    }   
}