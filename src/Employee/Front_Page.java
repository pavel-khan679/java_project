
package Employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

public class Front_Page implements ActionListener{
     JFrame f; 
    JLabel id,l1;
    JButton b;

    Front_Page(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.green);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icons/front.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1100,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,100,1230,610);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        

        b.setBounds(510,550,220,55);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1250,650);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(68,13,1250,100);
        lid.setFont(new Font("calibri",Font.ITALIC,62));
        lid.setForeground(Color.blue);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1250,650);
        f.setLocation(180,90);

        while(true){
            lid.setVisible(false);
            try{
                Thread.sleep(500); 
            }catch(Exception e){} 
            lid.setVisible(true);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new login();    
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
    
}
