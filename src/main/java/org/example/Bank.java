package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    Map<String ,Integer> users;
    private Store store;
    Scanner scan ;
    // Unparameterized constructor and getter
    public Bank(Store store){
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

    public void startTransacrtion(){
        System.out.println("Please Enter Your Acvcount Details");

        try{


        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }






}
