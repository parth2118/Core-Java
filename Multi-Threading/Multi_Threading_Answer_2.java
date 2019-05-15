public class Multi_Threading_Answer_2 
{
	public static void main(String[] args) throws InterruptedException
	{
		Light l = new Light();
		Thread red = new Thread(l, "Red");
		Thread green = new Thread(l, "Green");
		Thread yellow = new Thread(l, "Yellow");
		synchronized (green)
		{
			green.start();
		}
		synchronized (red)
		{
			red.start();
		}
		synchronized (yellow)
		{
			yellow.start();
		}
	}
}

class Light extends Thread
{
	public void run()
	{
		print();
	}

	void print()
	{
		while (true)
		{
			synchronized (this)
			{
				System.out.println("--- ON--- " + currentThread().getName() + " --- ON---");
				try 
				{
					sleep(3000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println("---OFF--- " + currentThread().getName() + " ---OFF---");
			}
			try
			{
				sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
