import java.time.LocalTime;
import java.util.Date;

class ClockThread implements Runnable
{
	int sec = 0;
	int min = 0;
	int hour = 0;
	boolean flag = false;
	ClockThread()
	{
		LocalTime time = LocalTime.now();
		String t = String.valueOf(time);
		String[] w = t.split(":");
		this.hour = Integer.parseInt(w[0]);
		this.min = Integer.parseInt(w[1]);
		double s = Double.parseDouble(w[2]);
		this.sec = (int) Math.round(s);
	}
	void suspend()
	{
		this.flag = false;
	}
	void resume()
	{
		this.flag = true;
	}
	public void run()
	{
		for(this.sec = 0; true ; this.sec %= 60)
		{
			if(this.flag == true)
			{
				System.out.println(this.hour+" : "+this.min+" : "+this.sec);
				this.flag=false;
			}
			if(this.sec == 59)
			{
				this.min++;
			}
			if(this.min == 59)
			{
				this.min = 0;
				this.hour++;
			}
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				System.out.println(e.toString());
			}
			this.sec++;
		}
	}
}

public class Multi_Threading_Answer_3
{
	public static void main(String[] args)
	{	
		ClockThread r = new ClockThread();
		Thread t1 = new Thread(r);
		t1.start();
		while(true)
		{
			r.resume(); 
			try
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				System.out.println(e.toString()); 
			}
			r.suspend();
		}
	}
}
