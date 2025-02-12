package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome " );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Store store = context.getBean("storage" ,Store.class);
        System.out.println(store.getUserName());
    }
}
