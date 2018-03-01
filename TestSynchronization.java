/*
Synchronization in Java
Synchronization in java is the capability to control the access of multiple threads to any shared resource.
Java Synchronization is better option where we want to allow only one thread to access the shared resource.

Java synchronized method
If you declare any method as synchronized, it is known as synchronized method.
Synchronized method is used to lock an object for any shared resource.
When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.


//example of java synchronized method  
class Table
{  
	synchronized void printTable(int n)  	//synchronized method  
	{
		for(int i=1;i<=5;i++)
		{  
			System.out.println(n*i);  
			try
			{  
				 Thread.sleep(500);  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}  
		}  
	}  
}  
class MyThread1 extends Thread
{  
	Table t;  
	MyThread1(Table t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.printTable(5);  
	}  
}  
class MyThread2 extends Thread
{  
	Table t;  
	MyThread2(Table t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.printTable(100);  
	}  
}  
public class TestSynchronization
{  
	public static void main(String args[])
	{  
		Table obj = new Table();	//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t2.start();  
		t1.start();  
	}  
}  
*/


/*
Synchronized block in java
Synchronized block can be used to perform synchronization on any specific resource of the method.
Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use synchronized block. If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.

Points to remember for Synchronized block
      - Synchronized block is used to lock an object for any shared resource.
      - Scope of synchronized block is smaller than the method.
*/

class Table
{  
	void printTable(int n)
	{  
		System.out.println("Sync Block....");
		System.out.println("Sync Block....");
		synchronized(this)
		{		
			//synchronized block  
			for(int i=1;i<=5;i++)
			{  
				System.out.println(n*i);  
				try
				{  
					Thread.sleep(500);  
				}
				catch(Exception e)
				{
					System.out.println(e);
				}  
     			}  
   		}  
	}//end of the method  
}  
  
class MyThread1 extends Thread
{  
	Table t;  
	MyThread1(Table t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.printTable(5);  
	}  
  
}  
class MyThread2 extends Thread
{  
	Table t;  
	MyThread2(Table t)
	{  
		this.t=t;  
	}  
	public void run()
	{  
		t.printTable(100);  
	}  
}  
  
public class TestSynchronization
{  
	public static void main(String args[])
	{  
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}  
}  


/*
Limitation of Multi-threading
1. Race Condition: If in a program synchronized concept implement in such case one thread can work at a time.
2. Deadlock Condition: Where all thread waiting for each other to complete a task.
3. Lock Starvation: Thread task get delayed due to low priority.

Inter-thread communication in Java
Inter-thread communication or Co-operation is all about allowing synchronized threads to COMMUNICATE with each other.

Four types of final methods of Object class are used to perform inter-communication between threads i.e. wait(), notify(), notifyall() and yield().

wait() method
Causes current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.

notify() method
Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this object, one of them is chosen to be awakened.

notifyAll() method
Wakes up all threads that are waiting on this object's monitor. 


Syntax: public final void notifyAll()

*/








