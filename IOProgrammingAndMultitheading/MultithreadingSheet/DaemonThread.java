package IOProgrammingAndMultitheading.MultithreadingSheet;


class cleanupThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("cleaning temporary files");
        
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
            }

        }

    }
}
class userThread extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " thread working");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){


            }
        }
    }

}

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        cleanupThread cThread = new cleanupThread();
        cThread.setDaemon(true);
        cThread.start();

        userThread t1 = new userThread();
        userThread t2 =  new userThread();
        t1.setName("userThread1");
        t2.setName("userThread2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
    }
    
}
