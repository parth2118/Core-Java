import java.util.Scanner;

abstract class Employee
{
    String name_of_employee;
    double annual_salary=1000000;
    public void getname(String name)
    {
    	name_of_employee=name;
    }
    public abstract double computePay();
}

class HourlyPaid extends Employee
{
    double rate_of_pay;
    int tw_hours;
    public void getRate(double d)
    {
    	rate_of_pay=d;
    }
    public void getHours(int h)
    {
    	tw_hours=h;
    }
    public double computePay()
    {
    	return (rate_of_pay*tw_hours);
    }
}

class Executive extends Employee
{
    double inc_point;
    public void getIncrement(double d)
    {
    	inc_point=d;
    }
    public double computePay()
    {
    	return ((annual_salary*inc_point)/100);
    }
}

class SalesCommissioned extends Employee
{
    double per_comm;
    double total_sales_m;
    public void getPercantage(double d)
    {
    	per_comm=d;
    }
    public void getSales(double h)
    {
    	total_sales_m=h;
    }
    public double computePay()
    {
    	return ((per_comm*total_sales_m)/100);
    }
}

public class Inheritance_Answer_2
{
    public static void main(String[] args) 
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the no. of Executive employees");
    	int n=scan.nextInt();
    	Executive [] e=new Executive [n];
    	for(int i=0;i<n;i++)
    	{
    		e[i]=new Executive();
    		System.out.println("Enter name of Executive employee-" + (i+1) );
    		String name=scan.next();
    		e[i].getname(name);
    		System.out.println("Enter increment for Executive employee-" + (i+1) );
    		double inc=scan.nextDouble();
    		e[i].getIncrement(inc);
    	}
    	System.out.println("Enter the no. of HourlyPaid employees");
    	int m=scan.nextInt();
    	HourlyPaid [] h=new HourlyPaid [m];
    	for(int i=0;i<m;i++)
    	{
    		h[i]=new HourlyPaid();
    		System.out.println("Enter name of Hourly Paid employee-" + (i+1) );
    		String name=scan.next();
    		h[i].getname(name);
    		System.out.println("Enter no. of hours for hourly paid employee" + (i+1) );
    		int hrs=scan.nextInt();
    		h[i].getHours(hrs);
    		System.out.println("Enter rate of pay for hourly paid employee" + (i+1) );
    		double r_pay=scan.nextDouble();
    		h[i].getRate(r_pay);
    	}
    	System.out.println("Enter the no. of Sales Commissioned employees");
    	int p=scan.nextInt();
    	SalesCommissioned [] s=new SalesCommissioned [p];
    	for(int i=0;i<p;i++)
    	{
    		s[i]=new SalesCommissioned();
    		System.out.println("Enter name of Sales Commissioned employee-" + (i+1) );
    		String name=scan.next();
    		s[i].getname(name);
    		System.out.println("Enter per_commision for Sales Commissioned employee-" + (i+1) );
    		double com=scan.nextDouble();
    		s[i].getPercantage(com);
    		System.out.println("Enter total Sales for Sales Commissioned employee-" + (i+1) );
    		double sales=scan.nextDouble();
    		s[i].getSales(sales);
    	}
    	System.out.println("Now computing the pay of all executive employees:");
    	for(int i=0;i<n;i++)
    	{
    		System.out.println("Annual pay along with increment for emp " + (i+1) + " is " + (e[i].annual_salary+e[i].computePay()));
    	}
    	System.out.println("Now computing the pay of all hourly paid employees:");
    	for(int i=0;i<m;i++)
    	{
    		System.out.println("Salary of hourly paid employee " + (i+1) + " is " + h[i].computePay());
    	}
    	System.out.println("Now computing the pay of all Sales Commissioned employees:");
    	for(int i=0;i<p;i++)
    	{
    		System.out.println("Salary of sales commissioned employee " + (i+1) + " is " + s[i].computePay());
    	}
    	scan.close();
    }  
}

