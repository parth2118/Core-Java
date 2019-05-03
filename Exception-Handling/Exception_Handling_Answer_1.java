import java.util.*;

public class Exception_Handling_Answer_1
{
	public static void main(String[] args) throws Exception
	{
		int i=0,sum=0,n=0;
		boolean valid=false;
		Scanner scr=new Scanner(System.in);
		do
		{
			System.out.print("Enter the size of array: ");
			n=scr.nextInt();
			int[] arr = new int[n];
			try
			{
				if (n == 0) 
				{
					throw new ArithmeticException();
				}
				sum = 0;
				for(i=0;i<n;i++)
				{
					System.out.print("Enter the integer to be stored: ");
					arr[i]=scr.nextInt();	
					sum=sum+arr[i];
					if(i==n-1)
					{
						System.out.println("\nArithmetic mean: "+(sum/n));
					}
				}
				valid=true;
			}
			catch(InputMismatchException e)
			{
				scr.next();
				System.out.println("\nInserted value is not an integer. Please enter a valid input.\n");
				i--;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid array index.");
			}
			catch(ArithmeticException e)
			{
				System.out.println("\nArithmetic exception encountered.\n");
			}
		}while(!valid);
	}
}