package org.example.config;

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
}
