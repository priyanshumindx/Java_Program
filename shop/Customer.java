//package shop;
//
//import Bank.Account;
//
//public class Customer {
//    void use() {
//        Account a = new Account();
//
//        System.out.println(a.bankName);     // OK    public
//        a.deposit(1000);                    // OK    public method
//        System.out.println(a.getBalance()); // OK    public method
//
//        System.out.println(a.ownerName);    // ERROR protected: not a child, not same package
//        System.out.println(a.branchCode);   // ERROR default: different package
//        System.out.println(a.balance);      // ERROR private
//    }
//}