/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hi
 */
import java.util.*;
import java.lang.*;
class Rsa 
{
     public static  long solve(long a, long b)
    {
        long x = 0, y = 1, lastx = 1, lasty = 0, temp,req,x1;
        x1=a;
        
        while (b != 0)
        {
            long q = a / b;
            long r = a % b;
 
            a = b;
            b = r;
 
            temp = x;
            x = lastx - q * x;
            lastx = temp;
 
            temp = y;
            y = lasty - q * y;
            lasty = temp;            
        }
      
         req=lasty;
         if(req>0)
         {
            return lasty; 
         }
         else
         {
           return (x1+lasty);
         }
    }
     public static long modular(long x, long y, long N) 
   {
    if(y == 0)
    {
        return 1;
    }
    long z = modular(x, Math.abs(y/2), N);

    if(y % 2 == 0)
{
    return (long) ((Math.pow(z, 2)) % N);
}
    return (long) ((x * Math.pow(z, 2)) % N);
   }
    public static void main(String args[])
    {
        int p,q,n,x,m;
        int e;
      long m2;
double c2;
        System.out.println("enter any  two co prime nos");
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("enter the public key");
         e=sc.nextInt();
        System.out.println("enter a  number which sender has to send");
         m=sc.nextInt();
        n=p*q;
        x=(p-1)*(q-1);
       
   long d=solve(x,e);
        //   int d2=(int)(d);
        System.out.println("The value of d is: "+d);
         
        c2=Math.pow(m,e)%n;
        long c=(long)(c2);
        System.out.println("the encrypted form of"+m+" is "+c);
        System.out.println("the vaue of n is"+n );
         long mod=modular(c,d,n);
     
        System.out.println("receiver decrypts the message as "+mod);
        
    }
    
}
