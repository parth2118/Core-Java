import java.util.Scanner;
public class Problem_13{
	static int[] deleteElement()
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int a=scr.nextInt();
		int[] x=new int[a];
		int[] y=new int[a];
		System.out.println("Enter the elements: ");
		for(int i=0;i<x.length;i++)
		{
			x[i]=scr.nextInt();
		}
		System.out.println("Original Array: ");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!=0)
			{
				System.out.print(x[i]+" ");
			}
		}
		System.out.print("\n\nEnter the element u want to delete from the array: ");
		int b=scr.nextInt();
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!=b)
			{
				y[i]=x[i];
			}
		}
		return y;
	}
	public static void main(String[] args) {
		int[] z=deleteElement();
		System.out.println("New Array: ");
		for(int i=0;i<z.length;i++)
		{
			if(z[i]!=0)
			{
				System.out.print(z[i]+" ");
			}
		}
	}
}
