import { PaymentMethod } from "./PaymentMethod.js";

export class CreditCard extends PaymentMethod {
    constructor(cardNumber, expiryDate, cvv) {
        super();
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    
    pay(amount) {
        console.log(`Paid $${amount} using Credit Card (${this.cardNumber}).`);
    }
}