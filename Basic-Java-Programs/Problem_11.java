import java.util.Scanner;
public class Problem_11{
	static boolean isPrime(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		return (count==2 && a>0);
	}
	static int[] firstPrimeNumbers()
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter the number of prime numbers required: ");
		int x=scr.nextInt();
		int[] y=new int[x]; 
		int a=2;
		int b=0;
		while(b<x)
		{
			if(isPrime(a))
			{
				y[b]=a;
				b++;
			}
			a++;
		}
		System.out.println("List of first "+x+" prime numbers: ");
		return y;
	}
	public static void main(String[] args) {
		int[] z=firstPrimeNumbers();
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
}
