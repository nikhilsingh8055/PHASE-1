package assignmentproject;
public class MyRunnableThread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		MyRunnableThread mt = new  MyRunnableThread();
  		mt.start();
 	}
}


	              
