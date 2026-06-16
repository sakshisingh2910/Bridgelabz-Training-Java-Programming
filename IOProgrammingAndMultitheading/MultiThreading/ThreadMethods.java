package IOProgrammingAndMultitheading.MultiThreading;
class UserThread extends Thread{
    @Override 
    public void run(){
        //task for thread
        System.out.println("this is user defined thread");
    }

}

public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println("program started");
        int x = 56+23;
        System.out.println("sum of x is : "  +x);
        //thread ka object nikala 
        Thread t = Thread.currentThread();

        //thread getname 
        String tname = t.getName();
        System.out.println("current running thread is " + tname);

        //setName
        t.setName("MyMain");
        System.out.println(t.getName());

        //sleep method static method h to we can call it directly.
        try{
            Thread.sleep(2000);  // means 2sec
        }
        catch(Exception e){

        };

        //thread id 
        System.out.println(t.getId());
         //going  to start user defined thread
        UserThread t2 = new UserThread();
        t2.start();
        System.out.println("program ended");
        
    }
}
