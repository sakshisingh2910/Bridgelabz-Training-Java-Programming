package Design_Modelling.Design_Principle;
interface Workable {
    void work();
}
interface Eatable {
    void eat();
}
class Human implements Workable, Eatable {

    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        System.out.println("Eating");
    }
}
class Robot implements Workable {

    public void work() {
        System.out.println("Working");
    }
}
public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {

        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();
    }
}