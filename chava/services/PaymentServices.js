export class PaymentService {
    processPayment(paymentMethod, amount) {
        paymentMethod.pay(amount);
    }
}