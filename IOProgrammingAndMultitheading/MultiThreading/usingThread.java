package IOProgrammingAndMultitheading.MultiThreading;
class MyAnotherThread extends Thread{
    @Override
    public void run(){
        for(int i =10; i>=1; i--){
            System.out.println("value of i is :" +i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                
            }
        }

    }
    
    public static void main(String[] args){
        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();

    }

}
