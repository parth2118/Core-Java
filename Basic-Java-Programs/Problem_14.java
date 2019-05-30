import java.util.Scanner;
public class Problem_14{
	static String reverseString(String s)
	{
		StringBuilder strb=new StringBuilder();
		strb.append(s);
		strb=strb.reverse();
		return strb.toString();
	}
	static boolean check(String s)
	{
		return (s.equalsIgnoreCase(reverseString(s)));
	}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=scr.nextLine();
		if(check(s))
		{
			System.out.println("\n"+s+" is palindrome.");
		}
		else
		{
			System.out.println(s+" is not palindrome.");
		}
	}
}