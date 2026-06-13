package Design_Modelling.Design_Principle;

public class DRYExample {

    public static double calculateDiscount(double price) {
        return price * 0.10;
    }

    public static void main(String[] args) {

        double mobilePrice = 10000;
        double laptopPrice = 50000;
        double tvPrice = 30000;

        System.out.println("Mobile Discount: "
                + calculateDiscount(mobilePrice));

        System.out.println("Laptop Discount: "
                + calculateDiscount(laptopPrice));

        System.out.println("TV Discount: "
                + calculateDiscount(tvPrice));
    }
}