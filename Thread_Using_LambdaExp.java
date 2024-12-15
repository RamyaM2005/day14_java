public class Thread_Using_LambdaExp {
    public static void main(String args[])
    {
        Runnable r=()->System.out.println("I am new from java 8 version");
        Thread t=new Thread(r);
        t.start();
    }
}
