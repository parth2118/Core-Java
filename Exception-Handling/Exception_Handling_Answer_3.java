import java.util.*;

import javax.rmi.ssl.SslRMIClientSocketFactory;

class InvalidHrExcep extends Exception
{
	private int hr;
	InvalidHrExcep(int hr)
	{
		this.hr=hr;
	}
	public String toString()
	{
		return ("Entered hours value is invalid ("+hr+").");
	}
}

class InvalidMinExcep extends Exception
{
	private int min;
	InvalidMinExcep(int min)
	{
		this.min=min;
	}
	public String toString()
	{
		return ("Entered minutes value is invalid ("+min+").");
	}
}

class InvalidSecExcep extends Exception
{
	private int sec;
	InvalidSecExcep(int sec)
	{
		this.sec=sec;
	}
	public String toString()
	{
		return ("Entered seconds value is invalid ("+sec+").");
	}
}

public class Exception_Handling_Answer_3
{
	public static void main(String[] args)
	{
		int hr,min,sec;
		String st;
		boolean valid=false;
		do
		{
			try
			{
				Scanner scr=new Scanner(System.in);
				System.out.println("Enter time in 12-hour format:- ");
				System.out.print("Enter hours: ");
				hr=scr.nextInt();
				if(hr<0 || hr>=12)
				{
					throw new InvalidHrExcep(hr);
				}
				System.out.print("Enter minutes: ");
				min=scr.nextInt();
				if(min<0 || min>=60)
				{
					throw new InvalidMinExcep(min);
				}
				System.out.print("Enter seconds: ");
				sec=scr.nextInt();
				if(sec<0 || sec>=60)
				{
					throw new InvalidSecExcep(sec);
				}
				valid=true;
				System.out.print("AM / PM: ");
				st=scr.next();
				if(st.equalsIgnoreCase("AM"))
				{
					System.out.println("\nTime(in 24-hour format): "+hr+":"+min+":"+sec);
				}
				else
				{
					System.out.println("\nTime(in 24-hour format): "+(hr+12)+":"+min+":"+sec);
				}
			}
			catch(InvalidHrExcep h)
			{
				System.out.println("Encountered Exception\n"+h.toString());
				System.out.println("\nRe-enter the respective values\n");
			}
			catch(InvalidMinExcep m)
			{
				System.out.println("Encountered Exception\n"+m.toString());
				System.out.println("\nRe-enter the respective values\n");
			}
			catch(InvalidSecExcep s)
			{
				System.out.println("Encountered Exception\n"+s.toString());
				System.out.println("\nRe-enter the respective values\n");
			}
			catch(InputMismatchException e)
			{
				System.out.println("Encountered Exception"+"\nInvalid data entered\n"+e.toString());
				System.out.println("\nRe-enter the respective values\n");
			}
		}while(!valid);
	}
}
