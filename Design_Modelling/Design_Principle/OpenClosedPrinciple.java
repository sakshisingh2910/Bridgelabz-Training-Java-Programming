package Design_Modelling.Design_Principle;

interface Payment {
    void pay();
}
class UpiPayment implements Payment {

    public void pay() {
        System.out.println("UPI Payment");
    }
}
class CardPayment implements Payment {

    public void pay() {
        System.out.println("Card Payment");
    }
}
class PaymentService {

    public void processPayment(Payment payment) {
        payment.pay();
    }
}
public class OpenClosedPrinciple {

    public static void main(String[] args) {

        Payment payment = new UpiPayment();

        PaymentService service =
                new PaymentService();

        service.processPayment(payment);
    }
}