import java.util.Scanner;
public class Problem_10{
	static Boolean isPrime()
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scr.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return (count==2 && n>0);
	}
	public static void main(String[] args) {
		System.out.println(isPrime());
	}
}
