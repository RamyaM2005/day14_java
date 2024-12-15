public class Thread_Sleep {

    public static void main(String args[])
    {
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Thread resumed");
    }
}
