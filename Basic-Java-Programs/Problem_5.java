import java.util.Random;
import java.util.Scanner;
public class Problem_5{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		Random r=new Random();
		int x=r.nextInt(10-0)+0;
		System.out.print("Guess a number between 0 & 9: ");
		int y=scr.nextInt();
		if(y>x)
		{
			System.out.println("\nYour guess is higher than the random number generated.");
			System.out.println(y+" > "+x);
		}
		else if(x>y)
		{
			System.out.println("\nYour guess is lower than the random number generated.");
			System.out.println(y+" < "+x);
		}
		else
		{
			System.out.println("\nYour guess is the same as the random number generated.");
		}
	}
}
