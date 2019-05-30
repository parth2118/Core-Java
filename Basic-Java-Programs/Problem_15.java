import java.util.Scanner;
public class Problem_15{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("This program computes Hailstone sequences.");
		System.out.print("Enter a number: ");
		int a=scr.nextInt();
		int count=0;
		while(a!=1)
		{
			if(a%2==0)
			{
				System.out.println(a+" is even, so I take half = "+a/2);
				a=a/2;
			}
			else
			{
				System.out.println(a+" is odd, so I make 3n+1 = "+((3*a)+1));
				a=(3*a)+1;
			}
			count++;
		}
		System.out.println("The process took "+count+" steps to reach "+a+".");
	}
}
