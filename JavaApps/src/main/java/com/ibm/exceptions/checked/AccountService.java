package com.ibm.exceptions.checked;

public class AccountService {
    private double balance = 1000.00;

    public double witdraw(double amt) throws BalanceNotFoundException {
        if (balance < amt) {
            //error : you are throwing where this method is called.
           throw new BalanceNotFoundException("Balance Not Found " + "balace=>" + balance + "amt to be withdrawn =>" + amt);
        }
        return balance - amt; //balance
    }
}