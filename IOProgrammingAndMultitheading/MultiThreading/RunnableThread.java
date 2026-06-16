package IOProgrammingAndMultitheading.MultiThreading;
class MyThread implements Runnable{
    @Override
    public void run(){
        for(int i=0 ; i<=10; i++){
            System.out.println("value of i is " +i);

            //mai chahti hu ki meri value ek ek sec. ka wait krke print ho 
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread th = new Thread(t1);
        th.start();
    }
}