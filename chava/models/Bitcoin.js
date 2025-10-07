import { PaymentMethod } from "./PaymentMethod.js";

export class Bitcoin extends PaymentMethod {
    constructor(walletAddress) {
        super();
        this.walletAddress = walletAddress;
    }
    
    pay(amount) {
        console.log(`Paid ${amount} BTC using Bitcoin (Wallet: ${this.walletAddress}).`);
    }
}