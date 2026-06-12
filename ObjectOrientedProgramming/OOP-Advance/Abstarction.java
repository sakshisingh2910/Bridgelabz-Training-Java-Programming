abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }
}

public class Abstarction {

    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
    }
}