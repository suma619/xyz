/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author hi
 */
 class JavaApplication1 extends Thread
{
    JTextField tf;
    JLabel jl;
    JFrame jf;
    
    public void run()
    {
            BuildGui();
    }
    void display()
    {
        for(int i=10;i>=0;i--)
        {
            try
            {
                Thread.sleep(1000);
            String s=Integer.toString(i);
            tf.setText("   "+s+" seconds to go "+"  ");
            
             }
            catch (Exception e)
            {
                   System.out.println(e);
            }
        }
        JOptionPane.showMessageDialog(jf,"time up !!!!");
        tf.setText("");
        tf.setEnabled(false);
        
        
        
    }
    
    
     public void BuildGui()
     {
         jf=new JFrame("countdown timer");
          JPanel p=new JPanel();
          jl=new JLabel("");
          tf=new JTextField(15);
          tf.setEnabled(false);
          Font f=new Font("Verdana",0,18);
          tf.setFont(f);
          tf.setBackground(Color.BLACK);
          p.setBackground(Color.BLUE);
          jf.add(p);
          p.add(tf);
          p.add(jl);
          jf.setVisible(true);
          jf.setSize(300, 100);
          display();
     }

 
    public static void main(String[] args) 
    {
       JavaApplication1 j1=new JavaApplication1();
       j1.start();
    }
    
}
