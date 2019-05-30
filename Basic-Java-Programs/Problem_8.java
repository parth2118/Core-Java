import java.util.Random;
public class Problem_8{
	public static void main(String[] args) {
		Random r=new Random();
		int[] pwd=new int[6];
		System.out.print("Generated Password: ");
		for(int i=0;i<pwd.length;i++)
		{
			if(i==0 || i==3)
			{
				pwd[i]=(r.nextInt(123-97)+97);
				System.out.print((char)pwd[i]);
			}
			else if(i==2)
			{
				pwd[i]=(r.nextInt(91-65)+65);
				System.out.print((char)pwd[i]);
			}
			else
			{
				pwd[i]=(r.nextInt(10-0)+0);
				System.out.print(pwd[i]);
			}
		}
	}
}
