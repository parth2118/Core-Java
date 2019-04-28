import java.util.*;

public class Exception_Handling_Answer_2
{
	public static void main(String args[])
	{
		int ft,inch;
		double cm;
		boolean valid=false;
		do
		{
			try
			{
				Scanner scr=new Scanner (System.in);
				System.out.print("Enter the length in Feet: ");
				ft=scr.nextInt();
				if(ft<0)
				{
					throw new InputMismatchException();
				}
				System.out.print("Enter the length in inches: ");
				inch=scr.nextInt();
				if(inch<0 || inch>=12)
				{
					throw new InputMismatchException();
				}
				valid=true;
				inch=(ft*12)+inch;
				cm=inch*2.54;
				System.out.println("\nThe Equivalent length in inches: "+inch);
				System.out.println("The Equivalent length in centimeters: "+cm);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Encountered Exception"+"\nInvalid data entered\n"+e.toString());
				System.out.println("\nRe-enter set of numbers\n");
			}
		}while(!valid);
	}
}
