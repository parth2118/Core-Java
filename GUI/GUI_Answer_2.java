import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMenuFrame extends JFrame
{
    MyMenuFrame()
    {
        quit a1 = new quit();
        erase e1 = new erase();
        red r = new red();
        green g = new green();
        blue bl = new blue();
        pink p = new pink();
        black b = new black();
       
        JMenuBar menu = new JMenuBar();
        menu.setSize(100, 50);
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu color = new JMenu("Color");
        
        JMenuItem quit = new JMenuItem("Quit");
        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem blue = new JMenuItem("Blue");
        JMenuItem pink = new JMenuItem("Pink");
        JMenuItem black = new JMenuItem("Black");
        
        quit.addActionListener(a1);
        clear.addActionListener(e1);
        red.addActionListener(r);
        green.addActionListener(g);
        blue.addActionListener(bl);
        pink.addActionListener(p);
        black.addActionListener(b);
        
        file.add(quit);
        edit.add(clear);
        color.add(red);
        color.add(green);
        color.add(blue);
        color.add(pink);
        color.add(black);
        
        menu.add(file);
        menu.add(edit);
        menu.add(color);
        
        add(menu);
        
        setSize(200,200);
        setLocation(0,0);
        setVisible(true);
        setTitle("Menu");
        validate();
        
        setJMenuBar(menu);
    }
    
    public class quit implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            System.exit(0);
        }
    }
    
    public class erase implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            getContentPane().setBackground(Color.WHITE);
        }
    }
    
    public class red implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            getContentPane().setBackground(Color.RED);
        }
    }
    
    public class green implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            getContentPane().setBackground(Color.GREEN);
        }
    }
    
    public class blue implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            getContentPane().setBackground(Color.BLUE);
        }
    }
    public class pink implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            getContentPane().setBackground(Color.PINK);
        }
    }
    
    public class black implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            getContentPane().setBackground(Color.BLACK);
        }
    }
}

public class GUI_Answer_2 
{
    public static void main(String[] args) 
    {
       MyMenuFrame m=new MyMenuFrame(); 
    }
    
}

