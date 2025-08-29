package multithreading;

class Table
{
	synchronized void mTable(int n)
	{
		for(int i =1; i<=10; i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(600);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class Test11 extends Thread
{
	Table t;
	
	Test11(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.mTable(6);
	}
}
class Test22 extends Thread
{
	Table t;
	
	Test22(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.mTable(7);
	}
}
public class Ex7 
{
	public static void main(String[] args) 
	{
		Table obj = new Table();
		
		Test11 t1 = new Test11(obj);
		Test22 t2 = new Test22(obj);
		t1.start();
		t2.start();
	}

}
