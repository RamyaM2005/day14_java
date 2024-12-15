
class A implements Runnable
{
    public void run()
    {
        System.out.println("Hello i am Thread");
    }
}
public class Implementing_Runnable_Interface {
    public static void main(String args[])
    {
        A r=new A();
        Thread s=new Thread(r);
        s.run();
    }
}
