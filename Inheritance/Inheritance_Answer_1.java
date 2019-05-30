import java.util.Scanner;

class Publication
{
    String title;
    float price;
    public void getdata(String t,float p)
    {
    	title=t;
    	price=p;
    }
    public void putdata()
    {
    	 System.out.println("Title is: "+title );
         System.out.println("Price is: "+price );
    }
}

class tape extends Publication
{
    public float play_time;
    public void getdata(String t,float p,float pt)
    {
       super.getdata(t, p);
       play_time=pt;
    }
    public void putdata()
    {
        super.putdata();
    	System.out.println("Play time is :"+ play_time);
    }
}

class book extends Publication
{
    public int page_count;
    public void getdata(String t,float p,int pc)
    {
       super.getdata(t, p);	
       page_count=pc;
    }
    public void putdata()
    {
    	super.putdata();
        System.out.println("No. of pages is:"+ page_count);
    }
}


public class Inheritance_Answer_1
{
    public static void main(String[] Args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no. of books");
        int n_b=scan.nextInt();
        System.out.println("Enter no. of tapes");
        int t_b=scan.nextInt();
        book [] b=new book[n_b];
        tape [] t=new tape[t_b];
        for(int i=0;i<n_b;i++)
        {	
        	b[i]=new book();
	        System.out.println("Enter title of book ");
	        b[i].title=scan.next();
	        System.out.println("Enter price of book ");
	        b[i].price=scan.nextFloat();
	        System.out.println("Enter no_of_pages for book ");
	        b[i].page_count=scan.nextInt();
	        b[i].getdata(b[i].title, b[i].price, b[i].page_count);
	        
        }
        for(int i=0;i<t_b;i++)
        {	
        	t[i]=new tape();
	        System.out.println("Enter title of tape ");
	        t[i].title=scan.next();
	        System.out.println("Enter price of tape ");
	        t[i].price=scan.nextFloat();
	        System.out.println("Enter play_time for tape ");
	        t[i].play_time=scan.nextFloat();
	        t[i].getdata(t[i].title, t[i].price, t[i].play_time);
	    }
        System.out.println("Now printing the given data:");
        for(int i=0;i<n_b;i++)
        {
            b[i].putdata();
        }
        for(int i=0;i<t_b;i++)
        {
            t[i].putdata();
        }
        scan.close();
    }
}
