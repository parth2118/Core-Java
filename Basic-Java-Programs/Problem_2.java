import java.util.Scanner;
public class Problem_2{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		double[][] m=new double[3][3];
		System.out.println("Enter (3X3) matrix elements: ");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j]=scr.nextDouble();
			}
		}
		/*System.out.println();
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}*/
		double det=(m[0][0]*((m[2][2]*m[1][1])-(m[1][2]*m[2][1])))-(m[0][1]*((m[1][0]*m[2][2])-(m[1][2]*m[2][0])))+(m[0][2]*((m[2][1]*m[1][0])-(m[1][1]*m[2][0])));
		System.out.println("\nDeterminant = "+det);
	}
}
