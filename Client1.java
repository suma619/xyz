
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Client1 {
    static  String host="localhost";
    public static void main(String args[]) throws IOException
    {
            
        try {
           Socket s = new Socket(host,10000);
        
            System.out.println("Connected"+s);
            DataInputStream dis = new DataInputStream(System.in);
    
            PrintStream out=new PrintStream(s.getOutputStream());
            while(true)
                
            {
                System.out.println("Enter A message");
                String data = dis.readLine();
                out.println(data);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}