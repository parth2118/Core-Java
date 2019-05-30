import java.util.Scanner;
public class Problem_3{
	static void printTypeOfChar()
	{
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char a=scr.next().charAt(0);
		if((int)a>=65 && (int)a<=90)
		{
			System.out.println("\nUPPERCASE");
		}
		else if((int)a>=97 && (int)a<=122)
		{
			System.out.println("\nLOWERCASE");
		}
		else
		{
			System.out.println("\nSYMBOL");
		}
	}
	public static void main(String[] args) {
		printTypeOfChar();
	}
}
