import java.util.Random;
import java.util.Scanner;
public class Problem_9{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		Random r=new Random();
		String[] s=new String[3];
		s[0]="Rock";
		s[1]="Paper";
		s[2]="Scissors";
		int x=r.nextInt(3-0)+0;
		System.out.print("0-Rock\n1-Paper\n2-Scissor\nEnetr a number from (0,1,2): ");
		int y=scr.nextInt();
		System.out.println("\nUser's Choice: "+s[y]);
		System.out.println("Computer's Choice: "+s[x]);
		if(s[y]==s[x])
		{
			System.out.println("\nDraw");
		}
		if((s[y]==s[0] || s[y]==s[2]) && (s[x]==s[0] || s[x]==s[2]) && s[y]!=s[x])
		{
			if(s[x]=="Rock")
			{
				System.out.println("\nRock(Computer) wins.");
			}
			else if(s[y]=="Rock")
			{
				System.out.println("\nRock(User) wins.");
			}
		}
		else if((s[y]==s[0] || s[y]==s[1])&&(s[x]==s[0] || s[x]==s[1]) && s[y]!=s[x])
		{
			if(s[x]=="Paper")
			{
				System.out.println("\nPaper(Computer) wins");
			}
			else if(s[y]=="Paper")
			{
				System.out.println("\nPaper(User) wins");
			}
		}
		else if((s[y]==s[1] || s[y]==s[2])&&(s[x]==s[1] || s[x]==s[2]) && s[y]!=s[x])
		{
			if(s[x]=="Scissors")
			{
				System.out.println("\nScissors(Computer) wins");
			}
			else if(s[y]=="Scissors")
			{
				System.out.println("\nScissors(User) wins");
			}
		}
	}
}
