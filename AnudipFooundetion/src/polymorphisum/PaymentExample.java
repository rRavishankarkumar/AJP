package polymorphisum;

class Payment {
    void processPayment() {
        System.out.println("Processing general payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment through Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment through UPI");
    }
}

public class PaymentExample {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.processPayment();  // Runtime behavior: Credit Card payment logic

        payment = new UPIPayment();
        payment.processPayment();  // Runtime behavior: UPI payment logic
    }
}

