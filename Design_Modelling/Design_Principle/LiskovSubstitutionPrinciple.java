package Design_Modelling.Design_Principle;

class Bird {
    public void eat() {
        System.out.println("Bird Eating");
    }
}
class Sparrow extends Bird {
}
public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {

        Bird bird = new Sparrow();

        bird.eat();
    }
}