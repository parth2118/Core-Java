import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Answer_3 extends JFrame
{
    JLabel mc,me,mx,mp,mr,md,mm,kp,kr,kt,dp,et;
    JTextField tf;
    GUI_Answer_3()
    {
        mc = new JLabel("Mouse Clicked");
        me = new JLabel("Mouse Entered");
        mx = new JLabel("Mouse Exited");
        mp = new JLabel("Mouse Pressed");
        mr = new JLabel("Mouse Released");
        md = new JLabel("Mouse Dragged");
        mm = new JLabel("Mouse Moved");
        kp = new JLabel("Key Pressed");
        kr = new JLabel("Key Released");
        kt = new JLabel("Key Typed");
        dp = new JLabel();
        tf = new JTextField();
        
        mc.setBounds(200, 50, 100, 20);
        me.setBounds(200, 80, 100, 20);
        mx.setBounds(200, 110, 100, 20);
        mp.setBounds(200, 140, 100, 20);
        mr.setBounds(200, 170, 100, 20);
        md.setBounds(200, 200, 100, 20);
        mm.setBounds(200, 230, 100, 20);
        kp.setBounds(200, 260, 100, 20);
        kr.setBounds(200, 290, 100, 20);
        kt.setBounds(200, 320, 100, 20);
        dp.setBounds(200, 360, 100, 20);
        tf.setBounds(190, 400, 120, 20);
        
        add(mc);
        add(me);
        add(mx);
        add(mp);
        add(mr);
        add(md);
        add(mm);
        add(kp);
        add(kr);
        add(kt);
        add(dp);
        add(tf);
        
        mouselistener ml = new mouselistener();
        addMouseListener(ml);
        
        mousemotion mml = new mousemotion();
        addMouseMotionListener(mml);
        
        keylistener kl = new keylistener();
        tf.addKeyListener(kl);
                
        setTitle("MOUSE&KEY");
        setSize(500, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        validate();
    }
        
    public void setDefault()
    {
        mc.setForeground(Color.DARK_GRAY);
        me.setForeground(Color.DARK_GRAY);
        mx.setForeground(Color.DARK_GRAY);
        mp.setForeground(Color.DARK_GRAY);
        mr.setForeground(Color.DARK_GRAY);
        md.setForeground(Color.DARK_GRAY);
        mm.setForeground(Color.DARK_GRAY);
        kp.setForeground(Color.DARK_GRAY);
        kr.setForeground(Color.DARK_GRAY);
        kt.setForeground(Color.DARK_GRAY);
    }
        
    class mousemotion implements MouseMotionListener
    {
        public void mouseMoved(MouseEvent e) 
        {
            setDefault();
            mm.setForeground(Color.BLUE);
            dp.setText(e.getX()+" X "+e.getY());            
        }
        public void mouseDragged(MouseEvent e) 
        {
        	setDefault();
            md.setForeground(Color.BLUE);
        }
    }
    
    class mouselistener implements MouseListener
    {
        public void mouseClicked(MouseEvent e) 
        {
                    setDefault();
                    mc.setForeground(Color.BLUE);
        }
        public void mouseEntered(MouseEvent e) {
                    setDefault();
                    me.setForeground(Color.BLUE);
        }
        public void mouseExited(MouseEvent e) {
                    setDefault();
                    mx.setForeground(Color.BLUE);
        }
        public void mousePressed(MouseEvent e) 
        {
                    setDefault();
                    mp.setForeground(Color.BLUE);   
        }
        public void mouseReleased(MouseEvent e) 
        {
                    setDefault();
                    mr.setForeground(Color.BLUE);
        }
    }
    
    class keylistener implements KeyListener
    {
        public void keyPressed(KeyEvent e) 
        {
            setDefault();
            kp.setForeground(Color.BLUE);
            dp.setText(Integer.toString(e.getKeyCode())); 
        }
        public void keyReleased(KeyEvent e) 
        {
                    setDefault();
                    kr.setForeground(Color.BLUE);   
        }
        public void keyTyped(KeyEvent e) 
        {
        	setDefault();        
        	kt.setForeground(Color.BLUE);
        }
    }
    
    public static void main(String[] args) 
    {
        new GUI_Answer_3();
    }
}