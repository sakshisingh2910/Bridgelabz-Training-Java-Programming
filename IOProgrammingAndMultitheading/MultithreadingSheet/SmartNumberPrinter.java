package IOProgrammingAndMultitheading.MultithreadingSheet;

class ThreadA extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=50; i++){
            System.out.println(Thread.currentThread().getName()  + " :" +i);
        }
    }
}

class ThreadB implements Runnable{
    @Override
    public void run(){
        for(int i =51; i<=100; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);

        }
    }
}


public class SmartNumberPrinter {
    public static void main(String[] args)  throws InterruptedException{
        ThreadA t1 = new ThreadA();
        t1.setName("ThreadA");

        ThreadB t2 = new ThreadB();
        Thread t = new Thread(t2);
        t.setName("ThreadB");

        Thread t3 = new Thread(() -> {
            for(char ch = 'A'; ch <= 'Z'; ch++){
                System.out.println(Thread.currentThread().getName() + " : " + ch);
            }

        });
        t3.setName("ThreadC");

        t1.start();
        t.start();
        t3.start();

        t1.join();
        t.join();
        t3.join();
        System.out.println("All thread completed");


    }
    
}
