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
        users.put(store.getUserName(), store.getAccountBalance());
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
        int selectedTransactionType;
        System.out.println("Please select transaction type using the index numbers");
        try{


            if(scan.hasNextInt() ){
                selectedTransactionType = scan.nextInt();
                if(selectedTransactionType > 0 && selectedTransactionType <4){
                    String key = getKeyByValue(transaction.getTransactions(),selectedTransactionType);
                    System.out.println("You Choose " + key);
                }
            }
            scan.close();
        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }






}
