public class TollBooth 
{
	static int total_vehicles;
	static double total_amount;
	String vehicle_number;
	String vehicle_type;
	boolean pay_nopay;
	TollBooth(String vehicle_number,String vehicle_type)
	{
		this.vehicle_number=vehicle_number;
		this.vehicle_type=vehicle_type;
	}
	void payingVehicle()
	{
		total_vehicles++;
		total_amount+=50;
	}
	void nopayVehicle()
	{
		total_vehicles++;
	}
	String[][] get_count_nonpay_vehicle(TollBooth[] t)
	{
		String[][] a=new String[2][4];
		int c=0,tr=0;
		for(int j=0;j<4;j++)
		{
			if(t[j].vehicle_type=="CAR" && t[j].pay_nopay==false)
			{
				c++;
				a[0][j+1]=t[j].vehicle_number;
			}
			else if(t[j].vehicle_type=="TRUCK" && t[j].pay_nopay==false)
			{
				tr++;
				a[1][j+1]=t[j].vehicle_number;
			}
		}
		a[0][0]=Integer.toString(c);
		a[1][0]=Integer.toString(tr);
		return a;
	}
	void vehicle_info()
	{
		System.out.println("Vehicle Number: "+vehicle_number);
		System.out.println("Type Of Vehicle: "+vehicle_type);
		if(pay_nopay)
		{
			System.out.println("Payment Status: Paying");
			payingVehicle();
			System.out.println();
		}
		else
		{
			System.out.println("Payment Status: Non-Paying");
			nopayVehicle();
			System.out.println();
		}
	}
	void display()
	{
		System.out.println("Total Number Of Vehicles Passed: "+total_vehicles);
		System.out.println("Total amount of money collected: "+total_amount);
	}
	public static void main(String[] args) {
		TollBooth t1=new TollBooth("GJ-01-HK-9646","CAR");
		t1.pay_nopay=true;
		TollBooth t2=new TollBooth("GJ-01-HK-9647","TRUCK");
		t2.pay_nopay=false;
		TollBooth t3=new TollBooth("GJ-01-HK-9648","CAR");
		t3.pay_nopay=false;
		TollBooth t4=new TollBooth("GJ-01-HK-9649","TRUCK");
		t4.pay_nopay=true;
		TollBooth[] t={t1,t2,t3,t4};
		for(int i=0;i<t.length;i++)
		{
			t[i].vehicle_info();
		}
		t1.display();
		String[][] a=new String[2][4];
		a=t1.get_count_nonpay_vehicle(t);
		System.out.println("\nNumber of nonpaying cars: "+Integer.parseInt(a[0][0]));
		System.out.println("Number of nonpaying trucks: "+Integer.parseInt(a[0][0]));
		System.out.println("\nVehicle Number of Non-Paying Vehicles: ");
		for(int i=1;i<4;i++)
		{
			if(a[0][i]!=null)
			{
				System.out.println(a[0][i]);
			}
			else if(a[1][i]!=null)
			{
				System.out.println(a[1][i]);
			}
		}
	}
}
