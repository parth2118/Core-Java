import java.util.*;

class CallDetail 
{
	public long phone_no;
	public long called_no;
	public int duration;
	public String call_type;
	public CallDetail(long phone_no, long called_no, int duration, String call_type) 
	{
		this.phone_no = phone_no;
		this.called_no = called_no;
		this.duration = duration;
		this.call_type = call_type;
	}
	public long getPhone_no() 
	{
		return phone_no;
	}
	public void setPhone_no(long phone_no) 
	{
		this.phone_no = phone_no;
	}
	public long getCalled_no() 
	{
		return called_no;
	}
	public void setCalled_no(long called_no) 
	{
		this.called_no = called_no;
	}
	public int getDuration() 
	{
		return duration;
	}
	public void setDuration(int duration) 
	{
		this.duration = duration;
	}
	public String getCall_type() 
	{
		return call_type;
	}
	public void setCall_type(String call_type) 
	{
		this.call_type = call_type;
	}
}

class Customer
{
	public long phone_no;
	public String name;
	public int age;
	List <CallDetail> cd = new ArrayList<>(); 
	public Customer(long phone_no, String name, int age) 
	{
		this.phone_no = phone_no;
		this.name = name;
		this.age = age;
	}
	public long getPhone_no() 
	{
		return phone_no;
	}
	public void setPhone_no(long phone_no) 
	{
		this.phone_no = phone_no;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}

class Util 
{
	public static void parse_customer(List<Customer> l1,List<CallDetail> l2)
	{
		for(int i=0;i<l1.size();i++)
		{
			for(int j=0;j<l2.size();j++)
			{
				if((l1.get(i).phone_no)==(l2.get(j).phone_no))
				{
					l1.get(i).cd.add(l2.get(j));
				}
			}
		}
	}
}

public class Relationship_Answer_2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		List <Customer> l1 = new ArrayList<>();
		int k=0;
		do
		{
			System.out.println("Enter Customer Details");
			System.out.println("Enter Customer no.");
			long l=scan.nextLong();
			System.out.println("Enter Customer name");
			String n=scan.next();
			System.out.println("Enter Customer age");
			int a=scan.nextInt();
			l1.add(new Customer(l,n,a));
			System.out.println("Enter -1 to exit 0 to enter details about other customers");
			k=scan.nextInt();
		}while(k!=-1);
		List <CallDetail> l2 = new ArrayList<>();
		int q=0;
		do
		{
			System.out.println("Enter Call Details");
			System.out.println("Enter Phone no.");
			long p=scan.nextLong();
			System.out.println("Enter Called no.");
			long c=scan.nextLong();
			System.out.println("Enter Duration");
			int a=scan.nextInt();
			System.out.println("Enter Calltype");
			String n=scan.next();
			l2.add(new CallDetail(p,c,a,n));
			System.out.println("Enter -1 to exit 0 to enter more call details ");
			q=scan.nextInt();
		}while(q!=-1);
		Util.parse_customer(l1,l2);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println("Call Details of customer "+i);
			System.out.println("Phone_No:" + l1.get(i).phone_no);
			System.out.println("Name:" + l1.get(i).name);
			System.out.println("Age:" + l1.get(i).age);
			for(int j=0;j<l1.get(i).cd.size();j++)
			{
				System.out.println(l1.get(i).cd.get(j).phone_no + "->" + l1.get(i).cd.get(j).called_no);
				System.out.println("Duration:" + l1.get(i).cd.get(j).duration);
				System.out.println("Call_Type:" + l1.get(i).cd.get(j).call_type);
			}
		}
		scan.close();
	}
}

