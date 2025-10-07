import { PaymentService } from './services/PaymentServices.js';
import { CreditCard } from './models/CreditCard.js';
import { PayPal } from './models/PayPal.js';
import { Bitcoin } from './models/Bitcoin.js';

// Create instances of different payment methods
const service = new PaymentService();
const creditCardPayment = new CreditCard('1234-5678-9012-3456', '12/25', '123');
const paypalPayment = new PayPal();
const bitcoinPayment = new Bitcoin('1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa');

// Process payments
service.processPayment(creditCardPayment, 100.00);
service.processPayment(paypalPayment, 50.00);
service.processPayment(bitcoinPayment, 0.005);