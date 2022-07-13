package com.ibm.exceptions.checked;

//unchecked exception
//public class BalanceNotFoundException extends RuntimeException {
//    public BalanceNotFoundException(){}
//    public BalanceNotFoundException(String s) {
//        super(s);
//    }
//}
public class BalanceNotFoundException extends Exception {
    public BalanceNotFoundException(){}
    public BalanceNotFoundException(String s) {
        super(s);
    }
}
