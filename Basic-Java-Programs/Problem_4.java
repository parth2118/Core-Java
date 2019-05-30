import java.util.Scanner;
public class Problem_4{
	static int countUppercase(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=scr.nextLine();
		System.out.println("\nNumber of uppercase letters: "+countUppercase(s));
	}
}
