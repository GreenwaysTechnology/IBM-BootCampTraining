package com.ibm.exceptions.checked;

public class AccountMain {
    public static void main(String[] args) throws BalanceNotFoundException {
        //create object
        AccountService accountService = new AccountService();
        try {
            System.out.println(accountService.witdraw(2000));
        }
        catch (BalanceNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("called");
        }
      //  System.out.println(accountService.witdraw(2000));

    }
}
