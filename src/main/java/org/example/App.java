package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome " );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Bank bank = context.getBean("bank", Bank.class);
        Map<String,Integer> users = bank.getUsers();
        users.forEach((key,value)-> {
            System.out.println("Account Holder " + ": " + key + " AccontBalance " + ": " + value);
        });
    }
}
