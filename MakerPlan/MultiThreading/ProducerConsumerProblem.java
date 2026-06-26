package MakerPlan.MultiThreading;


class Company{
    int n;
    boolean f = false;
    //f =false chance of producer
    //f = true : chance of consumer

    synchronized public void produce_item(int n) throws Exception{
        if(f){
            wait();
        }
        this.n = n;
        System.out.println("produced item :" + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws Exception{
        if(!f){
            wait();
        }
        System.out.println("consumed item  : " + this.n);
        f = false;
        notify();
        return this.n;
    }
}


//THREAD FOR PRODUCER 
class Producer extends Thread{

    Company c;
    Producer(  Company c){
        this.c = c;

    }
    public void run(){
        int i =1;
        while(true){
            try {
            this.c.produce_item(i);
            Thread.sleep(1000);
            }
            catch(Exception e){
            }
            i++;
        }

    }
}

// THREAD FOR consumer 
class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c = c;
    }
    public void run(){

        while(true){
            try {
            this.c.consume_item();
            Thread.sleep(1000);
            } catch (Exception e) {
            }

        }

    }
}

// MAIN METHOD
public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();
    }
    
    
}


