package org.example.config;

import org.example.Bank;
import org.example.Store;
import org.springframework.context.annotation.Bean;

public class AppConfig {


    @Bean(name={"storage"})
    public Store store(){
        Store store = new Store();
        store.setUserName("Abdulbasit");
        store.setAccountBalance(56);
        return store;
    }

    @Bean (name = {"bank"})
    public Bank bank(Store store){
        return new Bank(store) ;
    }



}
