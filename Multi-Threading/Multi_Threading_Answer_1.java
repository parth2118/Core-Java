class Store
{
    int n;
    static boolean valueset;
    synchronized int get()
    {
        while(!valueset)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
        valueset=true;
        System.out.println("Consumer: "+this.n);
        valueset=false;
        notify();
        return n;
    }
    synchronized void put(int a)
    {
        while(valueset)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
        this.n=a;
        System.out.println("Producer: "+this.n);
        valueset=true;
        notify();
    }
}

class Producer implements Runnable
{
    Thread t;
    Store s;
    Producer(Store s)
    {
        this.s=s;
        t=new Thread(this,"Producer");
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            s.put(i++);
            try
            {
                t.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted");
            }
        }
    }
}

class Consumer implements Runnable
{
    Thread t;
    Store s;
    Consumer(Store s)
    {
        this.s=s;
        t=new Thread(this,"Consumer");
    }
    public void run()
    {
        while(true)
        {
            s.get();
        }
    }
}

public class Multi_Threading_Answer_1 {
    public static void main(String[] args)
    {
        Store s=new Store();
        Producer p1=new Producer(s);
        Consumer c1=new Consumer(s);
        p1.t.start();
        c1.t.start();
    }
}
