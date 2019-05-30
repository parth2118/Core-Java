import java.util.*;

class Item 
{
	public int item_id;
	public String description;
	public int price_per_quantity;
	public Item(int item_id, String description, int price_per_quantity) 
	{
		this.item_id = item_id;
		this.description = description;
		this.price_per_quantity = price_per_quantity;
	}
	public int getItem_id() 
	{
		return item_id;
	}
	public void setItem_id(int item_id) 
	{
		this.item_id = item_id;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public int getPrice_per_quantity() 
	{
		return price_per_quantity;
	}
	public void setPrice_per_quantity(int price_per_quantity) 
	{
		this.price_per_quantity = price_per_quantity;
	}
}

class Bill 
{
    public String bill_id="B";
    public int bill_amount;
    public static int counter=1000;
    public void generate_bill_amount(List <Integer> item_quantity,List <Item> item_s,List <Integer> available_items)
    {
        counter++;
        bill_id=bill_id+counter;
        for(int i=0;i<item_quantity.size();i++)
        {
           if(item_quantity.get(i)<=available_items.get(i))
           {
               available_items.set(i,available_items.get(i)-item_quantity.get(i));
               bill_amount=bill_amount+((item_quantity.get(i))*(item_s.get(i).price_per_quantity));
           }
           else{
               System.out.println("Stock Empty");
           }
        } 
    }
    public int getBill_amount() 
	{
        return bill_amount;
    }
    public void setBill_amount(int bill_amount) 
	{
        this.bill_amount = bill_amount;
    }
    public static int getCounter() 
	{
        return counter;
    }
    public static void setCounter(int counter) 
	{
        Bill.counter = counter;
    } 
}

class Customer
{
    public String customer_name;
    public String payment_status="Not Paid";
    Customer(String n)
    {
        customer_name=n;
    }
    public void pays_bill(Bill b)
    {
        payment_status="Paid";
        System.out.println("Customer_name:" + customer_name + " Bill_id:" + b.bill_id + " Bill_Amount:"+b.bill_amount);
    }
    public String getCustomer_name() 
	{
        return customer_name;
    }
    public void setCustomer_name(String customer_name) 
	{
        this.customer_name = customer_name;
    }
    public String getPayment_status() 
	{
        return payment_status;
    }
    public void setPayment_status(String payment_status) 
	{
        this.payment_status = payment_status;
    } 
}

public class Relationship_Answer_3
{
    public static void main(String Args[])
    {
        Scanner scan=new Scanner(System.in);
        List <Customer> c=new ArrayList<>();
        List<Item> it=new ArrayList<>();
        List<Integer> aq=new ArrayList<>(); 
        List<Bill> b=new ArrayList<>();
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter item_id");
            int id=scan.nextInt();
            System.out.println("Enter description");
            String s=scan.next();
            System.out.println("Enter price_per_quantity");
            int ppq=scan.nextInt();
            System.out.println("Enter available quantity");
            int a=scan.nextInt();
            aq.add(a);
            it.add(new Item(id,s,ppq));
        }
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter customer name");
            String n=scan.next();
            c.add(new Customer(n));
            List<Integer> req=new ArrayList<>();
            req.clear();
            for(int j=0;j<2;j++)
            {
                System.out.println("How much of item "+j);
                int q=scan.nextInt();
                req.add(q);
            }
			Bill B=new Bill();
			b.add(B);
			B.generate_bill_amount(req,it,aq);
        }
        System.out.println("Enter Bill No.");
        int bn=scan.nextInt();
        c.get(bn).pays_bill(b.get(bn));
        scan.close();
    }
}
