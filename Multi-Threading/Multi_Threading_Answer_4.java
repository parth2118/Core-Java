import java.util.*;

public class Multi_Threading_Answer_4 
{
	public static void main(String Args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the size of a n*n matrix: ");
		int n=scan.nextInt();
		System.out.println();
		int [][] a=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("Enter element for "+i+"th row "+j+"th col: ");
				a[i][j]=scan.nextInt();
			}
		}
		int [] c=new int[n];
		Matrix_Add []m=new Matrix_Add[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[j]=a[i][j];
			}
			m[i]=new Matrix_Add(i,n,c);
			m[i].t.start();
			try
			{
				m[i].t.join();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie.toString());
			}
		}
		System.out.println("\nThe sum of elements of matrix is: "+Matrix_Add.ms);
	}
}

class Matrix_Add implements Runnable
{
	Thread t;
	int [] c;
	static int n,ms;
	Matrix_Add(int r,int n,int b[])
	{
		this.n=n;
		t=new Thread(this,"Thread for row :"+r);
		c=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=b[i];
		}
	}
	
	synchronized public void row_add(int n,int a[])
	{
		int r_sum=0;
		for(int i=0;i<n;i++)
		{
			r_sum=r_sum+a[i];
		}
		ms=ms+r_sum;
	}
	
	public void run()
	{
			row_add(n,c);
	}
}