package org.example;

public class Store {
    private String userName;
    private int accountBalance;



    // User Name setters and Getters
    public void setUserName(String userName){
        System.out.println("UserName Sets Succesfully");
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    // AccountName setters and getters

    public void setAccountBalance(int accountBalance){
        System.out.println("Account Number Sets Successfully");
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance(){
        return accountBalance;
    }

}
