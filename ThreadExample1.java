/*
Thread is a execution path of program. When main program get execute OS system create process ID for active program and same PID (Process ID) followed by a thread.
*/

class ThreadExample1 extends Thread
{
	
	public void run() 	// thread
	{  
		try
		{
			for(int i=1;i<=4;i++)
			{
				Thread.sleep(2000);
				System.out.println("thread is running...");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error...." +e);
		}
	}  
	public void disp()	// member function
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Class Member Function");
		}
	}
	public static void main(String args[]) throws Exception
	{  
		ThreadExample1 t1=new ThreadExample1();  
		t1.start();  
		// start() method is predefine method of thread class use to execute run() method of thread class
		Thread.sleep(3000);
		t1.disp();
 	}  
}


  