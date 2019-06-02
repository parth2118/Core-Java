import java.util.*;

public class Exception_Handling_Answer_1 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int b=0;
        System.out.print("Enter size of array: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        int i=0;
        while(i<n)
        {
            try
            {
                System.out.print("Enter element "+i+": ");
                arr[i]=scan.nextInt();
                i++;
            }
            catch(InputMismatchException ime)
            {
               System.out.println("\nException:"+ime.toString());
               System.out.println("Enter the value again.\n");
               scan.next();
            }
        }
        boolean f=true;
	    while(f&&(n!=0))
	    {    
	        try
	        {
	            System.out.print("\nEnter index to find element: ");
	            b=scan.nextInt();
	            System.out.println("Element at index "+"b"+" is :" +arr[b]);
	            f=false;
	        }
	        catch(ArrayIndexOutOfBoundsException ai)
	        {
	            System.out.println("Exception:"+ai.toString());
	            System.out.println("Enter index again\n");
	            scan.nextLine();
	        }
	    }
	    double sum=0.0;
        for(int j=0;j<n;j++)
        {
            sum=sum+arr[j];
        }
        try
        {
            System.out.println("\nMean is :" + sum/n);
        }
        catch(ArithmeticException r)
        {
            System.out.println("Exception: "+r.toString());
        }
    }  
}