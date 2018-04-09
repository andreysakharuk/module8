package module8;


public class PaymentLogic {

    public static void main(String args[]) {

        Payment payment = new Payment();
        payment.addGoodToPayment(new Good("Jacket", 100));
        payment.addGoodToPayment(new Good("Jacket", 50));
        payment.addGoodToPayment(new Good("Jeans", 80));
        countCostOfPayment(payment);

    }

    public static void countCostOfPayment(Payment payment) {
        double costOfPayment = 0;
        for (Good good : payment.getGoods()) {
            if (good != null) {
                costOfPayment = good.getPrice() + costOfPayment;
            }
        }
        System.out.println("Стоимость покупки равна = " + costOfPayment);
    }
}

