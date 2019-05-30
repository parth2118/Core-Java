public class Problem_1{
	public static void main(String[] args){
		int a=5,b=5;
		for(int i=5;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==a || j==b || (i==7 && j>a && j<b))
				{
					System.out.print("A");
				}
				else
				{
					System.out.print(" ");
				}
			}
			a=a-1;
			b=b+1;
			System.out.println();
		}
	}
}
