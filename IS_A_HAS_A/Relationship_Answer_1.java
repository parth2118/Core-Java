import java.util.InputMismatchException;
import java.util.Scanner;

class Apparel
{
	private String item_id="";
	String item_type;
	double price;
	static int counter=100;
	static int id=101;
	Apparel(double price,String item_type)
	{
		this.price=price;
		this.item_type=item_type;
		if(this.item_type.equals("Cotton"))
		{
			this.item_id=item_id.concat("C")+id;
		}
		else
		{
			this.item_id=item_id.concat("S")+id;
		}
		counter++;
		id++;
	}
	double calculate_price()
	{
		price=(0.05*price)+price;
		return price;
	}
	String get_item_id()
	{
		return item_id;
	}
	void set_price(double price)
	{
		this.price=price;
	}
}

class Cotton extends Apparel
{
	private int discount;
	Cotton(double price,int discount)
	{
		super(price,"Cotton");
		this.discount=discount;
	}
	double calculate_price()
	{
		price=super.calculate_price();
		price=price-(((float)discount/100)*price);
		price=price+((0.05)*price);
		return (int)price;
	}
	int get_discount()
	{
		return discount;
	}
}

class Silk extends Apparel
{
	int points;
	Silk(double price)
	{
		super(price,"Silk");
	}
	double calculate_price()
	{
		price=super.calculate_price();
		if(price>10000)
		{
			points=10;
		}
		else
		{
			points=3;
		}
		price=price+((0.1)*price);
		return (int)price;
	}
}

public class Relationship_Answer_1
{
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		int n=0,x,dis;
		double price;
		System.out.print("Enter the quantity of apparels to be inserted: ");
		n=scr.nextInt();
		for(int i=0;i<n;i++)
		{
			try
			{
				System.out.println("\n1) Cotton Apparel");
				System.out.println("2) Silk Apparel");
				System.out.print("Enter the type of apparel to insert: ");
				x=scr.nextInt();
				switch(x)
				{
					case 1:
						System.out.print("Enter price of apparel: ");
						price=scr.nextInt();
						System.out.print("Enter discount rate: ");
						dis=scr.nextInt();
						Cotton c=new Cotton(price,dis);
						System.out.println("\n\nItem_Id  : "+c.get_item_id()+"\nItem_Type: "+c.item_type+"\nPrice   : "+c.calculate_price());
					break;
					case 2:
						System.out.print("Enter price of apparel: ");
						price=scr.nextInt();
						Silk s=new Silk(price);
						System.out.println("\n\nItem_Id  : "+s.get_item_id()+"\nItem_Type: "+s.item_type+"\nPrice   : "+s.calculate_price()+"\nPoints: "+s.points);
					break;
					default:
						throw new Exception();
				}
			}
			catch(Exception e)
			{
				System.out.println("\nInvalid input. Please enter a valid input.\n");
				i--;
			}
		}
		System.out.println("\nCounter: "+Apparel.counter);
	}
}
