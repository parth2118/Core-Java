import java.util.Random;
public class Problem_7{
	public static void main(String[] args) {
		Random r=new Random();
		int count=0,x=0;
		while(x!=169)
		{
			x=r.nextInt(201-150)+150;
			count++;
		}
		System.out.println("Number of trials to generate "+x+": "+count);
	}
}
