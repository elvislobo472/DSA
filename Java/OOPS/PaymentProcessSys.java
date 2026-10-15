package Coding.Java.OOPS;


class Payment{

    public void processPayment(double amount){
        System.out.println("Prcessing payment......");
    }

}


class CreditCardPayment extends Payment {

    @Override
    public void processPayment(double amount){
        System.out.println("Prcessing Credit card payment: " + amount);
    }

}


class UPIPayment extends Payment {

    @Override
    public void processPayment(double amount){
        System.out.println("Prcessing UPI payment: " + amount);
    }

}

class PayPalPayment extends Payment {

    @Override
    public void processPayment(double amount){
        System.out.println("Prcessing PayPal payment: " + amount);
    }

}



public class PaymentProcessSys {

    public static void main(String[] args) {

        Payment p1 = new UPIPayment();


        p1.processPayment(500);

        System.out.println();

        Payment p2 = new PayPalPayment();

        p1.processPayment(500);

        System.out.println();

        Payment p3 = new CreditCardPayment();

        p3.processPayment(1000);







    }

}
