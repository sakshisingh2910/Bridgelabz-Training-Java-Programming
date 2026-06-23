package IOProgrammingAndMultitheading.MultithreadingSheet;

class Road extends Thread {

    public Road(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " Green Signal ON");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " Green Signal OFF");
            Thread.yield();
        }
    }
}

public class TrafficSignalSimulator {
    public static void main(String[] args) {
        Road road1 = new Road("Road 1");
        Road road2 = new Road("Road 2");
        Road road3 = new Road("Road 3");
        road1.start();
        road2.start();
        road3.start();
    }
}