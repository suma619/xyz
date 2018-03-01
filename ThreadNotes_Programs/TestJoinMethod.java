/*
The join() method waits for a thread to die. In other words, it causes the another running threads to stop executing until the thread it joins will completes its task.
*/

class TestJoinMethod extends Thread
{  
	public void run()
	{  
		for(int i=1;i<=5;i++)
		{  
			try
			{  
				Thread.sleep(500);  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}  
			System.out.println(i);  
		  }  
	 }  
	public static void main(String args[])
	{  
		TestJoinMethod t1=new TestJoinMethod();  
		TestJoinMethod t2=new TestJoinMethod();  
		t1.start();  
		
		try
		{  
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		
		t2.start();  
	}  
}  
