
import java.io.DataInputStream;
import java.net.ServerSocket;
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
public class Server1 implements Runnable 
{
    Socket client;
    Server1(Socket s)
    {
        client=s;
        System.out.println("Client connection"+s);
        Thread t=new Thread();
        t.start();
    }
    public void run()
    {
        DataInputStream in;
        try
        {
            in=new DataInputStream(client.getInputStream());
            while(true)
            {
                String data=in.readLine();
                System.out.println("Recieved from file"+data);
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String args[])
    {
        ServerSocket listen;
        try{
            listen=new ServerSocket(10000);
            System.out.println("Server ready"+listen);
            while(true)
            {
                Socket s=listen.accept();
                new Server1(s);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}