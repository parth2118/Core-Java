import java.util.*;

public class Exception_Handling_Answer_1 {
	public static void main(String[] args)
	{
		int i=0,sum=0,n=0;
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		n=scr.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++)
		{
			try
			{
				System.out.print("Enter the integer to be stored: ");
				arr[i]=scr.nextInt();	
				sum=sum+arr[i];
				if(i==n-1)
				{
					System.out.println("\nArithmetic mean: "+(sum/n));
				}	
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
				System.out.println("Arithmetic exception encountered.");
			}
		}
	}
}