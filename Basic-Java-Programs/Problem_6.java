import java.util.Random;
import java.util.Scanner;
public class Problem_6{
	static int getRandom()
	{
		Random r=new Random();
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter minimum integer: ");
		int x=scr.nextInt();
		System.out.print("Enter maximum integer: ");
		int y=scr.nextInt();
		int z=r.nextInt((y+1)-x)+x;
		return z;
	}
	public static void main(String[] args) {
		System.out.println("\nGenerated random number: "+getRandom());
	}
}
