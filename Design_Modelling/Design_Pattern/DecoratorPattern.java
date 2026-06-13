interface IceCream {
    String getDescription();
    int getCost();
}

// Concrete Components
class ChocolateIceCream implements IceCream {

    @Override
    public String getDescription() {
        return "Chocolate Ice Cream";
    }

    @Override
    public int getCost() {
        return 70;
    }
}

class VanillaIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Vanilla Ice Cream";
    }

    @Override
    public int getCost() {
        return 90;
    }
}

// Abstract Decorator
abstract class IceCreamDecorator implements IceCream {
    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}

// Concrete Decorators
class RainbowSprinkleDecorator extends IceCreamDecorator {

    public RainbowSprinkleDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Rainbow Sprinkles";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }
}

class ChocoChipsDecorator extends IceCreamDecorator {

    public ChocoChipsDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Choco Chips";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 50;
    }
}

class ChocolateSyrupDecorator extends IceCreamDecorator {

    public ChocolateSyrupDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Chocolate Syrup";
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }
}

// Client
public class DecoratorPattern {

    public static void main(String[] args) {

        IceCream iceCream = new VanillaIceCream();

        iceCream = new ChocoChipsDecorator(iceCream);
        iceCream = new ChocolateSyrupDecorator(iceCream);
        iceCream = new RainbowSprinkleDecorator(iceCream);

        print(iceCream);
    }

    static void print(IceCream iceCream) {
        System.out.println("Description: " + iceCream.getDescription());
        System.out.println("Cost: " + iceCream.getCost());
    }
}