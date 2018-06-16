package by.epam.tr.start.payment;

public class PaymentMain {

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addItemToPayment();
        payment.printPayment();
        payment.removeItemFromPayment();
        payment.printPayment();
    }
}
