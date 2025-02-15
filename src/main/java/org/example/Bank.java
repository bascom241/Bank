package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    Map<String ,Integer> users;
    private Store store;
    Scanner scan = new Scanner(System.in);
    private Transaction transaction;
    // Unparameterized constructor and getter
    public Bank(Store store, Transaction transaction){
        this.transaction = transaction;
        this.store = store;
        this.users = new HashMap<>();
        users.put(store.getUserName().toLowerCase(), store.getAccountBalance());
    }


    public Map<String, Integer> getUsers(){
        return users;
    }

    // Setter and getter for Store Class //

    public Store getStore(){
        return store;
    }

    // Getting the Value of the transactions stored in Map //

    public static String getKeyByValue(Map<String, Integer> map, Integer value){
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue().equals(value))
                return entry.getKey();

        }
        return null;
    }






    public void startTransaction(){

        for(String transaction:transaction.getLoopedTransactions()){
            System.out.println(transaction);
        }
        int selectedTransactionType = 0;
        System.out.println("Please select transaction type using the index numbers");
        try {


            String key = null;

            if (scan.hasNextInt()) {
                selectedTransactionType = scan.nextInt();
                if (selectedTransactionType > 0 && selectedTransactionType < 4) {
                    key = getKeyByValue(transaction.getTransactions(), selectedTransactionType);
                    System.out.println("You Choose " + key);
                }
            }
            switch (key) {
                case "Deposit" -> {
                    scan.nextLine();
                    System.out.println("Please Enter Your account name");
                    String userName = scan.nextLine().toLowerCase();


                    if(users.containsKey(userName)){
                        int currentUserBalance = users.get(userName);
                        System.out.println("Please Enter Amount to be Deposited");
                        int amount = scan.nextInt();
                       if(amount != 0){
                             currentUserBalance += amount;
                             users.replace(userName,currentUserBalance);
                             System.out.println(users.get(userName));

                       }else{
                            System.out.println("Invalid Amount Entered");
                       }
                    }
                }
                case "Withdraw" -> {
                    scan.nextLine();
                    System.out.println("Please enter Your UserName ");
                    String userName = scan.nextLine().toLowerCase();

                    if(users.containsKey(userName)){
                        int currentUserBalance = users.get(userName);
                        System.out.println("Please Enter the amount to withdraw");
                        int amountToWithDraw = scan.nextInt();
                        if(currentUserBalance > amountToWithDraw){
                            currentUserBalance = currentUserBalance - amountToWithDraw;
                            users.replace(userName,currentUserBalance);
                            System.out.println("You have withdrawn " + amountToWithDraw);
                            System.out.println("You Balance is  " + users.get(userName));
                        }else{
                            System.out.println("Insufficient Funds");
                        }
                    }else{
                        System.out.println("We dont have your details in our database");
                    }




                }
            }
            scan.close();
        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }




}
