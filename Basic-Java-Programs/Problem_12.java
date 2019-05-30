import java.util.Scanner;
public class Problem_12{
	static int[] calculateFactors()
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scr.nextInt();
		int[] x=new int[n];
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				x[i-1]=i;
			}
		}
		System.out.println("\nFactors of "+n+": ");
		return x;
	}
	public static void main(String[] args) {
		int[] z=calculateFactors(); 
		for(int i=0;i<z.length;i++)
		{
			if(z[i]!=0)
			{
				System.out.print(z[i]+" ");
			}
		}
	}
}
