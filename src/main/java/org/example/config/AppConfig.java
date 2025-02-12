package org.example.config;

import org.example.Bank;
import org.example.Store;
import org.example.Transaction;
import org.springframework.context.annotation.Bean;

public class AppConfig {


    @Bean(name={"storage"})
    public Store store(){
        Store store = new Store();
        store.setUserName("Abdulbasit");
        store.setAccountBalance(56);
        return store;
    }



    @Bean(name = "transaction")
    public Transaction transaction(){
        return new Transaction();
    }


    @Bean (name = {"bank"})
    public Bank bank(Store store, Transaction transaction){
        return new Bank(store,transaction) ;
    }




}
